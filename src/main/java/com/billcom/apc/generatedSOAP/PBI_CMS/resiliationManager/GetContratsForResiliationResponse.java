
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getContratsForResiliationResponse complex type.
 * 
 * <p>Le fragment de sch?ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getContratsForResiliationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://manager.ws.resiliation.billcom.com/}getContractsResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContratsForResiliationResponse", propOrder = {
    "_return"
})
public class GetContratsForResiliationResponse {

    @XmlElement(name = "return")
    protected GetContractsResponse _return;

    /**
     * Obtient la valeur de la propri?t? return.
     * 
     * @return
     *     possible object is
     *     {@link GetContractsResponse }
     *     
     */
    public GetContractsResponse getReturn() {
        return _return;
    }

    /**
     * D?finit la valeur de la propri?t? return.
     * 
     * @param value
     *     allowed object is
     *     {@link GetContractsResponse }
     *     
     */
    public void setReturn(GetContractsResponse value) {
        this._return = value;
    }

}
