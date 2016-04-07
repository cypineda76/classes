import java.util.Scanner;
 
 public class Cliente{
	private String nombre;
	private String apellido;
	private String direccion;
	private String codigo;
	private String telefono;
	
	public Cliente(){
		this.nombre = "";
		this.codigo = "";
		this.apellido = "";
		this.direccion= "";
		this.telefono = "";
	}
	
	public Cliente(String nombre, String codigo){
		this.nombre = nombre;
		this.apellido = "";
		this.direccion = "";
		this.codigo = codigo;
		this.telefono = "";
	}
	
	public Cliente(String nombre, String apellido, String direccion, String codigo, String telefono){
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.codigo = codigo;
		this.telefono = telefono;
	}
		
	public void capturar(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite su nombre");
		nombre = scanner.nextLine();
		System.out.print("Digite su Apellido");
		apellido = scanner.nextLine();
		System.out.print("Digite su Direccion");
		direccion = scanner.nextLine();
		System.out.print("Digite su codigo");
		codigo = scanner.nextLine();
		System.out.print("Digite su telefono");
		telefono = scanner.nextLine();
	}
	
	public void impresion(){
		System.out.println(this);
	}
	
	public static void eliminar(Cliente[] clientes, int cantidadClientes, String codigo){
		for (int i = 0 ; i<cantidadClientes;i++){
			if(clientes[i].codigo.equals(codigo)){
				for(int j=i; j<cantidadClientes - 1;j++){
					clientes[j] = clientes[j + 1];
				}
				clientes[cantidadClientes - 1 ] = null;
				break;
			}
		}
	}
	public static void eliminarTodos(Cliente[] clientes){
		clientes = null;
	}
	
	public static void modificar(Cliente[] clientes, int cantidadClientes, String codigo){
		for (int i = 0 ; i<cantidadClientes;i++){
			if(clientes[i].codigo.equals(codigo)){
				clientes[i].capturar();
			}
		}
	}
	
	public boolean equals(Cliente cliente){
		if (this.getCodigo().equals(cliente.getCodigo())){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		String cadena= "";
		cadena+= "..::: Datos del Cliente :::..\n";
		cadena+= "Nombre:\t"+ nombre +" "+ apellido+"\n";
		cadena+= "Codigo:\t" + codigo +"\n";
		cadena+= "Direccion:\t"+ direccion +"\n";
		cadena+= "Telefono:\t" + telefono + "\n";
		cadena+= "..::: Fin del Cliente :::..\n";
		return cadena;
	}		
	
	/**Getters y Setters**/
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}