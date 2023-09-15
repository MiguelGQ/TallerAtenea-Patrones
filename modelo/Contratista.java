package modelo;

/**
 * @author joush
 * @version 1.0
 * @created 13-sept.-2023 3:37:34 p.�m.
 */
public class Contratista {

	private String correo;
	private int horasLaborales;
	private String nombre;
	private String rolContratista;
	private double salario;
	private String telefono;

	public Contratista() {
	}

	public String getCorreo() {
		return correo;
	}

	public int getHorasLaborales() {
		return horasLaborales;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public double getSalario() {
		return salario;
	}

	public String getRolContratista() {
		return rolContratista;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setHorasLaborales(int horasLaborales) {
		this.horasLaborales = horasLaborales;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setRol(String Rol) {
		this.rolContratista = Rol;
	}

}// end Contratista