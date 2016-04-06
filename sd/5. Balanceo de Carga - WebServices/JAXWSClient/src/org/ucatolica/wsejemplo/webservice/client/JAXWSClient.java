package org.ucatolica.wsejemplo.webservice.client;

import org.ucatolica.wsejemplo.webservice.Calculadora;
import org.ucatolica.wsejemplo.webservice.CalculadoraImplService;

public class JAXWSClient {

	public static void main(String[] args) {
		CalculadoraImplService calculadoraService = new CalculadoraImplService();  
        Calculadora calculadora = calculadoraService.getCalculadoraImplPort();  
        System.out.println(calculadora.sumar(5,3));
        System.out.println(calculadora.restar(10,9)); 
        System.out.println(calculadora.dividir(10.0,3.0)); 
        System.out.println(calculadora.multiplicar(3,8)); 

	}

}
