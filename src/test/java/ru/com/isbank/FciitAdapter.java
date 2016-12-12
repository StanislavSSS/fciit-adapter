package ru.com.isbank;

import ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.RuzdiGetNotificationPackageStateServiceV10;
import ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.RuzdiGetNotificationPackageStateServiceV10PortType;
import ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.v1_0.GetNotificationPackageStateRequestType;
import ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.v1_0.GetNotificationPackageStateResponseType;
import ru.fciit.eis2.ruzdi.uploadnotificationpackageservice.RuzdiUploadNotificationPackageServiceV10;
import ru.fciit.eis2.ruzdi.uploadnotificationpackageservice.RuzdiUploadNotificationPackageServiceV10PortType;
import ru.fciit.eis2.ruzdi.uploadnotificationpackageservice.v1_0.*;

import java.net.MalformedURLException;

/**
 * Created by sk10271 on 07.12.2016.
 */
public class FciitAdapter {

    final static String PATH = "C:/Temp/Pledge/";

    public UploadNotificationPackageResponseType uploadNotificationPackage (){
        RuzdiUploadNotificationPackageServiceV10 service = new RuzdiUploadNotificationPackageServiceV10();
        RuzdiUploadNotificationPackageServiceV10PortType portType = service.getRuzdiUploadNotificationPackageServiceV10HttpSoap11Endpoint();
        UploadNotificationPackageRequestType request = new
                ru.fciit.eis2.ruzdi.uploadnotificationpackageservice.v1_0.ObjectFactory().createUploadNotificationPackageRequestType();
        UploadNotificationPackageResponseType response = portType.uploadNotificationPackage(request);
        return response;
    }

    public void getNotifiactionsPackageState(String packageId) {
        RuzdiGetNotificationPackageStateServiceV10 service = new RuzdiGetNotificationPackageStateServiceV10();
        RuzdiGetNotificationPackageStateServiceV10PortType portType = service.getRuzdiGetNotificationPackageStateServiceV10HttpSoap11Endpoint();
        GetNotificationPackageStateRequestType request =
                new ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.v1_0.ObjectFactory().createGetNotificationPackageStateRequestType();
        request.setPackageId(packageId);
        GetNotificationPackageStateResponseType response = portType.getNotificationPackageState(request);
        response.getPackageState();
        response.getPledgeNotificationStatePackage();
    }

    public static void main (String[] args) throws MalformedURLException {
        //UUID notificationId = UUID.randomUUID();
        //System.out.print(notificationId.toString());
        //byte[] docAndSign;

        String s = "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 BGffItIBUEsFBgAAAAACAAIA+AAAABIHAAAAAA==";
        byte[] docAndSign = new byte[s.length()];
        docAndSign = s.getBytes();

        PledgeNotificationListElementType element = new PledgeNotificationListElementType();
        element.setNotificationId("4e7dcd2a-f599-4aa7-b732-8ae5bc4a42c7");
        element.setDocumentAndSignature(docAndSign);

        PledgeNotificationListType list = new PledgeNotificationListType();
        list.getPledgeNotificationListElement().add(element);

        PledgeNotificationPackageType pack = new PledgeNotificationPackageType();
        pack.setPledgeNotificationList(list);
        pack.setPackageId("6f2ba64e-b88e-4e53-b020-d8e5a9c94a8a");
        pack.setSenderType(String.valueOf(1));
        pack.setUip("1483254420660437618318586");

        UploadNotificationPackageRequestType upload = new UploadNotificationPackageRequestType();
        upload.setPledgeNotificationPackage(pack);

        RuzdiUploadNotificationPackageServiceV10 upl = new RuzdiUploadNotificationPackageServiceV10();
        RuzdiUploadNotificationPackageServiceV10PortType portType = upl.getRuzdiUploadNotificationPackageServiceV10HttpSoap11Endpoint();
        //RuzdiUploadNotificationPackageServiceV10PortType portType = upl.getPort(RuzdiUploadNotificationPackageServiceV10PortType.class);
        portType.uploadNotificationPackage(upload);

        //fa.uploadNotificationPackage();
        //fa.getNotifiactionsPackageState("6f2ba64e-b88e-4e53-b020-d8e5a9c94a8a");

        //System.out.print(UUID.randomUUID());


    }
}