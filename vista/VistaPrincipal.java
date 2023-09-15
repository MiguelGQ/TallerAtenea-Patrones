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

import controlador.ControladorVistaPrincipal;

/**
 * @author joush
 * @version 1.0
 * @created 13-sept.-2023 3:37:46 p.�m.
 */
public class VistaPrincipal extends JFrame {

	private ControladorVistaPrincipal vistaComponent;
	private JPanel panel;
	private JLabel lTitulo;
	private JButton bSalir, BListarContratista, BListarCursos, BRegistrarContratista, BRegistrarCursos;
	private ImageIcon iDimAux, iSalir;

	public VistaPrincipal(ControladorVistaPrincipal vistaComponent) {
		this.vistaComponent = vistaComponent;

		this.crearObjetosDecoradores();
		this.crearJPanel();
		this.crearJLabel();
		this.crearJButton();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
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
		panel.setSize(300, 300);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setBackground(new Color(17, 17, 23));
		panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.gray));
		this.add(panel);
	}

	private void crearJLabel() {
		lTitulo = new JLabel("ASIGNACIÓN ATENEA");
		lTitulo.setSize(200, 30);
		lTitulo.setLocation(50, 30);
		lTitulo.setForeground(new Color(196, 0, 1));
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lTitulo.setFont(new Font("Haettenschweiler", Font.PLAIN, 30));
		lTitulo.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(196, 0, 1)));
		panel.add(lTitulo);
	}

	private void crearJButton() {
		bSalir = new JButton();
		bSalir.setSize(25, 25);
		bSalir.setLocation(255, 10);
		iDimAux = new ImageIcon(iSalir.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
		bSalir.setIcon(iDimAux);
		bSalir.setFocusable(false);
		bSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bSalir.setBorder(null);
		bSalir.setContentAreaFilled(false);
		bSalir.setHorizontalAlignment(SwingConstants.CENTER);
		bSalir.addActionListener(vistaComponent);
		panel.add(bSalir);

		BListarContratista = new JButton("Listar Contratista");
		BListarContratista.setSize(200, 30);
		BListarContratista.setLocation(50, 100);
		BListarContratista.setFocusable(false);
		BListarContratista.setCursor(new Cursor(Cursor.HAND_CURSOR));
		BListarContratista.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		BListarContratista.setBackground(new Color(196, 0, 1));
		BListarContratista.setForeground(Color.WHITE);
		BListarContratista.setBorder(null);
		BListarContratista.setContentAreaFilled(true);
		BListarContratista.setHorizontalAlignment(SwingConstants.CENTER);
		BListarContratista.addActionListener(this.vistaComponent);
		panel.add(BListarContratista);

		BListarCursos = new JButton("Listar Curso");
		BListarCursos.setSize(200, 30);
		BListarCursos.setLocation(50, 150);
		BListarCursos.setFocusable(false);
		BListarCursos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		BListarCursos.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		BListarCursos.setBackground(new Color(196, 0, 1));
		BListarCursos.setForeground(Color.WHITE);
		BListarCursos.setBorder(null);
		BListarCursos.setContentAreaFilled(true);
		BListarCursos.setHorizontalAlignment(SwingConstants.CENTER);
		BListarCursos.addActionListener(this.vistaComponent);
		panel.add(BListarCursos);

		BRegistrarContratista = new JButton("Registrar Contratista");
		BRegistrarContratista.setSize(200, 30);
		BRegistrarContratista.setLocation(50, 200);
		BRegistrarContratista.setFocusable(false);
		BRegistrarContratista.setCursor(new Cursor(Cursor.HAND_CURSOR));
		BRegistrarContratista.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		BRegistrarContratista.setBackground(new Color(196, 0, 1));
		BRegistrarContratista.setForeground(Color.WHITE);
		BRegistrarContratista.setBorder(null);
		BRegistrarContratista.setContentAreaFilled(true);
		BRegistrarContratista.setHorizontalAlignment(SwingConstants.CENTER);
		BRegistrarContratista.addActionListener(this.vistaComponent);
		panel.add(BRegistrarContratista);

		BRegistrarCursos = new JButton("Registrar Curso");
		BRegistrarCursos.setSize(200, 30);
		BRegistrarCursos.setLocation(50, 250);
		BRegistrarCursos.setFocusable(false);
		BRegistrarCursos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		BRegistrarCursos.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		BRegistrarCursos.setBackground(new Color(196, 0, 1));
		BRegistrarCursos.setForeground(Color.WHITE);
		BRegistrarCursos.setBorder(null);
		BRegistrarCursos.setContentAreaFilled(true);
		BRegistrarCursos.setHorizontalAlignment(SwingConstants.CENTER);
		BRegistrarCursos.addActionListener(this.vistaComponent);
		panel.add(BRegistrarCursos);
	}

	public JButton getbSalir() {
		return bSalir;
	}

	public JButton getbListarContratista() {
		return BListarContratista;
	}

	public JButton getbListarCursos() {
		return BListarCursos;
	}

	public JButton getbRegistrarContratista() {
		return BRegistrarContratista;
	}

	public JButton getbRegistrarCursos() {
		return BRegistrarCursos;
	}

}// end VistaPrincipal