package controlador;

import vista.VistaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorVistaPrincipal implements ActionListener {
    private VistaPrincipal vista;

    public ControladorVistaPrincipal() {
        this.vista = new VistaPrincipal(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.getbSalir()) {
            System.exit(0);
        }
        if (e.getSource() == this.vista.getbListarContratista()) {
            new ControladorListarContratista();
            this.vista.setVisible(false);
        }
        if (e.getSource() == this.vista.getbRegistrarContratista()) {
            new ControladorRegistroContratista(this);
            this.vista.setVisible(false);
        }
        if (e.getSource() == this.vista.getbListarCursos()) {
            new ControladorListarCurso();
            this.vista.setVisible(false);
        }
        if (e.getSource() == this.vista.getbRegistrarCursos()) {
            new ControladorRegistroCurso(this);
            this.vista.setVisible(false);
        }
    }

    public VistaPrincipal getVistaPrincipal() {
        return this.vista;
    }
}
