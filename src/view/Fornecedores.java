package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

public class Fornecedores extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

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
		setBounds(100, 100, 741, 639);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fornecedor");
		lblNewLabel.setBounds(30, 39, 83, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(48, 137, 36, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CNPJ");
		lblNewLabel_3.setBounds(200, 137, 36, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("IE");
		lblNewLabel_4.setBounds(359, 137, 21, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("IM");
		lblNewLabel_5.setBounds(512, 137, 21, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Bairro");
		lblNewLabel_6.setBounds(48, 498, 46, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Cidade");
		lblNewLabel_7.setBounds(282, 498, 46, 14);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Complemento");
		lblNewLabel_8.setBounds(481, 427, 83, 14);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("N\u00FAmero");
		lblNewLabel_9.setBounds(303, 427, 46, 14);
		getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Endere\u00E7o");
		lblNewLabel_10.setBounds(48, 427, 59, 14);
		getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("CEP");
		lblNewLabel_11.setBounds(338, 361, 36, 14);
		getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Raz\u00E3o");
		lblNewLabel_12.setBounds(30, 208, 46, 14);
		getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Nome da fantasia");
		lblNewLabel_13.setBounds(263, 208, 102, 14);
		getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Site");
		lblNewLabel_14.setBounds(512, 208, 33, 14);
		getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Telefone");
		lblNewLabel_15.setBounds(197, 285, 56, 14);
		getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Email");
		lblNewLabel_16.setBounds(10, 361, 34, 14);
		getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("UF");
		lblNewLabel_17.setBounds(498, 498, 26, 14);
		getContentPane().add(lblNewLabel_17);
		
		textField = new JTextField();
		textField.setBounds(103, 36, 129, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(79, 134, 111, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(243, 134, 106, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(389, 134, 113, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(548, 134, 106, 20);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Fornecedores.class.getResource("/icones/search3.png")));
		lblNewLabel_1.setBounds(242, 39, 32, 20);
		getContentPane().add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(79, 205, 174, 20);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(371, 205, 118, 20);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(555, 205, 160, 20);
		getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(254, 282, 95, 20);
		getContentPane().add(textField_8);
		
		JLabel lblNewLabel_18 = new JLabel("Contato");
		lblNewLabel_18.setBounds(387, 285, 46, 14);
		getContentPane().add(lblNewLabel_18);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(447, 282, 86, 20);
		getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(54, 358, 195, 20);
		getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(384, 358, 110, 20);
		getContentPane().add(textField_11);
		
		JButton btnNewButton = new JButton("Buscar CEP");
		btnNewButton.setBounds(512, 357, 115, 23);
		getContentPane().add(btnNewButton);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(117, 424, 160, 20);
		getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(359, 424, 86, 20);
		getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(565, 424, 150, 20);
		getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(95, 495, 111, 20);
		getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(338, 495, 95, 20);
		getContentPane().add(textField_16);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(538, 494, 89, 22);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel_19 = new JLabel("Observa\u00E7\u00E3o");
		lblNewLabel_19.setBounds(48, 551, 74, 14);
		getContentPane().add(lblNewLabel_19);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textArea.setBounds(137, 546, 191, 43);
		getContentPane().add(textArea);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon(Fornecedores.class.getResource("/icones/adicionar.png")));
		btnNewButton_1.setBounds(397, 546, 48, 48);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Fornecedores.class.getResource("/icones/subtract.png")));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(556, 546, 48, 48);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setIcon(new ImageIcon(Fornecedores.class.getResource("/icones/restart2.png")));
		btnNewButton_3.setBounds(481, 546, 48, 48);
		getContentPane().add(btnNewButton_3);

	}// Fim do construtor
}
