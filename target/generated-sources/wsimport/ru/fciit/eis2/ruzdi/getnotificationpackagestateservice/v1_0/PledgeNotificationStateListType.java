
package ru.fciit.eis2.ruzdi.getnotificationpackagestateservice.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     набор документов ответов/статусов по каждому уведомлению. В соответствии с требованиями максимальное
 *                     количество уведомлений в пакете 20
 *                 
 * 
 * <p>Java class for pledgeNotificationStateListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pledgeNotificationStateListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pledgeNotificationStateListElement" type="{http://fciit.ru/eis2/ruzdi/getNotificationPackageStateService/v1_0}pledgeNotificationStateListElementType" maxOccurs="20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pledgeNotificationStateListType", propOrder = {
    "pledgeNotificationStateListElement"
})
public class PledgeNotificationStateListType {

    @XmlElement(required = true)
    protected List<PledgeNotificationStateListElementType> pledgeNotificationStateListElement;

    /**
     * Gets the value of the pledgeNotificationStateListElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pledgeNotificationStateListElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPledgeNotificationStateListElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PledgeNotificationStateListElementType }
     * 
     * 
     */
    public List<PledgeNotificationStateListElementType> getPledgeNotificationStateListElement() {
        if (pledgeNotificationStateListElement == null) {
            pledgeNotificationStateListElement = new ArrayList<PledgeNotificationStateListElementType>();
        }
        return this.pledgeNotificationStateListElement;
    }

}
