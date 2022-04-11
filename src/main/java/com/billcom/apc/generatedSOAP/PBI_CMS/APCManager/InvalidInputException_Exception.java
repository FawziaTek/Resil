
package com.billcom.apc.generatedSOAP.PBI_CMS.APCManager;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.11
 * 2021-03-18T12:52:04.477+01:00
 * Generated source version: 3.1.11
 */

@WebFault(name = "InvalidInputException", targetNamespace = "http://manager.ws.apc.billcom.com/")
public class InvalidInputException_Exception extends Exception {
    
    private com.billcom.apc.generatedSOAP.PBI_CMS.APCManager.InvalidInputException invalidInputException;

    public InvalidInputException_Exception() {
        super();
    }
    
    public InvalidInputException_Exception(String message) {
        super(message);
    }
    
    public InvalidInputException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputException_Exception(String message, com.billcom.apc.generatedSOAP.PBI_CMS.APCManager.InvalidInputException invalidInputException) {
        super(message);
        this.invalidInputException = invalidInputException;
    }

    public InvalidInputException_Exception(String message, com.billcom.apc.generatedSOAP.PBI_CMS.APCManager.InvalidInputException invalidInputException, Throwable cause) {
        super(message, cause);
        this.invalidInputException = invalidInputException;
    }

    public com.billcom.apc.generatedSOAP.PBI_CMS.APCManager.InvalidInputException getFaultInfo() {
        return this.invalidInputException;
    }
}
