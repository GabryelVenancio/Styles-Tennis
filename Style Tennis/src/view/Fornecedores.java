package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;

public class Fornecedores extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedores dialog = new Fornecedores();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Fornecedores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fornecedores.class.getResource("/icones/icons.png")));
		setTitle("Fornecedores");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 450, 359);
		getContentPane().setLayout(null);

	}// Fim do construtor

}
