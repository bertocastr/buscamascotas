package buscamascotas.IU;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import buscamascotas.sqliteconection.Operaciones.Conexion;
import buscamascotas.sqliteconection.Operaciones.Operaciones;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Rectangle;

/**
 *
 * @author Alberto
 */
public class BuscarCliente extends javax.swing.JFrame {

	Operaciones consult = new Operaciones();
	private String sql;
	private String apellido1, dni;
	Object[] objetos;

	public Object[] getObjetos() {
		return objetos;
	}

	public void setObjetos(int i, Object dato) {
		this.objetos[i] = dato;
	}

	public String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	/**
	 * Creates new form Buscar
	 */
	public BuscarCliente() {
		setAutoRequestFocus(false);
		initComponents();
		setLocationRelativeTo(null);        // Centering on screen...
        setSize(530, 590);         
		salir();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		apellidosText = new javax.swing.JTextField();
		nombreText = new javax.swing.JTextField();
		nombreLabel = new javax.swing.JLabel();
		apellidosLabel = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		animalesTable = new javax.swing.JTable();
		buscarAnimales = new javax.swing.JButton();
		volverButton1 = new javax.swing.JButton();
		salirButton1 = new javax.swing.JButton();
		fichaClienteButton = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		apellidosText.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				apellidosTextActionPerformed(evt);
			}
		});

		nombreLabel.setText("NOMBRE");

		apellidosLabel.setText("APELLIDOS");

		animalesTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "NOMBRE", "DNI" }) {
			Class[] types = new Class[] { java.lang.String.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false, false, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		animalesTable.setColumnSelectionAllowed(true);
		animalesTable.getTableHeader().setReorderingAllowed(false);
		jScrollPane2.setViewportView(animalesTable);
		animalesTable
				.getColumnModel()
				.getSelectionModel()
				.setSelectionMode(
						javax.swing.ListSelectionModel.SINGLE_SELECTION);
		if (animalesTable.getColumnModel().getColumnCount() > 0) {
			animalesTable.getColumnModel().getColumn(0).setResizable(false);
			animalesTable.getColumnModel().getColumn(1).setResizable(false);
		}

		buscarAnimales.setText("BUSCAR");
		buscarAnimales.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buscarAnimalesActionPerformed(evt);
			}
		});

		volverButton1.setText("VOLVER ATRAS");
		volverButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				volverButton1ActionPerformed(evt);
			}
		});

		salirButton1.setText("SALIR");
		salirButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				salirButton1ActionPerformed(evt);
			}
		});

		fichaClienteButton.setText("VER FICHA CLIENTE");
		fichaClienteButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						fichaClienteButtonActionPerformed(evt);
					}
				});

		jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36));
		jLabel2.setText("BUSCAMASCOTAS");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(jLabel2)
						.addGroup(layout.createSequentialGroup()
							.addGap(29)
							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
									.addComponent(buscarAnimales)
									.addGap(18)
									.addComponent(fichaClienteButton)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(volverButton1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(salirButton1))
								.addGroup(layout.createSequentialGroup()
									.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(nombreLabel)
										.addComponent(apellidosLabel))
									.addGap(18)
									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(apellidosText)
										.addComponent(nombreText, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE)))))
						.addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE))
					.addContainerGap(663, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(jLabel2)
					.addGap(29)
					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(nombreText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(nombreLabel))
					.addGap(18)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(apellidosText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(apellidosLabel))
					.addGap(59)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(buscarAnimales)
						.addComponent(salirButton1)
						.addComponent(volverButton1)
						.addComponent(fichaClienteButton))
					.addContainerGap())
		);
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}

	private void apellidosTextActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void buscarAnimalesActionPerformed(java.awt.event.ActionEvent evt) {
		Conexion con = new Conexion();

		String nombreCliente = nombreText.getText();
		String apellidoCliente = apellidosText.getText();

		String sel = "";
		setSql("");
		boolean like = comprobarApellido(apellidoCliente);
		boolean realizarConsultaAnimal = false;
		boolean realizarConsultaCliente = false;

		String query;
		if (like) {

			apellidoCliente = getApellido1();

		}

		query = "LIKE " + apellidoCliente;

		if ((!nombreCliente.equals("")) && (!apellidoCliente.equals(""))) {
			sel = "NOM_CLIENTE, APELLIDOS, DNI";
			setSql("SELECT " + sel + " FROM CLIENTES WHERE NOM_CLIENTE LIKE '%"
					+ nombreCliente + "%' AND APELLIDOS " + query + "");
			realizarConsultaCliente = true;

		} else {
			if (!nombreCliente.equals("")) {
				sel = "NOM_CLIENTE, APELLIDOS, DNI";
				setSql("SELECT " + sel
						+ " FROM CLIENTES WHERE NOM_CLIENTE LIKE '%"
						+ nombreCliente + "%' ");
				realizarConsultaCliente = true;

			} else {
				if (!apellidoCliente.equals("")) {
					sel = "NOM_CLIENTE, APELLIDOS, DNI";
					setSql("SELECT " + sel + " FROM CLIENTES WHERE APELLIDOS "
							+ query + "");
					realizarConsultaCliente = true;

				}
			}

		}

		if (realizarConsultaAnimal == true) {
			DefaultTableModel tableModel = (DefaultTableModel) animalesTable
					.getModel();
			int cont = tableModel.getRowCount();

			for (int i = cont; i > 0; i--) {
				tableModel.removeRow(i - 1);
			}

			tableModel = consult.consultaAnimal(getSql(), tableModel);
			animalesTable.setModel(tableModel);
		} else {
			DefaultTableModel tableModel = (DefaultTableModel) animalesTable
					.getModel();
			int cont = tableModel.getRowCount();

			for (int i = cont; i > 0; i--) {
				tableModel.removeRow(i - 1);
			}
			tableModel = consult.consultaSoloCliente(getSql(), tableModel);
			animalesTable.setModel(tableModel);
		}

	}

	private boolean comprobarApellido(String apellido) {
		String apell1, apellido2;
		apell1 = apellido.trim();
		int tamanyo = apell1.length();
		boolean like = false;
		apellido2 = apellido.substring(tamanyo);

		if (apellido2.equals("")) {
			setApellido1("'%" + apell1 + "%'");
			like = true;
			return like;
		} else {
			setApellido1("'%" + apellido + "%'");
			like = false;
			return like;
		}

	}

	private void volverButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		MenuPrincipal.main();
		this.setVisible(false);
	}

	private void salirButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		int eleccion = JOptionPane.showConfirmDialog(null, "�Desea salir?");

		if (eleccion == 0) {
			JOptionPane.showMessageDialog(null, "Saliendo del sistema");
			System.exit(0);
		}
	}

	private void fichaClienteButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		int row = animalesTable.getSelectedRow();

		int size = consult.getAllListaDNI().size();

		ResultSet resultado = null;
		resultado = consult.consultar("SELECT * FROM CLIENTES WHERE DNI = \""
				+ animalesTable.getValueAt(row, 1) + "\"");

		if (resultado != null) {

			int numeroColumna = 0;
			try {
				numeroColumna = resultado.getMetaData().getColumnCount();
			} catch (SQLException ex) {
				Logger.getLogger(BuscarCliente.class.getName()).log(
						Level.SEVERE, null, ex);
			}

			objetos = new Object[numeroColumna];
			for (int i = 1; i <= numeroColumna; i++) {
				try {
					setObjetos(i - 1, resultado.getObject(i));
				} catch (SQLException ex) {
					Logger.getLogger(BuscarCliente.class.getName()).log(
							Level.SEVERE, null, ex);
				}
			}

		}
		try {

			resultado.close();
		} catch (SQLException ex) {
			Logger.getLogger(BuscarCliente.class.getName()).log(Level.SEVERE,
					null, ex);
		}

		FichaCliente.main(objetos);
		this.setVisible(false);
	}

	public void salir() {
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {

				int devolucion = JOptionPane.showConfirmDialog(null,
						"�ESTA USTED SEGURO DE QUE DESEA SALIR?");
				if (devolucion == 0) {
					// TODO agregar subida de datos a dropbox. COPIA DE
					// SEGURIDAD.
					System.exit(0);
				}

			}
		});
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main() {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(BuscarCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(BuscarCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(BuscarCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(BuscarCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new BuscarCliente().setVisible(true);

			}
		});
	}

	// Declaraci�n de variables
	private javax.swing.JTable animalesTable;
	private javax.swing.JLabel apellidosLabel;
	private javax.swing.JTextField apellidosText;
	private javax.swing.JButton buscarAnimales;
	private javax.swing.JButton fichaClienteButton;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JLabel nombreLabel;
	private javax.swing.JTextField nombreText;
	private javax.swing.JButton salirButton1;
	private javax.swing.JButton volverButton1;

}
