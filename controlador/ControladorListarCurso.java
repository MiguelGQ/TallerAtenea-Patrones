package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VistaListarCurso;

/**
 * @author joush
 * @version 1.0
 * @created 13-sept.-2023 3:37:41 p.�m.
 */
public class ControladorListarCurso implements ActionListener {

	private VistaListarCurso vistaListarCurso;

	public ControladorListarCurso() {
		this.vistaListarCurso = new VistaListarCurso(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vistaListarCurso.getbSalir()) {
			System.exit(0);
		}
	}

	public VistaListarCurso getVistaPrincipal() {
		return this.vistaListarCurso;
	}
}// end ControladorListarCurso