/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverPackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author maxamud
 */
@WebService(serviceName = "DiaryWebService")
public class DiaryWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "clientName")
    public String clientName(@WebParam(name = "clientName") String clientName) {
        return "Hello " + clientName + " !, Welcome to MaxDiary.com";
    }
    
        @WebMethod(operationName = "setDate")
    public String setDate(@WebParam(name = "setDate") String date) {
        return "This event happened on the:" + date;
    }
}
