package controlador;

import modelo.Tutor;
import conexion.Conexion;

public class TutorController {
	private Conexion conexion = new Conexion();
	public TutorController(){}

	public void getGuardarTutor(Tutor tutor){
		try {
			String query = "INSERT INTO tutor VALUES(NULL,'"
					+ tutor.getCedula_tutor()+ "','"
					+ tutor.getNombre_tutor()+ "','"
					+ tutor.getApellido_tutor()+ "','"
					+ tutor.getFecha_nacimiento_tutor()+ "','"
					+ tutor.getCorreo_electronico_tutor()+ "','"
					+ tutor.getDireccion_tutor()+ "','"
					+ tutor.getTelefono_tutor()+ "','";
			conexion.getqueryacction(query);
					
					
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("Error getGuardarTutor() "+e.getMessage());
		}
	}

}
