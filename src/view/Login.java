package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DAO;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				status();
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/icones/icons.png")));
		setResizable(false);
		setTitle("Style Tennis - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(114, 67, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(170, 64, 86, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(114, 119, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(170, 116, 86, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAcessar.setBounds(283, 185, 89, 23);
		contentPane.add(btnAcessar);
		
		JLabel lblNewLabel_2 = new JLabel("Styles Tennis");
		lblNewLabel_2.setBounds(170, 11, 78, 14);
		contentPane.add(lblNewLabel_2);
		
		lblStatus = new JLabel("New label");
		lblStatus.setIcon(new ImageIcon(Login.class.getResource("/icones/dboff.png")));
		lblStatus.setBounds(61, 172, 48, 48);
		contentPane.add(lblStatus);
	}// fim do construtor
	
	// Criação de um objeto para acessar a camada model
	
DAO dao = new DAO();
private JLabel lblStatus;
	
	/**
	 * Método usado para verificar o status do servidor 
	 */
	
	private void status() {
		try {
			// Abrir conexão
			Connection con = dao.conectar();
			if ( con == null ) {
				// Escolher a imagem
				lblStatus.setIcon(new ImageIcon(Login.class.getResource("/icones/dboff.png")));
			} else {
				lblStatus.setIcon(new ImageIcon(Login.class.getResource("/icones/dbon.png")));
			}
			// Não esquecer de fechar a conexão
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		} 
	}
}// fim do codigo
