package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Curso;
import modelo.CursoDAO;
import vista.VistaRegistroCurso;

/**
 * @author joush
 * @version 1.0
 * @created 13-sept.-2023 3:37:42 p.�m.
 */
public class ControladorRegistroCurso implements ActionListener {

	private Curso curso;
	private CursoDAO cursoDAO;
	private VistaRegistroCurso vistaTemplate;
	private ControladorVistaPrincipal vistaPrincipal;

	public ControladorRegistroCurso(ControladorVistaPrincipal vistaPrincipal) {
		this.vistaTemplate = new VistaRegistroCurso(this);
		cursoDAO = new CursoDAO();
		this.vistaPrincipal = vistaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vistaTemplate.getbSalir()) {
			System.exit(0);
		}
		if (e.getSource() == vistaTemplate.getbVolver()) {
			vistaPrincipal.getVistaPrincipal().setVisible(true);
			vistaTemplate.dispose();
		}
		if (e.getSource() == vistaTemplate.getbRegistrar()) {
			this.registrar();
			vistaPrincipal.getVistaPrincipal().setVisible(true);
			vistaTemplate.dispose();
		}
	}

	public void registrar() {
		curso = new Curso();
		curso.setCantidadEstudiantes(10);
		curso.setCodigo(this.vistaTemplate.gettCodigo().getText());
		curso.setDocente(null);
		curso.setMonitor(null);
		curso.setNombre(this.vistaTemplate.gettNombre().getText());
		curso.setFechaFin(this.vistaTemplate.gettFechaFin().getText());
		curso.setFechaIn(this.vistaTemplate.gettFechaIn().getText());
		cursoDAO.guardarDatos(curso);
	}

	public VistaRegistroCurso getVista() {
		return this.vistaTemplate;
	}

}// end ControladorRegistroCurso