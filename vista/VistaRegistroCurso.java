package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.ControladorRegistroCurso;

/**
 * @author joush
 * @version 1.0
 * @created 13-sept.-2023 3:37:48 p.�m.
 */
public class VistaRegistroCurso extends JFrame {

	private ControladorRegistroCurso vistaComponent;
	private JPanel panel;
	private JLabel lTitulo, lNombre, lCod, lDoc, lTutor, lFechaIn, lFechaFin, lCantidad;
	private JTextField tNombre, tCod, tFechaIn, tFechaFin, tCantidad;
	private JComboBox cbDoc, cbTutor;
	private JButton bSalir, bRegistrar, bVolver;
	private ImageIcon iDimAux, iSalir;

	public VistaRegistroCurso(ControladorRegistroCurso controladorRegistroCurso) {
		this.vistaComponent = controladorRegistroCurso;

		this.crearObjetosDecoradores();
		this.crearJPanel();
		this.crearJLabel();
		this.crearJTextField();
		this.crearJComboBox();
		this.crearJButton();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 800);
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
		panel.setSize(400, 800);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setBackground(new Color(17, 17, 23));
		panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.gray));
		this.add(panel);
	}

	private void crearJLabel() {
		lTitulo = new JLabel("Registrar Curso");
		lTitulo.setSize(200, 30);
		lTitulo.setLocation(100, 30);
		lTitulo.setForeground(new Color(196, 0, 1));
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lTitulo.setFont(new Font("Haettenschweiler", Font.PLAIN, 30));
		lTitulo.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(196, 0, 1)));
		panel.add(lTitulo);

		lNombre = new JLabel("Digite nombre del curso");
		lNombre.setSize(200, 30);
		lNombre.setLocation(50, 100);
		lNombre.setForeground(Color.white);
		lNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lNombre.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lNombre);

		lCod = new JLabel("Digite el código del curso");
		lCod.setSize(200, 30);
		lCod.setLocation(50, 190);
		lCod.setForeground(Color.white);
		lCod.setHorizontalAlignment(SwingConstants.LEFT);
		lCod.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lCod);

		lFechaIn = new JLabel("Digite fecha de inicio");
		lFechaIn.setSize(200, 30);
		lFechaIn.setLocation(50, 280);
		lFechaIn.setForeground(Color.white);
		lFechaIn.setHorizontalAlignment(SwingConstants.LEFT);
		lFechaIn.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lFechaIn);

		lFechaFin = new JLabel("Digite fecha de finalización");
		lFechaFin.setSize(200, 30);
		lFechaFin.setLocation(50, 370);
		lFechaFin.setForeground(Color.white);
		lFechaFin.setHorizontalAlignment(SwingConstants.LEFT);
		lFechaFin.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lFechaFin);

		lCantidad = new JLabel("Digite cantidad de estudiantes del curso");
		lCantidad.setSize(200, 30);
		lCantidad.setLocation(50, 460);
		lCantidad.setForeground(Color.white);
		lCantidad.setHorizontalAlignment(SwingConstants.LEFT);
		lCantidad.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lCantidad);

		lDoc = new JLabel("Seleccione el docente para el curso");
		lDoc.setSize(300, 30);
		lDoc.setLocation(50, 550);
		lDoc.setForeground(Color.white);
		lDoc.setHorizontalAlignment(SwingConstants.LEFT);
		lDoc.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lDoc);

		lTutor = new JLabel("Seleccione el monitor para el curso");
		lTutor.setSize(300, 30);
		lTutor.setLocation(50, 640);
		lTutor.setForeground(Color.white);
		lTutor.setHorizontalAlignment(SwingConstants.LEFT);
		lTutor.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lTutor);
	}

	private void crearJTextField() {
		tNombre = new JTextField();
		tNombre.setSize(300, 30);
		tNombre.setLocation(50, 140);
		tNombre.setForeground(Color.white);
		tNombre.setBackground(new Color(32, 33, 39));
		tNombre.setCaretColor(new Color(32, 33, 39));
		tNombre.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		tNombre.setBorder(null);
		tNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(tNombre);

		tCod = new JTextField();
		tCod.setSize(300, 30);
		tCod.setLocation(50, 230);
		tCod.setForeground(Color.white);
		tCod.setBackground(new Color(32, 33, 39));
		tCod.setCaretColor(new Color(32, 33, 39));
		tCod.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		tCod.setBorder(null);
		tCod.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(tCod);

		tFechaIn = new JTextField();
		tFechaIn.setSize(300, 30);
		tFechaIn.setLocation(50, 320);
		tFechaIn.setForeground(Color.white);
		tFechaIn.setBackground(new Color(32, 33, 39));
		tFechaIn.setCaretColor(new Color(32, 33, 39));
		tFechaIn.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		tFechaIn.setBorder(null);
		tFechaIn.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(tFechaIn);

		tFechaFin = new JTextField();
		tFechaFin.setSize(300, 30);
		tFechaFin.setLocation(50, 410);
		tFechaFin.setForeground(Color.white);
		tFechaFin.setBackground(new Color(32, 33, 39));
		tFechaFin.setCaretColor(new Color(32, 33, 39));
		tFechaFin.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		tFechaFin.setBorder(null);
		tFechaFin.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(tFechaFin);

		tCantidad = new JTextField();
		tCantidad.setSize(300, 30);
		tCantidad.setLocation(50, 500);
		tCantidad.setForeground(Color.white);
		tCantidad.setBackground(new Color(32, 33, 39));
		tCantidad.setCaretColor(new Color(32, 33, 39));
		tCantidad.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		tCantidad.setBorder(null);
		tCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(tCantidad);
	}

	private void crearJComboBox() {
		cbTutor = new JComboBox();
		cbTutor.addItem("Monitor");
		cbTutor.addItem("Docente");
		cbTutor.setSize(300, 30);
		cbTutor.setLocation(50, 590);
		cbTutor.setForeground(Color.white);
		cbTutor.setBackground(new Color(32, 33, 39));
		cbTutor.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		cbTutor.setBorder(null);
		((JLabel) cbTutor.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(cbTutor);

		cbDoc = new JComboBox();
		cbDoc.addItem("Monitor");
		cbDoc.addItem("Docente");
		cbDoc.setSize(300, 30);
		cbDoc.setLocation(50, 680);
		cbDoc.setForeground(Color.white);
		cbDoc.setBackground(new Color(32, 33, 39));
		cbDoc.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		cbDoc.setBorder(null);
		((JLabel) cbDoc.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(cbDoc);
	}

	private void crearJButton() {
		bSalir = new JButton();
		bSalir.setSize(25, 25);
		bSalir.setLocation(355, 10);
		iDimAux = new ImageIcon(iSalir.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
		bSalir.setIcon(iDimAux);
		bSalir.setFocusable(false);
		bSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bSalir.setBorder(null);
		bSalir.setContentAreaFilled(false);
		bSalir.setHorizontalAlignment(SwingConstants.CENTER);
		bSalir.addActionListener(vistaComponent);
		panel.add(bSalir);

		bRegistrar = new JButton("Registrar");
		bRegistrar.setSize(125, 30);
		bRegistrar.setLocation(50, 740);
		bRegistrar.setFocusable(false);
		bRegistrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bRegistrar.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		bRegistrar.setBackground(new Color(196, 0, 1));
		bRegistrar.setForeground(Color.WHITE);
		bRegistrar.setBorder(null);
		bRegistrar.setContentAreaFilled(true);
		bRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		bRegistrar.addActionListener(vistaComponent);
		panel.add(bRegistrar);

		bVolver = new JButton("Volver");
		bVolver.setSize(125, 30);
		bVolver.setLocation(225, 740);
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

	public JButton getbRegistrar() {
		return bRegistrar;
	}

	public JButton getbVolver() {
		return bVolver;
	}

	public JTextField gettCodigo() {
		return tCod;
	}

	public JTextField gettFechaIn() {
		return tFechaIn;
	}

	public JTextField gettFechaFin() {
		return tFechaFin;
	}

	public JTextField gettCantidad() {
		return tCantidad;
	}

	public JTextField gettNombre() {
		return tNombre;
	}

	public JComboBox getcbDocente() {
		return cbDoc;
	}

	public JComboBox getcbMonitor() {
		return cbTutor;
	}
}// end VistaRegistroCurso