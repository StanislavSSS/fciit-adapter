
package ru.fciit.eis2.ruzdi.uploadnotificationpackageservice.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     Статус по приему пакета уведомлений.
 *                     registrationId - регистрационный идентификатор пакета в системе в случае успешного приема
 *                     packageStateCode - статус обработки
 *                 
 * 
 * <p>Java class for uploadNotificationPackageResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadNotificationPackageResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registrationId" type="{http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0}guidType" minOccurs="0"/>
 *         &lt;element name="packageStateCode" type="{http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0}StateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadNotificationPackageResponseType", propOrder = {
    "registrationId",
    "packageStateCode"
})
public class UploadNotificationPackageResponseType {

    protected String registrationId;
    @XmlElement(required = true)
    protected StateType packageStateCode;

    /**
     * Gets the value of the registrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Sets the value of the registrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationId(String value) {
        this.registrationId = value;
    }

    /**
     * Gets the value of the packageStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getPackageStateCode() {
        return packageStateCode;
    }

    /**
     * Sets the value of the packageStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setPackageStateCode(StateType value) {
        this.packageStateCode = value;
    }

}
