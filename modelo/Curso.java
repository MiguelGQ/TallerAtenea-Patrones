package modelo;

/**
 * @author joush
 * @version 1.0
 * @created 13-sept.-2023 3:37:43 p.�m.
 */
public class Curso {

	private int cantidadEstudiantes;
	private String codigo;
	private Contratista docente;
	private String fechaFin;
	private String fechaInicio;
	private String nombreCurso;
	private Contratista tutor;

	public Curso() {
	}

	public String getCodigo() {
		return codigo;
	}

	public int getCantidadEstudiantes() {
		return cantidadEstudiantes;
	}

	public Contratista getDocente() {
		return docente;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public String getFechaIn() {
		return fechaInicio;
	}

	public Contratista getMonitor() {
		return tutor;
	}

	public String getNombre() {
		return nombreCurso;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setCantidadEstudiantes(int cant) {
		this.cantidadEstudiantes = cant;
	}

	public void setNombre(String nombre) {
		this.nombreCurso = nombre;
	}

	public void setDocente(Contratista docente) {
		this.docente = docente;
	}

	public void setMonitor(Contratista monitor) {
		this.tutor = monitor;
	}

	public void setFechaIn(String fechaIn) {
		this.fechaInicio = fechaIn;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
}// end Curso