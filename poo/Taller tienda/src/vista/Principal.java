public class Principal{
	Cliente clientes[];
	
	public Principal(){
		clientes= new Cliente[3];
		clientes[0] = new Cliente("Diego","1");
		clientes[1] = new Cliente("Alberto", "2");
		clientes[2] = new Cliente("Otro", "3");
		
		
		Cliente.eliminar(clientes,3,"2");
		System.out.println("Ya borro Todo");
		
		System.out.println(clientes[0]);
		System.out.println(clientes[1]);
		System.out.println(clientes[2]);
	}
	
	public static void main(String args[]){
		Principal principal = new Principal();
	}
}