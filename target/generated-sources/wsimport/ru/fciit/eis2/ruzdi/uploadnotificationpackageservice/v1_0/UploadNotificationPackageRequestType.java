
package ru.fciit.eis2.ruzdi.uploadnotificationpackageservice.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadNotificationPackageRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadNotificationPackageRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0}pledgeNotificationPackage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadNotificationPackageRequestType", propOrder = {
    "pledgeNotificationPackage"
})
public class UploadNotificationPackageRequestType {

    @XmlElement(required = true)
    protected PledgeNotificationPackageType pledgeNotificationPackage;

    /**
     * Gets the value of the pledgeNotificationPackage property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationPackageType }
     *     
     */
    public PledgeNotificationPackageType getPledgeNotificationPackage() {
        return pledgeNotificationPackage;
    }

    /**
     * Sets the value of the pledgeNotificationPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationPackageType }
     *     
     */
    public void setPledgeNotificationPackage(PledgeNotificationPackageType value) {
        this.pledgeNotificationPackage = value;
    }

}
