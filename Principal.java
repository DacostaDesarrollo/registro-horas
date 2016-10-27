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
				opcion = Integer.parseInt(JOptionPane.showInputDialog("Men� Principal \n1.Ingresar usuario \n2.Ingresar registro \n3.Listar registro\n4.Salir\n Opci�n"));
			} catch (NumberFormatException e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Solo se permiten n�meros");
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
				persona.setNumero_identificacion_per(JOptionPane.showInputDialog("n�mero identificaci�n: "));
				persona.setFecha_nacimiento_per(JOptionPane.showInputDialog("fecha de nacimiento: "));
				persona.setCorreo_electronico_per(JOptionPane.showInputDialog("Correo: "));
				persona.setDireccion_persona(JOptionPane.showInputDialog("Direcci�n: "));
				persona.setCiudad_persona(JOptionPane.showInputDialog("Ciudad: "));
				persona.setTelefono_persona(JOptionPane.showInputDialog("tel�fono: "));
				
				personaController.getGuardarPersona(persona);
				
				
				break;
			default:
				break;
			}
			
		} while (opcion !=3);
		
		
		
	}

}
