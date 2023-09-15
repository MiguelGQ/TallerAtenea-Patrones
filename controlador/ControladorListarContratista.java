package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VistaListarContratista;

/**
 * @author joush
 * @version 1.0
 * @created 13-sept.-2023 3:37:40 p.�m.
 */
public class ControladorListarContratista implements ActionListener {

	private VistaListarContratista vistaListarContratista;

	public ControladorListarContratista() {
		this.vistaListarContratista = new VistaListarContratista(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vistaListarContratista.getbSalir()) {
			System.exit(0);
		}
	}

	public VistaListarContratista getVista() {
		return this.vistaListarContratista;
	}
}// end ControladorListarContratista