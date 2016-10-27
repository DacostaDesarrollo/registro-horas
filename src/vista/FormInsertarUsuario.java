package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class FormInsertarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreUsu;
	private JTextField txtPriApellidoUsu;
	private JTextField txtSegApellidoUsu;
	private JTextField txtCedulaUsu;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormInsertarUsuario frame = new FormInsertarUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormInsertarUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreUsuario = new JLabel("Nombre");
		lblNombreUsuario.setBounds(10, 11, 171, 14);
		contentPane.add(lblNombreUsuario);
		
		JLabel lblPrimerApellidoUsuario = new JLabel("Primer Apellido");
		lblPrimerApellidoUsuario.setBounds(10, 36, 171, 14);
		contentPane.add(lblPrimerApellidoUsuario);
		
		JLabel lblSegundoApellidoUsuario = new JLabel("Segundo Apellido");
		lblSegundoApellidoUsuario.setBounds(10, 61, 171, 14);
		contentPane.add(lblSegundoApellidoUsuario);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setBounds(10, 86, 171, 14);
		contentPane.add(lblCedula);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setBounds(10, 111, 171, 14);
		contentPane.add(lblFechaDeNacimiento);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo Electr\u00F3nico");
		lblCorreoElectrnico.setBounds(10, 136, 171, 14);
		contentPane.add(lblCorreoElectrnico);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(10, 161, 171, 14);
		contentPane.add(lblDireccin);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(10, 186, 171, 14);
		contentPane.add(lblTelfono);
		
		txtNombreUsu = new JTextField();
		txtNombreUsu.setBounds(145, 8, 147, 20);
		contentPane.add(txtNombreUsu);
		txtNombreUsu.setColumns(10);
		
		txtPriApellidoUsu = new JTextField();
		txtPriApellidoUsu.setColumns(10);
		txtPriApellidoUsu.setBounds(145, 36, 147, 20);
		contentPane.add(txtPriApellidoUsu);
		
		txtSegApellidoUsu = new JTextField();
		txtSegApellidoUsu.setColumns(10);
		txtSegApellidoUsu.setBounds(145, 61, 147, 20);
		contentPane.add(txtSegApellidoUsu);
		
		txtCedulaUsu = new JTextField();
		txtCedulaUsu.setColumns(10);
		txtCedulaUsu.setBounds(145, 86, 147, 20);
		contentPane.add(txtCedulaUsu);
	}
}
