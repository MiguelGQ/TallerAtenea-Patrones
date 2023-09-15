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

import controlador.ControladorRegistroContratista;

/**
 * @author joush
 * @version 1.0
 * @created 13-sept.-2023 3:37:48 p.�m.
 */
public class VistaRegistroContratista extends JFrame {

	private ControladorRegistroContratista vistaComponent;
	private JPanel panel;
	private JLabel lTitulo, lNombre, lRol, lTelefono, lCorreo, lHoras, lSalario;
	private JTextField tNombre, tTelefono, tCorreo, tHoras, tSalario;
	private JComboBox cbRol;
	private JButton bSalir, bRegistrar, bVolver;
	private ImageIcon iDimAux, iSalir;

	public VistaRegistroContratista(ControladorRegistroContratista controladorRegistroContratista) {
		this.vistaComponent = controladorRegistroContratista;

		this.crearObjetosDecoradores();
		this.crearJPanel();
		this.crearJLabel();
		this.crearJTextField();
		this.crearJComboBox();
		this.crearJButton();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 700);
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
		panel.setSize(400, 700);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setBackground(new Color(17, 17, 23));
		panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.gray));
		this.add(panel);
	}

	private void crearJLabel() {
		lTitulo = new JLabel("Registrar Contratista");
		lTitulo.setSize(300, 30);
		lTitulo.setLocation(50, 30);
		lTitulo.setForeground(new Color(196, 0, 1));
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lTitulo.setFont(new Font("Haettenschweiler", Font.PLAIN, 30));
		lTitulo.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(196, 0, 1)));
		panel.add(lTitulo);

		lNombre = new JLabel("Digite nombre del contratista");
		lNombre.setSize(200, 30);
		lNombre.setLocation(50, 100);
		lNombre.setForeground(Color.white);
		lNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lNombre.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lNombre);

		lHoras = new JLabel("Digite las horas de trabajo");
		lHoras.setSize(200, 30);
		lHoras.setLocation(50, 190);
		lHoras.setForeground(Color.white);
		lHoras.setHorizontalAlignment(SwingConstants.LEFT);
		lHoras.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lHoras);

		lSalario = new JLabel("Digite el salario del contratista");
		lSalario.setSize(200, 30);
		lSalario.setLocation(50, 280);
		lSalario.setForeground(Color.white);
		lSalario.setHorizontalAlignment(SwingConstants.LEFT);
		lSalario.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lSalario);

		lCorreo = new JLabel("Digite el correo del contratista");
		lCorreo.setSize(200, 30);
		lCorreo.setLocation(50, 370);
		lCorreo.setForeground(Color.white);
		lCorreo.setHorizontalAlignment(SwingConstants.LEFT);
		lCorreo.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lCorreo);

		lTelefono = new JLabel("Digite el telefono del contratista");
		lTelefono.setSize(200, 30);
		lTelefono.setLocation(50, 460);
		lTelefono.setForeground(Color.white);
		lTelefono.setHorizontalAlignment(SwingConstants.LEFT);
		lTelefono.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lTelefono);

		lRol = new JLabel("Digite el rol del contratista");
		lRol.setSize(200, 30);
		lRol.setLocation(50, 550);
		lRol.setForeground(Color.white);
		lRol.setHorizontalAlignment(SwingConstants.LEFT);
		lRol.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		panel.add(lRol);
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

		tHoras = new JTextField();
		tHoras.setSize(300, 30);
		tHoras.setLocation(50, 230);
		tHoras.setForeground(Color.white);
		tHoras.setBackground(new Color(32, 33, 39));
		tHoras.setCaretColor(new Color(32, 33, 39));
		tHoras.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		tHoras.setBorder(null);
		tHoras.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(tHoras);

		tSalario = new JTextField();
		tSalario.setSize(300, 30);
		tSalario.setLocation(50, 320);
		tSalario.setForeground(Color.white);
		tSalario.setBackground(new Color(32, 33, 39));
		tSalario.setCaretColor(new Color(32, 33, 39));
		tSalario.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		tSalario.setBorder(null);
		tSalario.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(tSalario);

		tCorreo = new JTextField();
		tCorreo.setSize(300, 30);
		tCorreo.setLocation(50, 410);
		tCorreo.setForeground(Color.white);
		tCorreo.setBackground(new Color(32, 33, 39));
		tCorreo.setCaretColor(new Color(32, 33, 39));
		tCorreo.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		tCorreo.setBorder(null);
		tCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(tCorreo);

		tTelefono = new JTextField();
		tTelefono.setSize(300, 30);
		tTelefono.setLocation(50, 500);
		tTelefono.setForeground(Color.white);
		tTelefono.setBackground(new Color(32, 33, 39));
		tTelefono.setCaretColor(new Color(32, 33, 39));
		tTelefono.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		tTelefono.setBorder(null);
		tTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(tTelefono);
	}

	private void crearJComboBox() {
		cbRol = new JComboBox();
		cbRol.addItem("Monitor");
		cbRol.addItem("Docente");
		cbRol.setSize(300, 30);
		cbRol.setLocation(50, 590);
		cbRol.setForeground(Color.white);
		cbRol.setBackground(new Color(32, 33, 39));
		cbRol.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		cbRol.setBorder(null);
		((JLabel) cbRol.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(cbRol);
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
		bRegistrar.setLocation(50, 650);
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
		bVolver.setLocation(225, 650);
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

	public JTextField gettNombre() {
		return tNombre;
	}

	public JTextField gettHoras() {
		return tHoras;
	}

	public JTextField gettSalario() {
		return tSalario;
	}

	public JTextField gettCorreo() {
		return tCorreo;
	}

	public JTextField gettTelefono() {
		return tTelefono;
	}

	public JComboBox getcbRol() {
		return cbRol;
	}

}// end VistaRegistroContratista