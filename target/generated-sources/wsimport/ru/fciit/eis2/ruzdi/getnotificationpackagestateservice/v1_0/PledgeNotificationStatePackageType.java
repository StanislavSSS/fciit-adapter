
package ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     Структура ответа по пакету уведомлений.
 *                     packageId - Уникальный идентификатор пакета (guid)
 *                     uip - Уникальный идентификатор плательщика. В случае отправки пакета с портала заполнен 0.
 *                 
 * 
 * <p>Java class for pledgeNotificationStatePackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pledgeNotificationStatePackageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageId" type="{http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0}guidType"/>
 *         &lt;element name="uip" type="{http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0}uipType"/>
 *         &lt;element name="packageStateCode" type="{http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0}StateType" minOccurs="0"/>
 *         &lt;element name="pledgeNotificationStateList" type="{http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0}pledgeNotificationStateListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pledgeNotificationStatePackageType", propOrder = {
    "packageId",
    "uip",
    "packageStateCode",
    "pledgeNotificationStateList"
})
public class PledgeNotificationStatePackageType {

    @XmlElement(required = true)
    protected String packageId;
    @XmlElement(required = true)
    protected String uip;
    protected StateType packageStateCode;
    protected PledgeNotificationStateListType pledgeNotificationStateList;

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

    /**
     * Gets the value of the pledgeNotificationStateList property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationStateListType }
     *     
     */
    public PledgeNotificationStateListType getPledgeNotificationStateList() {
        return pledgeNotificationStateList;
    }

    /**
     * Sets the value of the pledgeNotificationStateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationStateListType }
     *     
     */
    public void setPledgeNotificationStateList(PledgeNotificationStateListType value) {
        this.pledgeNotificationStateList = value;
    }

}
