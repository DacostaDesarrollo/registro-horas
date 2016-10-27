package vista;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.persona;
import com.sun.webkit.ContextMenu.ShowContext;

import conexion.Conexion;
import controlador.personaController;
public class Principal extends JFrame{
	/**
	 * @param args
	 */
	private static persona persona = new persona();
	public Principal(){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persona =new persona();
		personaController personaController = new personaController();
		int opcion= 0;
		
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú Principal \n1.Ingresar usuario \n2.Ingresar registro \n3.Listar registro\n4.Salir\n Opción"));
			} catch (NumberFormatException e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Solo se permiten números");
			}
			
			switch (opcion) {
			case 0:
				break;
			case 1:
				//crear ingresar datos de usuario
				
				JOptionPane.showMessageDialog(null, "Ingresar Usuario \n");
				persona.setNombre_persona(JOptionPane.showInputDialog("Nombre: "));
				persona.setPrimerapellido_per(JOptionPane.showInputDialog("Primer apellido: "));
				persona.setSegundoapellido_per(JOptionPane.showInputDialog("Segudo apellido: "));
				persona.setNumero_identificacion_per(JOptionPane.showInputDialog("número identificación: "));
				persona.setFecha_nacimiento_per(JOptionPane.showInputDialog("fecha de nacimiento: "));
				persona.setCorreo_electronico_per(JOptionPane.showInputDialog("Correo: "));
				persona.setDireccion_persona(JOptionPane.showInputDialog("Dirección: "));
				persona.setCiudad_persona(JOptionPane.showInputDialog("Ciudad: "));
				persona.setTelefono_persona(JOptionPane.showInputDialog("teléfono: "));
				
				personaController.getGuardarPersona(persona);
				
				
				break;
			default:
				break;
			}
			
		} while (opcion !=3);
		
		
		
	}

}
