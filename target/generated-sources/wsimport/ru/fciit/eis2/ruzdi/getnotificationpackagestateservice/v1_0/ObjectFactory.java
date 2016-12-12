
package ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.v1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.v1_0 package. 
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

    private final static QName _GetNotificationPackageStateResponse_QNAME = new QName("http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0", "getNotificationPackageStateResponse");
    private final static QName _GetNotificationPackageStateRequest_QNAME = new QName("http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0", "getNotificationPackageStateRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.v1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNotificationPackageStateResponseType }
     * 
     */
    public GetNotificationPackageStateResponseType createGetNotificationPackageStateResponseType() {
        return new GetNotificationPackageStateResponseType();
    }

    /**
     * Create an instance of {@link GetNotificationPackageStateRequestType }
     * 
     */
    public GetNotificationPackageStateRequestType createGetNotificationPackageStateRequestType() {
        return new GetNotificationPackageStateRequestType();
    }

    /**
     * Create an instance of {@link DocumentAndSignatureType }
     * 
     */
    public DocumentAndSignatureType createDocumentAndSignatureType() {
        return new DocumentAndSignatureType();
    }

    /**
     * Create an instance of {@link PledgeNotificationStateListType }
     * 
     */
    public PledgeNotificationStateListType createPledgeNotificationStateListType() {
        return new PledgeNotificationStateListType();
    }

    /**
     * Create an instance of {@link PledgeNotificationStateListElementType }
     * 
     */
    public PledgeNotificationStateListElementType createPledgeNotificationStateListElementType() {
        return new PledgeNotificationStateListElementType();
    }

    /**
     * Create an instance of {@link StateType }
     * 
     */
    public StateType createStateType() {
        return new StateType();
    }

    /**
     * Create an instance of {@link PledgeNotificationStatePackageType }
     * 
     */
    public PledgeNotificationStatePackageType createPledgeNotificationStatePackageType() {
        return new PledgeNotificationStatePackageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationPackageStateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0", name = "getNotificationPackageStateResponse")
    public JAXBElement<GetNotificationPackageStateResponseType> createGetNotificationPackageStateResponse(GetNotificationPackageStateResponseType value) {
        return new JAXBElement<GetNotificationPackageStateResponseType>(_GetNotificationPackageStateResponse_QNAME, GetNotificationPackageStateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationPackageStateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0", name = "getNotificationPackageStateRequest")
    public JAXBElement<GetNotificationPackageStateRequestType> createGetNotificationPackageStateRequest(GetNotificationPackageStateRequestType value) {
        return new JAXBElement<GetNotificationPackageStateRequestType>(_GetNotificationPackageStateRequest_QNAME, GetNotificationPackageStateRequestType.class, null, value);
    }

}
