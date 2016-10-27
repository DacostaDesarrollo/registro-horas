package modelo;

public class persona {
	private String nombre_persona;
	private String primerapellido_per;
	private String segundoapellido_per;
	private String numero_identificacion_per;
	private String fecha_nacimiento_per;
	private String correo_electronico_per;
	private String direccion_persona;
	private String ciudad_persona;
	private String telefono_persona;
	public persona() {}
	/*
	public persona(String nombre_persona, String primerapellido_per,
			String segundoapellido_per, Integer numero_identificacion_per,
			String fecha_nacimiento_per, String correo_electronico_per,
			String direccion_persona, String ciudad_persona,
			String telefono_persona) {
		super();
		this.nombre_persona = nombre_persona;
		this.primerapellido_per = primerapellido_per;
		this.segundoapellido_per = segundoapellido_per;
		this.numero_identificacion_per = numero_identificacion_per;
		this.fecha_nacimiento_per = fecha_nacimiento_per;
		this.correo_electronico_per = correo_electronico_per;
		this.direccion_persona = direccion_persona;
		this.ciudad_persona = ciudad_persona;
		this.telefono_persona = telefono_persona;
	}*/
	
	public String getNombre_persona() {
		return nombre_persona;
	}

	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}

	public String getPrimerapellido_per() {
		return primerapellido_per;
	}

	public void setPrimerapellido_per(String primerapellido_per) {
		this.primerapellido_per = primerapellido_per;
	}

	public String getSegundoapellido_per() {
		return segundoapellido_per;
	}

	public void setSegundoapellido_per(String segundoapellido_per) {
		this.segundoapellido_per = segundoapellido_per;
	}

	public String getNumero_identificacion_per() {
		return numero_identificacion_per;
	}

	public void setNumero_identificacion_per(String numero_identificacion_per) {
		this.numero_identificacion_per = numero_identificacion_per;
	}

	public String getFecha_nacimiento_per() {
		return fecha_nacimiento_per;
	}

	public void setFecha_nacimiento_per(String fecha_nacimiento_per) {
		this.fecha_nacimiento_per = fecha_nacimiento_per;
	}

	public String getCorreo_electronico_per() {
		return correo_electronico_per;
	}

	public void setCorreo_electronico_per(String correo_electronico_per) {
		this.correo_electronico_per = correo_electronico_per;
	}

	public String getDireccion_persona() {
		return direccion_persona;
	}

	public void setDireccion_persona(String direccion_persona) {
		this.direccion_persona = direccion_persona;
	}

	public String getCiudad_persona() {
		return ciudad_persona;
	}

	public void setCiudad_persona(String ciudad_persona) {
		this.ciudad_persona = ciudad_persona;
	}

	public String getTelefono_persona() {
		return telefono_persona;
	}

	public void setTelefono_persona(String telefono_persona) {
		this.telefono_persona = telefono_persona;
	}

}
