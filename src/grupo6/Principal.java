package grupo6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		
		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
		FileReader entrada;
		try{
			entrada = new FileReader("./src/PersonasEmpresa.txt");
			BufferedReader miBuffer = new BufferedReader(entrada);
			String linea = "";
			while ((linea = miBuffer.readLine()) != null) {
				Persona per = new Persona();
				String lineaSeparada[] = linea.split("-");
				per.setNombre(lineaSeparada[0]);
				per.setApellido(lineaSeparada[1]);
				per.setDni(Integer.parseInt(lineaSeparada[2]));
				listaPersonas.add(per);
			}
			miBuffer.close();
			entrada.close();
		} catch (IOException e) {
			System.out.println("No se encontró el archivo.");
		}
		for (Persona per : listaPersonas) {
			System.out.println(per.toString());
		}
		
	}
}
