/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscamascotas.sqliteconection.Operaciones;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alberto
 */
public class Operaciones extends Conexion {

	ArrayList<String> listaDNI;
	Object[] listaDNIArray;

	public Operaciones() {
		// initialise instance variables
	}

	public ArrayList<String> getAllListaDNI() {
		return listaDNI;
	}

	public void setListaDNI(String objeto) {
		getAllListaDNI().add(objeto);
	}

	public boolean insertar(String sql) {
		boolean valor = true;
		conectar();
		try {
			consulta.executeUpdate(sql);
		} catch (SQLException e) {
			valor = false;
			JOptionPane.showMessageDialog(null, e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return valor;
	}

	public int calcularCarpeta() {
		conectar();
		ResultSet resultado = null;
		int calcular = 0, tamanyo;
		try {
			resultado = consulta.executeQuery("SELECT ANIMALID FROM ANIMALES");
			tamanyo = resultado.getMetaData().getColumnCount();

//			System.out
//					.println("Valor de resultado --> " + resultado.toString());
//			;
			while (resultado.next()) {
				for (int i = 1; i <= tamanyo; i++) {
					calcular = (int) resultado.getObject(i);
//					System.out.println("Valor de calcular --> " + calcular);
				}

//				System.out.println("Valor de calcular final --> " + calcular);
			}
			calcular++;
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return calcular;
	}

	/**
	 * Abrimos una consulta con la base de datos
	 * 
	 * @param Recibe una sentencia sql
	 * @return devuelve el valor de la consulta
	 */
	public ResultSet consultar(String sql) {
		conectar();
		ResultSet resultado = null;
		try {
			resultado = consulta.executeQuery(sql);
		} catch (SQLException e) {
//			System.out.println("Mensaje:" + e.getMessage());
//			System.out.println("Estado:" + e.getSQLState());
//			System.out.println("Codigo del error:" + e.getErrorCode());
			JOptionPane.showMessageDialog(null, "" + e.getMessage());
		}
		return resultado;
	}

	/**
	 * Se realiza una consulta con los datos del animal.
	 * 
	 * @param Recibe una sentencia sql
	 * @param Recibe un tableModel
	 * @return Devolvemos un TableModel
	 */
	public DefaultTableModel consultaAnimal(String sql,
			DefaultTableModel tableModel) {
		listaDNI = new ArrayList<String>();

		ResultSet resultadoAnimal = null;
		ResultSet resultadoCliente = null;
		getAllListaDNI().clear();
		try {
			resultadoAnimal = consultar(sql);

			if (resultadoAnimal != null) {
				int numeroColumna = resultadoAnimal.getMetaData()
						.getColumnCount();

				while (resultadoAnimal.next()) {
					Object[] objetos = new Object[numeroColumna];
					for (int i = 1; i < numeroColumna; i++) {
						objetos[i - 1] = resultadoAnimal.getObject(i);
					}
					String dni = resultadoAnimal.getString(numeroColumna);
					setListaDNI(dni);
					resultadoCliente = consultar("SELECT NOM_CLIENTE, APELLIDOS FROM CLIENTES WHERE DNI = \""
							+ dni + "\"");

					String propietario = resultadoCliente.getString(1);
					propietario = propietario + " "
							+ resultadoCliente.getString(2);

					objetos[numeroColumna - 2] = propietario;
					objetos[numeroColumna - 1] = dni;
//					System.out
//							.println("***************************************");
//					System.out.println(getAllListaDNI().toString());
//					System.out
//							.println("***************************************");
//					System.out.println("Valor de los objetos: "
//							+ objetos.toString());
					tableModel.addRow(objetos);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				consulta.close();
				conexion.close();
				if (resultadoAnimal != null) {
					resultadoAnimal.close();
				}
				if (resultadoCliente != null) {
					resultadoCliente.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return tableModel;
	}

	public DefaultTableModel consultaCliente(String sql,
			DefaultTableModel tableModel) {
		listaDNI = new ArrayList<String>();
		ResultSet resultadoCliente = null;
		ResultSet resultadoAnimal = null;
		String sel;
		sel = "NOM_ANIMAL, ESPECIE, RAZA, TIPO_PELO, CAPA, SEXO, ESTERILIZADO, FECHA_NACIMIENTO, ID_CLIENTE";
		getAllListaDNI().clear();

		try {
			resultadoCliente = consultar(sql);

			if (resultadoCliente != null) {
				while (resultadoCliente.next()) {
					String propietario = resultadoCliente.getString(1);
					propietario = propietario + " "
							+ resultadoCliente.getString(2);

					String dni = resultadoCliente.getString(3);
					setListaDNI(dni);

					resultadoAnimal = consultar("SELECT " + sel
							+ " FROM ANIMALES WHERE ID_CLIENTE = \"" + dni
							+ "\"");

					if (resultadoAnimal != null) {

						int numeroColumna = resultadoAnimal.getMetaData()
								.getColumnCount();

						while (resultadoAnimal.next()) {
							Object[] objetos = new Object[numeroColumna];
							for (int i = 1; i < numeroColumna; i++) {
								objetos[i - 1] = resultadoAnimal.getObject(i);
							}

							objetos[numeroColumna - 2] = propietario;
							objetos[numeroColumna - 1] = dni;

							tableModel.addRow(objetos);
						}
					}
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				consulta.close();
				conexion.close();
				if (resultadoCliente != null) {
					resultadoCliente.close();
				}
				if (resultadoAnimal != null) {
					resultadoAnimal.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return tableModel;
	}

	/**
	 * Se realiza una consulta normal, sin realizar ninguna operación en concreto.
	 * 
	 * @param Recibe una sentencia sql
	 * @return Devuelve un ResultSet
	 */
	@SuppressWarnings("finally")
	public ResultSet consultaNormal(String sql) {
		conectar();
		ResultSet resultado = null;
		try {
			resultado = consulta.executeQuery(sql);
		} catch (SQLException e) {
//			System.out.println("Mensaje:" + e.getMessage());
//			System.out.println("Estado:" + e.getSQLState());
//			System.out.println("Codigo del error:" + e.getErrorCode());
			JOptionPane.showMessageDialog(null, "" + e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.close();
				if (resultado != null) {
					resultado.close();
				}

			} catch (final Exception e) {
				e.printStackTrace();
			}
			return resultado;
		}
	}
}
// public void guardarUsuario(Persona persona) {
// insertar("insert into CLIENTES values(" + persona.getId()
// + ",'" + persona.getPrimer_nombre()
// + "','" + persona.getSegundo_nombre()
// + "','" + persona.getPrimer_apellido()
// + "','" + persona.getSegundo_apellido() + "')");
// }
//
// public void totalPersonas(DefaultTableModel tableModel) {
// ResultSet resultado = null;
// tableModel.setRowCount(0);
// tableModel.setColumnCount(0);
// String sql = "select * from CLIENTES";
// try {
// resultado = consultar(sql);
// if (resultado != null) {
// int numeroColumna = resultado.getMetaData().getColumnCount();
// for (int j = 1; j <= numeroColumna; j++) {
// tableModel.addColumn(resultado.getMetaData().getColumnName(j));
// }
// while (resultado.next()) {
// Object[] objetos = new Object[numeroColumna];
// for (int i = 1; i <= numeroColumna; i++) {
// objetos[i - 1] = resultado.getObject(i);
// }
// tableModel.addRow(objetos);
// }
// }
// } catch (SQLException e) {
// } finally {
// try {
// consulta.close();
// conexion.close();
// if (resultado != null) {
// resultado.close();
// }
// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// }

