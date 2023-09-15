package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * @author joush
 * @version 1.0
 * @created 13-sept.-2023 3:37:44 p.�m.
 */
public class CursoDAO {

	private ArrayList<Curso> cursos;

	public CursoDAO() {
		cursos = new ArrayList<Curso>();
		cargarDatos();
	}

	public void cargarDatos() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			archivo = new File("resources/Archives/cursos.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] atributos = linea.split(",");
				Curso curso = new Curso();
				curso.setNombre(atributos[0]);
				curso.setCodigo(atributos[1]);
				curso.setCantidadEstudiantes(2);
				curso.setFechaFin(atributos[3]);
				curso.setFechaIn(atributos[4]);
				curso.setDocente(null);
				curso.setMonitor(null);
				cursos.add(curso);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void guardarDatos(Curso contratista) {
		try {
			File archivo = new File("resources/Archives/cursos.txt");

			FileWriter escribir = new FileWriter(archivo, true);

			escribir.write("\r\n");
			escribir.write(contratista.getNombre() + "," + contratista.getCodigo() + ","
					+ contratista.getCantidadEstudiantes() + "," + contratista.getFechaFin()
					+ "," + contratista.getFechaIn() + "," + contratista.getDocente() + "," + contratista.getMonitor());

			escribir.close();

		} catch (Exception e) {
			System.out.println("Error al escribir");
		}
	}

	/**
	 * 
	 * @param curso
	 */
	public boolean editarCurso(Curso curso) {
		return false;
	}
}// end CursoDAO