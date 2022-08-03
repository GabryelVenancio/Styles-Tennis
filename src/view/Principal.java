package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.text.DateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		addWindowListener(new WindowAdapter() {
			// Evento ativar janela
			@Override
			public void windowActivated(WindowEvent e) {
				  Date data = new Date();
				  DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
				  lblData.setText(formatador.format(data));
				}
		});
		setResizable(false);
		setTitle("Styles Tennis");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/icones/icons.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			// Evento clicar botão
						public void actionPerformed(ActionEvent e) {
							// Link para o jDialog
							Fornecedores fornecedores = new Fornecedores();
							fornecedores.setVisible(true);
							}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setToolTipText("Fornecedores");
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/icones/provider.png")));
		btnNewButton.setBounds(20, 11, 128, 128);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			// Evento clicar botão
						public void actionPerformed(ActionEvent e) {
							// Link para o jDialog
							Clientes clientes = new Clientes();
							clientes.setVisible(true);
							}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setIcon(new ImageIcon(Principal.class.getResource("/icones/clients.png")));
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setToolTipText("Clientes");
		btnNewButton_2.setBounds(218, 11, 128, 128);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setIcon(new ImageIcon(Principal.class.getResource("/icones/users.png")));
		btnNewButton_3.addActionListener(new ActionListener() {
			// Evento clicar botão
			public void actionPerformed(ActionEvent e) {
				// Link para o jDialog
				Usuarios usuarios = new Usuarios();
				usuarios.setVisible(true);
				}
		});
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setToolTipText("Usu\u00E1rios");
		btnNewButton_3.setBounds(610, 11, 128, 128);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			// Evento clicar botão
						public void actionPerformed(ActionEvent e) {
							// Link para o jDialog
							Produtos produtos = new Produtos();
							produtos.setVisible(true);
							}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(new ImageIcon(Principal.class.getResource("/icones/products.png")));
		btnNewButton_1.setToolTipText("Produtos");
		btnNewButton_1.setBounds(424, 11, 128, 128);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			// Evento clicar botão
						public void actionPerformed(ActionEvent e) {
							// Link para o jDialog
							Vendas vendas = new Vendas();
							vendas.setVisible(true);
							}
		});
		btnNewButton_4.setToolTipText("Vendas");
		btnNewButton_4.setIcon(new ImageIcon(Principal.class.getResource("/icones/sell.png")));
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setBounds(20, 194, 128, 128);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			// Evento clicar botão
						public void actionPerformed(ActionEvent e) {
							// Link para o jDialog
							Relatorio relatorio = new Relatorio();
							relatorio.setVisible(true);
							}
		});
		btnNewButton_5.setToolTipText("Rel\u00E1torio");
		btnNewButton_5.setIcon(new ImageIcon(Principal.class.getResource("/icones/relatorio.png")));
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_5.setBounds(218, 194, 128, 128);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setToolTipText("Ferramentas");
		btnNewButton_6.setIcon(new ImageIcon(Principal.class.getResource("/icones/ferramentas.png")));
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_6.addActionListener(new ActionListener() {
			// Evento clicar botão
						public void actionPerformed(ActionEvent e) {
							// Link para o jDialog
							Ferramentas ferramentas = new Ferramentas();
							ferramentas.setVisible(true);
							}
		});
		btnNewButton_6.setBounds(424, 194, 128, 128);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setToolTipText("Sobre");
		btnNewButton_7.setIcon(new ImageIcon(Principal.class.getResource("/icones/sobre.png")));
		btnNewButton_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_7.addActionListener(new ActionListener() {
			// Evento clicar botão
						public void actionPerformed(ActionEvent e) {
							// Link para o jDialog
							Sobre sobre = new Sobre();
							sobre.setVisible(true);
							}
		});
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/icones/dunk.png")));
		lblNewLabel.setBounds(0, 409, 128, 128);
		contentPane.add(lblNewLabel);
		btnNewButton_7.setBounds(610, 194, 128, 128);
		contentPane.add(btnNewButton_7);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 180, 209));
		panel.setBounds(0, 512, 784, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblData = new JLabel("New label");
		lblData.setBounds(550, 11, 213, 27);
		panel.add(lblData);
	}// fim do construtor
}
