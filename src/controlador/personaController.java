package controlador;
import modelo.persona;
import conexion.Conexion;

public class personaController {
	private Conexion conexion = new Conexion();
	public personaController(){}
	
	public void getGuardarPersona(persona persona){
		try {
			String query = "INSERT INTO persona VALUES(NULL,'"
					+ persona.getNombre_persona()+ "','"
					+ persona.getPrimerapellido_per()+ "','"
					+ persona.getSegundoapellido_per()+ "','"
					+ persona.getNumero_identificacion_per()+ "','"
					+ persona.getFecha_nacimiento_per()+ "','"
					+ persona.getCorreo_electronico_per()+ "','"
					+ persona.getDireccion_persona()+ "','"
					+ persona.getCiudad_persona()+ "','"
					+ persona.getTelefono_persona()+ "');";
			conexion.getqueryacction(query);
					
					
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("Error getGuardarPersona() "+e.getMessage());
		}
	}
}
