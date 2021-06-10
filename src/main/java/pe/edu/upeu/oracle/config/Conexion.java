package pe.edu.upeu.oracle.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	private static final String URL="jdbc:oracle:thin:@localhost:1522:XE";
	private static final String USER="lp2";
	private static final String PASS="1234";
	private static final String DRIVER="oracle.jdbc.OracleDriver";
	private static Connection cx = null;
	
	public static Connection getConexion() {
		try {
			Class.forName(DRIVER);
			if(cx==null) {
				cx = DriverManager.getConnection(URL, USER, PASS);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
		return cx;
	}
	public void desconectar() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
