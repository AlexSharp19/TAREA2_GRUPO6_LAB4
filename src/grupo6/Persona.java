package grupo6;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
*/
public class Persona implements Comparable<Persona>{
	
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
	
		
	@Override
	public int compareTo(Persona objPersona) {
		if(objPersona.nombre.compareTo(this.nombre) < 0) {
			return -1;
		} else if (objPersona.nombre.compareTo(this.nombre) > 0) {
			return 1;
		} else {
			if(objPersona.apellido.compareTo(this.apellido) < 0) {
				return -1;
			} else if (objPersona.apellido.compareTo(this.apellido) > 0) {
				return 1;
			} else {
				if(objPersona.apellido.compareTo(this.apellido) < 0) {
					return -1;
				} else if (objPersona.apellido.compareTo(this.apellido) > 0) {
					return 1;
				} else {
					if(objPersona.dni == this.dni) {
						return 0;
					}
				}
			}
		}
		return -1;
	}
	
	//método toString()
	public String toString() {
		return "DNI: " + dni + ", "+ "Nombre: " + nombre + ", " + "Apellido: " + apellido;
	}
}
