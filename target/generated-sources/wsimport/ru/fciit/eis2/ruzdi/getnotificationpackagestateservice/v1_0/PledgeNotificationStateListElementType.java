
package ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * структура вложения уведомления.
 *                     notificationId - id уведомления
 *                     documentAttachment - ссылки на MTOM вложения архивов бизнес-документов и подписей
 *                     notificationState - описание ошибок разбора документа при приеме.
 *                 
 * 
 * <p>Java class for pledgeNotificationStateListElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pledgeNotificationStateListElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationId" type="{http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0}guidType"/>
 *         &lt;choice>
 *           &lt;element name="documentAndSignature" type="{http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0}documentAndSignatureType"/>
 *           &lt;element name="notificationStateCode" type="{http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0}StateType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pledgeNotificationStateListElementType", propOrder = {
    "notificationId",
    "documentAndSignature",
    "notificationStateCode"
})
public class PledgeNotificationStateListElementType {

    @XmlElement(required = true)
    protected String notificationId;
    protected DocumentAndSignatureType documentAndSignature;
    protected StateType notificationStateCode;

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
     *     {@link DocumentAndSignatureType }
     *     
     */
    public DocumentAndSignatureType getDocumentAndSignature() {
        return documentAndSignature;
    }

    /**
     * Sets the value of the documentAndSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentAndSignatureType }
     *     
     */
    public void setDocumentAndSignature(DocumentAndSignatureType value) {
        this.documentAndSignature = value;
    }

    /**
     * Gets the value of the notificationStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getNotificationStateCode() {
        return notificationStateCode;
    }

    /**
     * Sets the value of the notificationStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setNotificationStateCode(StateType value) {
        this.notificationStateCode = value;
    }

}
