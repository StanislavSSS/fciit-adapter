
package ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="documentTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Notification"/>
 *     &lt;enumeration value="RegistrationCertificate"/>
 *     &lt;enumeration value="RegistrationRejection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "documentTypeType")
@XmlEnum
public enum DocumentTypeType {

    @XmlEnumValue("Notification")
    NOTIFICATION("Notification"),
    @XmlEnumValue("RegistrationCertificate")
    REGISTRATION_CERTIFICATE("RegistrationCertificate"),
    @XmlEnumValue("RegistrationRejection")
    REGISTRATION_REJECTION("RegistrationRejection");
    private final String value;

    DocumentTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentTypeType fromValue(String v) {
        for (DocumentTypeType c: DocumentTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
