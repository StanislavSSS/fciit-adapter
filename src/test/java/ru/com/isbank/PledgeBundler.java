package ru.com.isbank;

import java.io.*;
import java.util.Arrays;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by sk10271 on 09.12.2016.
 */

/*
    Test:
    public static void main (String[] args){
        PledgeBundler p = new PledgeBundler("C:\\Temp\\4\\");
        p.renameFiles();
        p.bundle();
    }
 */
public class PledgeBundler {

    private static final int BUFFER = 2048;
    private String pathname;
    private File folder;
    private String[] files;
    private String[] newFiles;

    public PledgeBundler(String pathname) {
        this.pathname = pathname;
        this.folder = new File(pathname);

        if (!folder.exists()){
            throw new NullPointerException("Invalid directory " + pathname);
        }

        files = folder.list();

        if (files.length != 2){
            throw new NullPointerException("There are mote/less then 2 files in " + pathname);
        }

        String checkExtansions = Arrays.toString(files);

        if(!checkExtansions.contains(".xml.sig")){
            throw new NullPointerException("There aren't *.xml.sig file in " + pathname);
        }

        if(!checkExtansions.replace(".xml.sig", "").contains(".xml")){
            throw new NullPointerException("There aren't *.xml files in " + pathname);
        }
    }

    private void renameFiles() {
        this.renameFiles(UUID.randomUUID().toString().toUpperCase());
    }

    public String getPathname() {
        return pathname;
    }

    public File getFolder() {
        return folder;
    }

    public String[] getFiles() {
        return files;
    }

    public String[] getNewFiles() {
        return newFiles;
    }

    public String renameFiles (String uuid){
        if(uuid == "" || uuid.equals("")){
            uuid = UUID.randomUUID().toString().toUpperCase();
        }

        String extension;

        for (String fileName : files){
            try {
                File file = new File(pathname+fileName);

                if (fileName.contains(".")){
                    extension = fileName.substring(fileName.indexOf("."), fileName.length());
                }
                else {
                    throw new NullPointerException("There're some files without extension in " + pathname);
                }
                File newFile = new File(pathname + uuid + extension);
                if(!file.renameTo(newFile)){
                    throw new FileNotFoundException("Cann't rename file " + file + " to " + newFile);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

        this.newFiles = folder.list();

        return uuid;
    }

    public String bundle() {
        String archiveName = UUID.randomUUID().toString().toUpperCase();

        try {
            BufferedInputStream origin;
            FileOutputStream dest = new FileOutputStream(pathname + archiveName + ".zip");
            ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest));
            byte data[] = new byte[BUFFER];

            // get a list of files from current directory
            for (int i=0; i<newFiles.length; i++) {
                System.out.println("Adding: "+newFiles[i]);
                FileInputStream fi = new FileInputStream(pathname + newFiles[i]);
                origin = new  BufferedInputStream(fi, BUFFER);
                ZipEntry entry = new ZipEntry(newFiles[i]);
                out.putNextEntry(entry);
                int count;
                while((count = origin.read(data, 0, BUFFER)) != -1){
                    out.write(data, 0, count);
                }
                origin.close();
            }
            out.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        return archiveName;
    }
}