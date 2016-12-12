
package ru.fciit.eis2.ruzdi.uploadnotificationpackageservice.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     набор уведомлений. В соответствии с требованиями максимальное количество уведомлений в пакете 20
 *                 
 * 
 * <p>Java class for pledgeNotificationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pledgeNotificationListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pledgeNotificationListElement" type="{http://fciit.ru/eis2/ruzdi/uploadNotificationPackageService/v1_0}pledgeNotificationListElementType" maxOccurs="20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pledgeNotificationListType", propOrder = {
    "pledgeNotificationListElement"
})
public class PledgeNotificationListType {

    @XmlElement(required = true)
    protected List<PledgeNotificationListElementType> pledgeNotificationListElement;

    /**
     * Gets the value of the pledgeNotificationListElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pledgeNotificationListElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPledgeNotificationListElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PledgeNotificationListElementType }
     * 
     * 
     */
    public List<PledgeNotificationListElementType> getPledgeNotificationListElement() {
        if (pledgeNotificationListElement == null) {
            pledgeNotificationListElement = new ArrayList<PledgeNotificationListElementType>();
        }
        return this.pledgeNotificationListElement;
    }
}