
package com.billcom.apc.ws.manager;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.11
 * 2021-07-28T15:25:44.724+01:00
 * Generated source version: 3.1.11
 */

@WebFault(name = "InvalidInputException", targetNamespace = "http://manager.ws.apc.billcom.com/")
public class InvalidInputException_Exception extends Exception {
    
    private com.billcom.apc.ws.manager.InvalidInputException invalidInputException;

    public InvalidInputException_Exception() {
        super();
    }
    
    public InvalidInputException_Exception(String message) {
        super(message);
    }
    
    public InvalidInputException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputException_Exception(String message, com.billcom.apc.ws.manager.InvalidInputException invalidInputException) {
        super(message);
        this.invalidInputException = invalidInputException;
    }

    public InvalidInputException_Exception(String message, com.billcom.apc.ws.manager.InvalidInputException invalidInputException, Throwable cause) {
        super(message, cause);
        this.invalidInputException = invalidInputException;
    }

    public com.billcom.apc.ws.manager.InvalidInputException getFaultInfo() {
        return this.invalidInputException;
    }
}
