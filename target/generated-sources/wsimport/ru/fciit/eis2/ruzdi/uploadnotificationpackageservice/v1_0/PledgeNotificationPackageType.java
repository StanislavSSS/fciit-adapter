
package ru.fciit.eis2.ruzdi.uploadnotificationpackageservice.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     Пакет уведомлений.
 *                     packageId - Уникальный идентификатор пакета (guid)
 *                     uip - Уникальный идентификатор плательщика. В случае отправки пакета с портала не заполяется.
 *                     senderType - тип заявителя
 *                     pledgeNotificationList - список файлов уведомлений.
 *                 
 * 
 * <p>Java class for pledgeNotificationPackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pledgeNotificationPackageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageId" type="{http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0}guidType"/>
 *         &lt;element name="uip" type="{http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0}uipType" minOccurs="0"/>
 *         &lt;element name="senderType" type="{http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0}senderTypeType"/>
 *         &lt;element name="pledgeNotificationList" type="{http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0}pledgeNotificationListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pledgeNotificationPackageType", propOrder = {
    "packageId",
    "uip",
    "senderType",
    "pledgeNotificationList"
})
public class PledgeNotificationPackageType {

    @XmlElement(required = true)
    protected String packageId;
    protected String uip;
    @XmlElement(required = true)
    protected String senderType;
    @XmlElement(required = true)
    protected PledgeNotificationListType pledgeNotificationList;

    /**
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageId(String value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the uip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUip() {
        return uip;
    }

    /**
     * Sets the value of the uip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUip(String value) {
        this.uip = value;
    }

    /**
     * Gets the value of the senderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderType() {
        return senderType;
    }

    /**
     * Sets the value of the senderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderType(String value) {
        this.senderType = value;
    }

    /**
     * Gets the value of the pledgeNotificationList property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationListType }
     *     
     */
    public PledgeNotificationListType getPledgeNotificationList() {
        return pledgeNotificationList;
    }

    /**
     * Sets the value of the pledgeNotificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationListType }
     *     
     */
    public void setPledgeNotificationList(PledgeNotificationListType value) {
        this.pledgeNotificationList = value;
    }

}
