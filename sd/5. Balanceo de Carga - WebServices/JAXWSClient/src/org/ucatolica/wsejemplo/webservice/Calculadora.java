
package org.ucatolica.wsejemplo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculadora", targetNamespace = "http://webservice.wsejemplo.ucatolica.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculadora {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sumar", targetNamespace = "http://webservice.wsejemplo.ucatolica.org/", className = "org.ucatolica.wsejemplo.webservice.Sumar")
    @ResponseWrapper(localName = "sumarResponse", targetNamespace = "http://webservice.wsejemplo.ucatolica.org/", className = "org.ucatolica.wsejemplo.webservice.SumarResponse")
    @Action(input = "http://webservice.wsejemplo.ucatolica.org/Calculadora/sumarRequest", output = "http://webservice.wsejemplo.ucatolica.org/Calculadora/sumarResponse")
    public String sumar(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "restar", targetNamespace = "http://webservice.wsejemplo.ucatolica.org/", className = "org.ucatolica.wsejemplo.webservice.Restar")
    @ResponseWrapper(localName = "restarResponse", targetNamespace = "http://webservice.wsejemplo.ucatolica.org/", className = "org.ucatolica.wsejemplo.webservice.RestarResponse")
    @Action(input = "http://webservice.wsejemplo.ucatolica.org/Calculadora/restarRequest", output = "http://webservice.wsejemplo.ucatolica.org/Calculadora/restarResponse")
    public String restar(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplicar", targetNamespace = "http://webservice.wsejemplo.ucatolica.org/", className = "org.ucatolica.wsejemplo.webservice.Multiplicar")
    @ResponseWrapper(localName = "multiplicarResponse", targetNamespace = "http://webservice.wsejemplo.ucatolica.org/", className = "org.ucatolica.wsejemplo.webservice.MultiplicarResponse")
    @Action(input = "http://webservice.wsejemplo.ucatolica.org/Calculadora/multiplicarRequest", output = "http://webservice.wsejemplo.ucatolica.org/Calculadora/multiplicarResponse")
    public String multiplicar(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dividir", targetNamespace = "http://webservice.wsejemplo.ucatolica.org/", className = "org.ucatolica.wsejemplo.webservice.Dividir")
    @ResponseWrapper(localName = "dividirResponse", targetNamespace = "http://webservice.wsejemplo.ucatolica.org/", className = "org.ucatolica.wsejemplo.webservice.DividirResponse")
    @Action(input = "http://webservice.wsejemplo.ucatolica.org/Calculadora/dividirRequest", output = "http://webservice.wsejemplo.ucatolica.org/Calculadora/dividirResponse")
    public String dividir(
        @WebParam(name = "arg0", targetNamespace = "")
        Double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Double arg1);

}
