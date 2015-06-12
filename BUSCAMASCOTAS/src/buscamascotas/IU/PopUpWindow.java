/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscamascotas.IU;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author Alberto
 */
public class PopUpWindow extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1885539861210811176L;
	/**
	 * A return status code - returned if Cancel button has been pressed
	 */
	public static final int RET_CANCEL = 0;
	/**
	 * A return status code - returned if OK button has been pressed
	 */
	public static final int RET_OK = 1;

	/**
	 * Creates new form PopUpWindow
	 */
	public PopUpWindow(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();

		// Close the dialog when Esc is pressed
		String cancelName = "cancel";
		InputMap inputMap = getRootPane().getInputMap(
				JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
		ActionMap actionMap = getRootPane().getActionMap();
		actionMap.put(cancelName, new AbstractAction() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 2556116529146854140L;

			public void actionPerformed(ActionEvent e) {
				doClose(RET_CANCEL);
			}
		});
	}

	/**
	 * @return the return status of this dialog - one of RET_OK or RET_CANCEL
	 */
	public int getReturnStatus() {
		return returnStatus;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {

		okButton = new javax.swing.JButton();
		cancelButton = new javax.swing.JButton();
		labelPopup = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();

		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				closeDialog(evt);
			}
		});

		okButton.setText("OK");
		okButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				okButtonActionPerformed(evt);
			}
		});

		cancelButton.setText("Cancel");
		cancelButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelButtonActionPerformed(evt);
			}
		});

		labelPopup.setFont(new java.awt.Font("SansSerif", 1, 12)); 
		
		jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); 
		jLabel2.setText("BUSCAMASCOTAS");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														labelPopup,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGap(0,
																		679,
																		Short.MAX_VALUE)
																.addComponent(
																		okButton,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		67,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		cancelButton))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel2)
																.addGap(0,
																		0,
																		Short.MAX_VALUE)))
								.addContainerGap()));

		layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { cancelButton, okButton });

		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel2)
								.addGap(28, 28, 28)
								.addComponent(labelPopup,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										53, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(cancelButton)
												.addComponent(okButton))
								.addContainerGap()));

		getRootPane().setDefaultButton(okButton);

		pack();
		setLocationRelativeTo(null);
	}
	private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
		doClose(RET_OK);
	}
	
	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
		doClose(RET_CANCEL);
	}
	
	/**
	 * Closes the dialog
	 */
	private void closeDialog(java.awt.event.WindowEvent evt) {
		doClose(RET_CANCEL);
	}
	
	private void doClose(int retStatus) {
		returnStatus = retStatus;
		setVisible(false);
		dispose();
	}

	public void setLabelPopup(String s) {
		labelPopup.setText(s);
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
			java.util.logging.Logger.getLogger(PopUpWindow.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PopUpWindow.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PopUpWindow.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PopUpWindow.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				PopUpWindow dialog = new PopUpWindow(new javax.swing.JFrame(),
						true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

	//Declaración de variables
	private javax.swing.JButton cancelButton;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel labelPopup;
	private javax.swing.JButton okButton;

	private int returnStatus = RET_CANCEL;
}
