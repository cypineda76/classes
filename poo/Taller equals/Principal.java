import java.util.*;
public class Principal{
public Principal(){
		Usuario andres= new Usuario();
		andres.setLogin("Andres");
		andres.setPassword("123");
	
Usuario usuario1= new Usuario();
usuario1.capturar();


		
//if (usuario1.login.equals(andres.login) && usuario1.password.equals(andres.password)){
if (usuario1.equals(andres)){
	System.out.println("...=====BIENVENIDO...===");
}		else{
	System.out.println("Usuario o clave incorrecta intente nuevamente");
}
	
}
public static void main(String args[]){
		Principal principal  = new Principal();
}
}