
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getListOrdersForResiliation complex type.
 * 
 * <p>Le fragment de sch?ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getListOrdersForResiliation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://manager.ws.resiliation.billcom.com/}getListOrdersRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListOrdersForResiliation", propOrder = {
    "arg0"
})
public class GetListOrdersForResiliation {

    protected GetListOrdersRequest arg0;

    /**
     * Obtient la valeur de la propri?t? arg0.
     * 
     * @return
     *     possible object is
     *     {@link GetListOrdersRequest }
     *     
     */
    public GetListOrdersRequest getArg0() {
        return arg0;
    }

    /**
     * D?finit la valeur de la propri?t? arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link GetListOrdersRequest }
     *     
     */
    public void setArg0(GetListOrdersRequest value) {
        this.arg0 = value;
    }

}
