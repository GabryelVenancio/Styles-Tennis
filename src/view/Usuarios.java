package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.DAO;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Usuarios extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtUsuId;
	private JTextField txtUsuNome;
	private JTextField txtUsuLogin;
	private JPasswordField txtUsuSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuarios dialog = new Usuarios();
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
	public Usuarios() {
		setModal(true);
		setTitle("Usu\u00E1rios");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Usuarios.class.getResource("/icones/icons.png")));
		setBounds(100, 100, 566, 401);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(52, 39, 46, 14);
		getContentPane().add(lblNewLabel);
		
		txtUsuId = new JTextField();
		txtUsuId.setBounds(98, 36, 86, 20);
		getContentPane().add(txtUsuId);
		txtUsuId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usu\u00E1rio");
		lblNewLabel_1.setBounds(52, 88, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		txtUsuNome = new JTextField();
		txtUsuNome.setBounds(104, 86, 208, 17);
		getContentPane().add(txtUsuNome);
		txtUsuNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setBounds(52, 136, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		txtUsuLogin = new JTextField();
		txtUsuLogin.setBounds(98, 133, 86, 20);
		getContentPane().add(txtUsuLogin);
		txtUsuLogin.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setBounds(52, 183, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Perfil");
		lblNewLabel_4.setBounds(266, 136, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		cboUsuPerfil = new JComboBox();
		cboUsuPerfil.setModel(new DefaultComboBoxModel(new String[] {"", "admin", "user"}));
		cboUsuPerfil.setBounds(315, 132, 86, 22);
		getContentPane().add(cboUsuPerfil);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisarUsuario();
			}
		});
		btnPesquisar.setContentAreaFilled(false);
		btnPesquisar.setBorderPainted(false);
		btnPesquisar.setIcon(new ImageIcon(Usuarios.class.getResource("/icones/search3.png")));
		btnPesquisar.setBounds(193, 36, 24, 20);
		getContentPane().add(btnPesquisar);
		
		JButton btnAdicionar = new JButton("");
		btnAdicionar.setContentAreaFilled(false);
		btnAdicionar.setBorderPainted(false);
		btnAdicionar.setForeground(Color.WHITE);
		btnAdicionar.setBackground(Color.WHITE);
		btnAdicionar.setIcon(new ImageIcon(Usuarios.class.getResource("/icones/useradd.png")));
		btnAdicionar.setBounds(120, 239, 64, 64);
		getContentPane().add(btnAdicionar);
		
		JButton btnRemover = new JButton("");
		btnRemover.setBorderPainted(false);
		btnRemover.setContentAreaFilled(false);
		btnRemover.setIcon(new ImageIcon(Usuarios.class.getResource("/icones/userremove.png")));
		btnRemover.setBounds(366, 239, 64, 64);
		getContentPane().add(btnRemover);
		
		JButton btnAlterar = new JButton("");
		btnAlterar.setBorderPainted(false);
		btnAlterar.setContentAreaFilled(false);
		btnAlterar.setIcon(new ImageIcon(Usuarios.class.getResource("/icones/restart.png")));
		btnAlterar.setBounds(248, 239, 64, 64);
		getContentPane().add(btnAlterar);
		
		txtUsuSenha = new JPasswordField();
		txtUsuSenha.setBounds(98, 180, 225, 20);
		getContentPane().add(txtUsuSenha);

	}// Fim do construtor
	
	DAO dao = new DAO();
	private JComboBox cboUsuPerfil;
	
	/**
	 * Método responsável pela pesquisa de usuários
	 */
	
	private void pesquisarUsuario() {
		// validação
		if(txtUsuId.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Digite o id do usuário");
			txtUsuId.requestFocus();
		} else {
			// lógica principal
			// Query (instrução SQl)
			String read = "select * from usuarios where idusu = ?";
			// Tratar exceções sempre que lidar com o banco
			try {
				// Estabelecer a conexão
				Connection con = dao.conectar();
				// Preparar a execução da query
				PreparedStatement pst = con.prepareStatement(read);
				// Setar argumento (id)
				// Substituir o ? pelo conteúdo da caixa de texto
				pst.setString(1, txtUsuId.getText());
				// Executar a query e exibir o resultado no formulario
				ResultSet rs = pst.executeQuery();
				// Validação (existência de usuário)
				// rs.next() -> existência de usuário
				if (rs.next()) {
					// Preencher(setar) os campos no formulário
					txtUsuNome.setText(rs.getString(2));
					txtUsuLogin.setText(rs.getString(3));
					txtUsuSenha.setText(rs.getString(4));
					cboUsuPerfil.setSelectedItem(rs.getString(5));
				} else {
					JOptionPane.showMessageDialog(null, "Usuário inexistente");
				}
				// Nunca esquecer de encerrar a conexão
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
}// Fim do código














