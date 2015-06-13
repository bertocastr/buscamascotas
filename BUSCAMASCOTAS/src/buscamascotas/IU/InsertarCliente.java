package buscamascotas.IU;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import buscamascotas.sqliteconection.Operaciones.Conexion;
import buscamascotas.sqliteconection.Operaciones.Operaciones;

/**
 *
 * @author Alberto
 */
public class InsertarCliente extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Operaciones ins = new Operaciones();
	Conexion con = new Conexion();
	private String sql;
	private static String dni, nombre, apellidos;

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		InsertarCliente.nombre = nombre;
	}

	public static String getApellidos() {
		return apellidos;
	}

	public static void setApellidos(String apellidos) {
		InsertarCliente.apellidos = apellidos;
	}

	public static String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		InsertarCliente.dni = dni;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	/**
	 * Creates new form NewJFrame
	 */
	public InsertarCliente() {
		initComponents();

		salir();

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jDialog1 = new javax.swing.JDialog();
		jDialog2 = new javax.swing.JDialog();
		jDialog3 = new javax.swing.JDialog();
		localidadText = new javax.swing.JTextField();
		direccionText = new javax.swing.JTextField();
		municipioText = new javax.swing.JTextField();
		cpText = new javax.swing.JTextField();
		municipioLabel = new javax.swing.JLabel();
		telefonoLabel = new javax.swing.JLabel();
		direccionLabel = new javax.swing.JLabel();
		apellidosLabel = new javax.swing.JLabel();
		nombreLabel = new javax.swing.JLabel();
		nombreText = new javax.swing.JTextField();
		telefonoText = new javax.swing.JTextField();
		apellidosText = new javax.swing.JTextField();
		telefono2Text = new javax.swing.JTextField();
		telefono2Label = new javax.swing.JLabel();
		insert = new javax.swing.JButton();
		dniText = new javax.swing.JTextField();
		dniLabel = new javax.swing.JLabel();
		cpLabel = new javax.swing.JLabel();
		localidadLabel = new javax.swing.JLabel();
		animalButtonCliente = new javax.swing.JButton();
		atrasButton = new javax.swing.JButton();
		salirButton = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();

		jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36));
		jLabel1.setText("BUSCAMASCOTAS");

		javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(
				jDialog1.getContentPane());
		jDialog1.getContentPane().setLayout(jDialog1Layout);
		jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400,
				Short.MAX_VALUE));
		jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 300,
				Short.MAX_VALUE));

		javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(
				jDialog2.getContentPane());
		jDialog2.getContentPane().setLayout(jDialog2Layout);
		jDialog2Layout.setHorizontalGroup(jDialog2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400,
				Short.MAX_VALUE));
		jDialog2Layout.setVerticalGroup(jDialog2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 300,
				Short.MAX_VALUE));

		javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(
				jDialog3.getContentPane());
		jDialog3.getContentPane().setLayout(jDialog3Layout);
		jDialog3Layout.setHorizontalGroup(jDialog3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400,
				Short.MAX_VALUE));
		jDialog3Layout.setVerticalGroup(jDialog3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 300,
				Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setResizable(false);

		municipioLabel.setText("MUNICIPIO");

		telefonoLabel.setText("TELEFONO");

		direccionLabel.setText("DIRECCION");

		apellidosLabel.setText("APELLIDOS");

		nombreLabel.setText("NOMBRE");

		telefono2Label.setText("TELEFONO 2");

		insert.setText("GUARDAR");
		insert.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				insertActionPerformed(evt);
			}
		});

		dniLabel.setText("DNI");

		cpLabel.setText("CODIGO POSTAL");

		localidadLabel.setText("LOCALIDAD");

		animalButtonCliente.setText("A�ADIR ANIMAL");
		animalButtonCliente
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						animalButtonClienteActionPerformed(evt);
					}
				});

		atrasButton.setText("VOLVER ATRAS");
		atrasButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				atrasButtonActionPerformed(evt);
			}
		});

		salirButton.setText("SALIR");
		salirButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				salirButtonActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36));
		jLabel2.setText("BUSCAMASCOTAS");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap(
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																								.addComponent(
																										apellidosLabel,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										nombreLabel,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										dniLabel,
																										javax.swing.GroupLayout.Alignment.TRAILING,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										direccionLabel,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										localidadLabel,
																										javax.swing.GroupLayout.Alignment.TRAILING,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										82,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																								.addComponent(
																										telefono2Label,
																										javax.swing.GroupLayout.Alignment.LEADING,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										telefonoLabel,
																										javax.swing.GroupLayout.Alignment.LEADING,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										municipioLabel,
																										javax.swing.GroupLayout.Alignment.LEADING,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										cpLabel,
																										javax.swing.GroupLayout.Alignment.LEADING)))
																.addGap(18, 18,
																		18)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						dniText)
																				.addComponent(
																						nombreText)
																				.addComponent(
																						apellidosText)
																				.addComponent(
																						direccionText)
																				.addComponent(
																						localidadText,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						242,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						cpText)
																				.addComponent(
																						municipioText)
																				.addComponent(
																						telefonoText)
																				.addComponent(
																						telefono2Text,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						242,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(48, 48,
																		48)
																.addComponent(
																		insert)
																.addGap(18, 18,
																		18)
																.addComponent(
																		animalButtonCliente)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		60,
																		Short.MAX_VALUE)
																.addComponent(
																		atrasButton)))
								.addGap(18, 18, 18).addComponent(salirButton)
								.addGap(31, 31, 31))
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel2)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel2)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(dniLabel)
												.addComponent(
														dniText,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(nombreLabel)
												.addComponent(
														nombreText,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(apellidosLabel)
												.addComponent(
														apellidosText,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(direccionLabel)
												.addComponent(
														direccionText,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(localidadLabel)
												.addComponent(
														localidadText,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(cpLabel)
												.addComponent(
														cpText,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(municipioLabel)
												.addComponent(
														municipioText,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(telefonoLabel)
												.addComponent(
														telefonoText,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(telefono2Label)
												.addComponent(
														telefono2Text,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										44, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(insert)
												.addComponent(
														animalButtonCliente)
												.addComponent(atrasButton)
												.addComponent(salirButton))
								.addContainerGap()));

		pack();
		setLocationRelativeTo(null);
	}

	/**
	 * Al seleccionar guardar, nos muestra un mensaje de confirmaci�n.
	 * 	Si aceptamos nos lo almacena en la base de datos
	 * 	Si no aceptamos, nos volvemos a la pantalla de insertar.
	 * @param evt
	 */
	private void insertActionPerformed(java.awt.event.ActionEvent evt) {
		sacarString();

		PopUpWindow popUpMsg = new PopUpWindow(this, rootPaneCheckingEnabled);
		String textoLabel;

		if (getNombre() == null) {
			textoLabel = "�Dese agregar a  ";
		} else {
			textoLabel = "�Desea agregar a " + getNombre();
		}
		if (getApellidos() == null) {
			textoLabel = textoLabel + "   a BUSCAMASCOTAS?";
		} else {
			textoLabel = textoLabel + " " + getApellidos()
					+ " a BUSCAMASCOTAS?";
		}

		popUpMsg.setLabelPopup(textoLabel);
		popUpMsg.setVisible(true);

		int devolucion = popUpMsg.getReturnStatus();
		if (devolucion == 1 && getNombre() != null && getDNI() != null) {
			con.conectar();
			sacarString();
			ins.insertar(getSql());

		}
		ins.desconectar();
	}

	/**
	 * Al pulsar A�ADIR ANIMAL, nos lleva a la ventana InsertarAnimal
	 * 
	 * @param evt
	 */
	private void animalButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {
		System.out.println(getDNI()+ "este es el dni del cliente insertar cliente");
		InsertarAnimal.main(getDNI());
		setVisible(false);
	}

	/**
	 * Al pulsar ATRAS, nos lleva a la ventana MenuPrincipal.
	 * 
	 * @param evt
	 */
	private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {
		MenuPrincipal.main();
		this.setVisible(false);
	}

	/**
	 * Si se pulsa salir, salta un confirmdialog.
	 * 	Si seleccionas SI sales del sistema
	 * 	Si seleccinas NO, te mantienes en el.
	 * 
	 * @param evt
	 */
	private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {
		int eleccion = JOptionPane.showConfirmDialog(null, "�Desea salir?");

		if (eleccion == 0) {
			JOptionPane.showMessageDialog(null, "Saliendo del sistema");
			// TODO agregar subida de datos a dropbox. COPIA DE
			// SEGURIDAD.
			System.exit(0);
		}
	}

	/**
	 * Si se pulsa la X, salta un confirmdialog.
	 * 	Si seleccionas SI sales del sistema
	 * 	Si seleccinas NO, te mantienes en el.
	 * 
	 * @param evt
	 */
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
	 * Obtenemos los datos de los text y creamos la sentencia sql.
	 */
	private void sacarString() {
		setDNI(dniText.getText());
		setNombre(nombreText.getText());
		setApellidos(apellidosText.getText());
		String direccion = direccionText.getText();
		String localidad = localidadText.getText();
		String cp = cpText.getText();
		String municipio = municipioText.getText();
		String telefono1 = telefonoText.getText();
		String telefono2 = telefono2Text.getText();

		setSql("insert into clientes(DNI,NOM_CLIENTE,APELLIDOS,DIRECCION,LOCALIDAD,CP,"
				+ "MUNICIPIO,TELEFONO1,TELEFONO2) VALUES ('"
				+ getDNI()
				+ "','"
				+ getNombre()
				+ "'"
				+ ",'"
				+ getApellidos()
				+ "','"
				+ direccion
				+ "','"
				+ localidad
				+ "','"
				+ cp
				+ "'"
				+ ",'"
				+ municipio
				+ "','" + telefono1 + "','" + telefono2 + "');");
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
			java.util.logging.Logger.getLogger(InsertarCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(InsertarCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(InsertarCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(InsertarCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new InsertarCliente().setVisible(true);
			}
		});
	}

	//Declaraci�n de variables
	private javax.swing.JButton animalButtonCliente;
	private javax.swing.JLabel apellidosLabel;
	private javax.swing.JTextField apellidosText;
	private javax.swing.JButton atrasButton;
	private javax.swing.JLabel cpLabel;
	private javax.swing.JTextField cpText;
	private javax.swing.JLabel direccionLabel;
	private javax.swing.JTextField direccionText;
	private javax.swing.JLabel dniLabel;
	private javax.swing.JTextField dniText;
	private javax.swing.JButton insert;
	private javax.swing.JDialog jDialog1;
	private javax.swing.JDialog jDialog2;
	private javax.swing.JDialog jDialog3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel localidadLabel;
	private javax.swing.JTextField localidadText;
	private javax.swing.JLabel municipioLabel;
	private javax.swing.JTextField municipioText;
	private javax.swing.JLabel nombreLabel;
	private javax.swing.JTextField nombreText;
	private javax.swing.JButton salirButton;
	private javax.swing.JLabel telefono2Label;
	private javax.swing.JTextField telefono2Text;
	private javax.swing.JLabel telefonoLabel;
	private javax.swing.JTextField telefonoText;
}
