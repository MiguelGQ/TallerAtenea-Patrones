package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Contratista;
import modelo.ContratistaDAO;
import vista.VistaRegistroContratista;

public class ControladorRegistroContratista implements ActionListener {
    private Contratista con;
    private ContratistaDAO contratistaDAO;
    private VistaRegistroContratista vistaTemplate;
    private ControladorVistaPrincipal vistaPrincipal;

    public ControladorRegistroContratista(ControladorVistaPrincipal vistaPrincipal) {
        this.vistaTemplate = new VistaRegistroContratista(this);
        contratistaDAO = new ContratistaDAO();
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
        con = new Contratista();
        con.setCorreo(this.vistaTemplate.gettCorreo().getText());
        con.setHorasLaborales(92);
        con.setNombre(this.vistaTemplate.gettNombre().getText());
        con.setRol(null);
        con.setSalario(200.000);
        con.setTelefono(this.vistaTemplate.gettTelefono().getText());
        contratistaDAO.guardarDatos(con);
    }

    public VistaRegistroContratista getVista() {
        return this.vistaTemplate;
    }
}
