package misServlets;

class Usuario {

	private String nombreUsuario;
	private String contrase�a;
	private String nombre;
	private String apellido;
	private String postal;
	
	public Usuario(String nombreUsuario, String contrase�a, String nombre, String apellido, String postal){
		this.nombreUsuario = nombreUsuario;
		this.contrase�a = contrase�a;
		this.nombre = nombre;
		this.apellido = apellido;
		this.postal = postal;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
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
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	
}   
