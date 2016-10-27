package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sun.misc.FormattedFloatingDecimal.Form;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import vista.FormInsertarUsuario;

public class VentanaPrincipal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUsuario = new JMenu("Usuario");
		menuBar.add(mnUsuario);
		
		JMenuItem mntmInsertar = new JMenuItem("Insertar");
		mnUsuario.add(mntmInsertar);
		
		JMenuItem mntmModificar = new JMenuItem("Modificar");
		mnUsuario.add(mntmModificar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mnUsuario.add(mntmListar);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mnUsuario.add(mntmEliminar);
		
		mntmInsertar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				vista.FormInsertarUsuario formInsertarUser = new  FormInsertarUsuario();
				formInsertarUser.main();
			}
		});
	}
}
