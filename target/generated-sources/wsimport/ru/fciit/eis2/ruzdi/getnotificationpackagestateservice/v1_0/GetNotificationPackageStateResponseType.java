
package ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNotificationPackageStateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNotificationPackageStateResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageState" type="{http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0}packageStateType"/>
 *         &lt;element name="pledgeNotificationStatePackage" type="{http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0}pledgeNotificationStatePackageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNotificationPackageStateResponseType", propOrder = {
    "packageState",
    "pledgeNotificationStatePackage"
})
public class GetNotificationPackageStateResponseType {

    @XmlElement(required = true)
    protected PackageStateType packageState;
    protected PledgeNotificationStatePackageType pledgeNotificationStatePackage;

    /**
     * Gets the value of the packageState property.
     * 
     * @return
     *     possible object is
     *     {@link PackageStateType }
     *     
     */
    public PackageStateType getPackageState() {
        return packageState;
    }

    /**
     * Sets the value of the packageState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageStateType }
     *     
     */
    public void setPackageState(PackageStateType value) {
        this.packageState = value;
    }

    /**
     * Gets the value of the pledgeNotificationStatePackage property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationStatePackageType }
     *     
     */
    public PledgeNotificationStatePackageType getPledgeNotificationStatePackage() {
        return pledgeNotificationStatePackage;
    }

    /**
     * Sets the value of the pledgeNotificationStatePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationStatePackageType }
     *     
     */
    public void setPledgeNotificationStatePackage(PledgeNotificationStatePackageType value) {
        this.pledgeNotificationStatePackage = value;
    }

}
