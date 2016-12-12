
package ru.fciit.eis2.ruzdi.uploadnotificationpackageservice.v1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.fciit.eis2.ruzdi.uploadnotificationpackageservice.v1_0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UploadNotificationPackageResponse_QNAME = new QName("http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0", "uploadNotificationPackageResponse");
    private final static QName _UploadNotificationPackageRequest_QNAME = new QName("http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0", "uploadNotificationPackageRequest");
    private final static QName _PledgeNotificationPackage_QNAME = new QName("http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0", "pledgeNotificationPackage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.fciit.eis2.ruzdi.uploadnotificationpackageservice.v1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadNotificationPackageRequestType }
     * 
     */
    public UploadNotificationPackageRequestType createUploadNotificationPackageRequestType() {
        return new UploadNotificationPackageRequestType();
    }

    /**
     * Create an instance of {@link UploadNotificationPackageResponseType }
     * 
     */
    public UploadNotificationPackageResponseType createUploadNotificationPackageResponseType() {
        return new UploadNotificationPackageResponseType();
    }

    /**
     * Create an instance of {@link PledgeNotificationPackageType }
     * 
     */
    public PledgeNotificationPackageType createPledgeNotificationPackageType() {
        return new PledgeNotificationPackageType();
    }

    /**
     * Create an instance of {@link StateType }
     * 
     */
    public StateType createStateType() {
        return new StateType();
    }

    /**
     * Create an instance of {@link PledgeNotificationListElementType }
     * 
     */
    public PledgeNotificationListElementType createPledgeNotificationListElementType() {
        return new PledgeNotificationListElementType();
    }

    /**
     * Create an instance of {@link PledgeNotificationListType }
     * 
     */
    public PledgeNotificationListType createPledgeNotificationListType() {
        return new PledgeNotificationListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadNotificationPackageResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0", name = "uploadNotificationPackageResponse")
    public JAXBElement<UploadNotificationPackageResponseType> createUploadNotificationPackageResponse(UploadNotificationPackageResponseType value) {
        return new JAXBElement<UploadNotificationPackageResponseType>(_UploadNotificationPackageResponse_QNAME, UploadNotificationPackageResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadNotificationPackageRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0", name = "uploadNotificationPackageRequest")
    public JAXBElement<UploadNotificationPackageRequestType> createUploadNotificationPackageRequest(UploadNotificationPackageRequestType value) {
        return new JAXBElement<UploadNotificationPackageRequestType>(_UploadNotificationPackageRequest_QNAME, UploadNotificationPackageRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PledgeNotificationPackageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0", name = "pledgeNotificationPackage")
    public JAXBElement<PledgeNotificationPackageType> createPledgeNotificationPackage(PledgeNotificationPackageType value) {
        return new JAXBElement<PledgeNotificationPackageType>(_PledgeNotificationPackage_QNAME, PledgeNotificationPackageType.class, null, value);
    }

}
