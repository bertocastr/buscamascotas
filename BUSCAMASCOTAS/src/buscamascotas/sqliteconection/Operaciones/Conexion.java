package buscamascotas.sqliteconection.Operaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author Alberto
 */
public class Conexion {

	Connection conexion;
	Statement consulta;
	private String ruta;

	public Conexion() {
		ruta = System.getProperty("user.dir");
	}

	/**
	 * Se conecta con la base de datos.
	 * 
	 */
	public void conectar() {
		String separador = System.getProperty("file.separator");

		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

		try {

			conexion = DriverManager.getConnection("jdbc:sqlite:" + ruta
					+ separador + "buscamascotas.db");
			consulta = conexion.createStatement();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	/**
	 * Se desconecta con la base de datos.
	 * 
	 */
	public void desconectar() {
		try {
			conexion.close();
		} catch (SQLException ex) {
			Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null,
					ex);
		}
	}
}
