package grupo6;

public class Persona {
	
	//atributos
	private int dni;
	private String nombre;
	private String apellido;
	
	//constructores
	public Persona() {
		dni= 11111111;
		nombre= "Sin nombre";
		apellido= "Sin apellido";
	}
	
	public Persona(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//getters y setters
	public int getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//método toString()
	public String toString() {
		return "DNI: " + dni + ", "+ "Nombre: " + nombre + ", " + "Apellido: " + apellido;
	}
}
