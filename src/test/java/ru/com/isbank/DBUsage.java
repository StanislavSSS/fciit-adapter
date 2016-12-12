package ru.com.isbank;

import java.sql.*;
import java.util.UUID;

/**
 * Created by sk10271 on 08.12.2016.
 */
public class DBUsage {
    private static Connection con = null;
    private static String username = "fciit_adapter";
    private static String password = "pledges";
    private static String URL = "jdbc:sqlserver://SRV-DBMSSQLTST0";

    /*
    test:
    public static void main(String[] args) throws SQLException {
        UUID NotificationId = UUID.randomUUID()
                , PackageID = UUID.randomUUID()
                ,       Uip = UUID.randomUUID();
        int RegistrationID = 1, Code = 1;
        String Message = "test";

        insertNotificationInfo(NotificationId, PackageID, Uip);
        insertNotificationInfo(NotificationId, RegistrationID, Code, Message);
    }*/

    public static void insertNotificationInfo(UUID NotificationId, UUID PackageID, UUID Uip, int RegistrationID, int Code, String Message
    ) throws SQLException {
        con = DriverManager.getConnection(URL, username, password);
        if(con!=null) System.out.println("Connection Successful !\n");
        if (con==null) System.exit(0);

        System.out.println("NotificationId " + NotificationId);
        System.out.println("PackageID " + PackageID);
        System.out.println("Uip " + Uip);
        System.out.println("RegistrationID " + RegistrationID);
        System.out.println("Code " + Code);
        System.out.println("Message " + Message);
        System.out.println("User " + username);

        CallableStatement cstmt = con.prepareCall("SET NOCOUNT ON\n" +
                "\n" +
                "DECLARE @Retval                 INT = 0\n" +
                "       ,@ErrorMessage           VARCHAR(MAX)\n" +
                "\n" +
                "EXEC WORKDB_COPY.DBO.ISB_PledgeNotificationInsert\n" +
                "        @NotificationId         = ?\n" + //1
                "       ,@DocumentAndSignature   = ?\n" + //2
                "       ,@PackageId              = ?\n" + //3
                "       ,@Uip                    = ?\n" + //4
                "       ,@RegistrationID         = ?\n" + //5
                "       ,@Code                   = ?\n" + //6
                "       ,@Message                = ?\n" + //7
                "       ,@UserName               = ?\n" + //8
                "       ,@Retval                 = ?\n" + //9
                "       ,@ErrorMessage           = ?\n"); //10

        cstmt.setString(1, String.valueOf(NotificationId));
        cstmt.setString(2, "");
        cstmt.setString(3, String.valueOf(PackageID));
        cstmt.setString(4, String.valueOf(Uip));
        cstmt.setString(5, String.valueOf(RegistrationID));
        cstmt.setInt(6, Code);
        cstmt.setString(7,Message);
        cstmt.setString(8,username);
        cstmt.registerOutParameter(9, Types.INTEGER);
        cstmt.registerOutParameter(10, Types.VARCHAR);
        cstmt.execute();
        System.out.print("Retval...." + cstmt.getInt(9));
        if (cstmt.getInt(9) != 0){
            System.out.print("ERROR!!! Retval " + cstmt.getInt(9) + " Message " + cstmt.getString(10));
        }
    }
    /*
    * Insert 1st info about pledges which was sent
    * */
    public static void insertNotificationInfo (UUID NotificationId, UUID PackageID, UUID Uip) throws SQLException {
        insertNotificationInfo(NotificationId, PackageID, Uip, 0, 0, "");
    }

    /*
    * Update info about pledge - 1st answer from FCIIT
    * */
    public static void insertNotificationInfo (UUID NotificationId, int RegistrationID, int Code, String Message) throws SQLException {
        insertNotificationInfo(NotificationId, UUID.randomUUID(), UUID.randomUUID(), RegistrationID, Code, Message);
    }
}

