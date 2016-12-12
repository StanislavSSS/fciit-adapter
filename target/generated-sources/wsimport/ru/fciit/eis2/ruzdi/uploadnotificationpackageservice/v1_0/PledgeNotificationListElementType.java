
package ru.fciit.eis2.ruzdi.uploadnotificationpackageservice.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * структура вложения уведомления.
 *                     notificationId - id уведомления
 *                     documentAndSignature - ссылка на MTOM вложение zip архива бизнес-документа и подписи.
 *                     Файл бизнес-документа по схеме PledgeRegistry_v2.1.24_public.xsd, подпись в формате CADES.
 *                     Имена файлов в архиве {notificationId}.xml и {notificationId}.xml.sig
 *                 
 * 
 * <p>Java class for pledgeNotificationListElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pledgeNotificationListElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationId" type="{http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0}guidType"/>
 *         &lt;element name="documentAndSignature" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pledgeNotificationListElementType", propOrder = {
    "notificationId",
    "documentAndSignature"
})
public class PledgeNotificationListElementType {

    @XmlElement(required = true)
    protected String notificationId;
    @XmlElement(required = true)
    protected byte[] documentAndSignature;

    /**
     * Gets the value of the notificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationId() {
        return notificationId;
    }

    /**
     * Sets the value of the notificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationId(String value) {
        this.notificationId = value;
    }

    /**
     * Gets the value of the documentAndSignature property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocumentAndSignature() {
        return documentAndSignature;
    }

    /**
     * Sets the value of the documentAndSignature property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocumentAndSignature(byte[] value) {
        this.documentAndSignature = value;
    }

}
