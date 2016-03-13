import java.util.*;
public class Usuario{
	private String login;
	private String password;
	
	public Usuario(){
		login = "";
		password = "";
	}
	
	public String toString(){
		return "";
	}
	
	public boolean equals(Usuario usuario){
		boolean resultado = false;
		if (this.login.equals(usuario.getLogin()) && this.password.equals(usuario.getPassword())){
			resultado = true;
		}else{
			resultado = false;
		}
		return resultado;
	}

	public void capturar(){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese nombre de usuario");
		login=scanner.nextLine();
		System.out.println("ingrese clave");
		password=scanner.nextLine();
	}
	
	public String getLogin(){
		return this.login;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setLogin(String login){
		this.login = login;
	}
	public void setPassword(String password){
		this.password = password;
	}
}