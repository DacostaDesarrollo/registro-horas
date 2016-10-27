package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;

public class Conexion {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	private String url = "jdbc:mysql://localhost:3306/registrohoras";
	private String drive = "com.mysql.jdbc.Driver";
	private String usuario = "root";
	private String contrasena= "";
	private Connection conn;


public ResultSet getRs(){
	return rs;
}
public void setRS(ResultSet rs){
	this.rs = rs;
}
public Conexion(){
	try {
		if ((con = dbconectar())== null) {
			JOptionPane.showMessageDialog(null, "Error en la conexión en la DB");
			return;
		}
		st = (Statement) con.createStatement();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
public Connection dbconectar(){
	try {
		Class.forName(drive);
		conn = (Connection) DriverManager.getConnection(url,usuario,contrasena);
		if (conn != null) {
			JOptionPane.showMessageDialog(null, "Conectado a la base de datos"+ url);
		}
		return conn;
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
		return conn;
	}
}
public void getqueryacction(String query) throws SQLException {
	st.executeUpdate(query);
}
public void getqueryselect(String query) throws SQLException {
	st.executeQuery(query);
}
}//fin class
