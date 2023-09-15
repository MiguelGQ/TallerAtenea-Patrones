package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controlador.ControladorListarContratista;

/**
 * @author joush
 * @version 1.0
 * @created 13-sept.-2023 3:37:45 p.�m.
 */
public class VistaListarContratista extends JFrame {

	private ControladorListarContratista vistaComponent;
	private JPanel panel;
	private JLabel lTitulo;
	private JButton bSalir, bVolver;
	private ImageIcon iDimAux, iSalir;

	public VistaListarContratista(ControladorListarContratista controlador) {
		this.vistaComponent = controlador;
		this.crearObjetosDecoradores();
		this.crearJPanel();
		this.crearJLabel();
		this.crearJButton();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 800);
		setUndecorated(true);
		setLayout(null);
		setLocationRelativeTo(this);
		setVisible(true);
	}

	private void crearObjetosDecoradores() {
		iSalir = new ImageIcon("resources/img/bSalir.png");
	}

	private void crearJPanel() {
		panel = new JPanel();
		panel.setSize(800, 800);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setBackground(new Color(17, 17, 23));
		panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.gray));
		this.add(panel);
	}

	private void crearJLabel() {
		lTitulo = new JLabel("LISTA DE LOS CONTRATISTAS");
		lTitulo.setSize(400, 30);
		lTitulo.setLocation(200, 30);
		lTitulo.setForeground(new Color(196, 0, 1));
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lTitulo.setFont(new Font("Haettenschweiler", Font.PLAIN, 30));
		lTitulo.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(196, 0, 1)));
		panel.add(lTitulo);
	}

	private void crearJButton() {
		bSalir = new JButton();
		bSalir.setSize(25, 25);
		bSalir.setLocation(755, 10);
		iDimAux = new ImageIcon(iSalir.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
		bSalir.setIcon(iDimAux);
		bSalir.setFocusable(false);
		bSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bSalir.setBorder(null);
		bSalir.setContentAreaFilled(false);
		bSalir.setHorizontalAlignment(SwingConstants.CENTER);
		bSalir.addActionListener(vistaComponent);
		panel.add(bSalir);

		bVolver = new JButton("Volver");
		bVolver.setSize(200, 30);
		bVolver.setLocation(300, 740);
		bVolver.setFocusable(false);
		bVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bVolver.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		bVolver.setBackground(new Color(196, 0, 1));
		bVolver.setForeground(Color.WHITE);
		bVolver.setBorder(null);
		bVolver.setContentAreaFilled(true);
		bVolver.setHorizontalAlignment(SwingConstants.CENTER);
		bVolver.addActionListener(vistaComponent);
		panel.add(bVolver);
	}

	public JButton getbSalir() {
		return bSalir;
	}

	public JButton getbVolver() {
		return bVolver;
	}

}// end VistaListarContratista