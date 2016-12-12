
package ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packageStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="packageStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RECIEVED"/>
 *     &lt;enumeration value="INCONTROL"/>
 *     &lt;enumeration value="PAYMENTWAITING"/>
 *     &lt;enumeration value="FAULT"/>
 *     &lt;enumeration value="INWORK"/>
 *     &lt;enumeration value="RESULT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "packageStateType")
@XmlEnum
public enum PackageStateType {

    RECIEVED,
    INCONTROL,
    PAYMENTWAITING,
    FAULT,
    INWORK,
    RESULT;

    public String value() {
        return name();
    }

    public static PackageStateType fromValue(String v) {
        return valueOf(v);
    }

}
