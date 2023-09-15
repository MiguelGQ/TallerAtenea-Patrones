package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * @author joush
 * @version 1.0
 * @created 13-sept.-2023 3:37:39 p.�m.
 */
public class ContratistaDAO {

	private ArrayList<Contratista> contratistas;

	public ContratistaDAO() {
		contratistas = new ArrayList<Contratista>();
		cargarDatos();
	}

	public void cargarDatos() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			archivo = new File("resources/Archives/contratistas.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] atributos = linea.split(",");
				Contratista contratista = new Contratista();
				contratista.setNombre(atributos[0]);
				contratista.setRol(atributos[1]);
				contratista.setSalario(2);
				contratista.setCorreo(atributos[3]);
				contratista.setTelefono(atributos[4]);
				contratista.setHorasLaborales(5);
				contratistas.add(contratista);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void guardarDatos(Contratista contratista) {
		try {
			File archivo = new File("resources/Archives/contratistas.txt");

			FileWriter escribir = new FileWriter(archivo, true);

			escribir.write("\r\n");
			escribir.write(contratista.getNombre() + "," + contratista.getRolContratista() + ","
					+ contratista.getSalario() + "," + contratista.getCorreo()
					+ "," + contratista.getTelefono() + "," + contratista.getHorasLaborales());

			escribir.close();

		} catch (Exception e) {
			System.out.println("Error al escribir");
		}
	}

	/**
	 * 
	 * @param contratista
	 */
	public boolean modificarContratista(Contratista contratista) {
		return false;
	}

	public ArrayList<Contratista> getContratistas() {
		return contratistas;
	}
}// end ContratistaDAO