package Exemplo3b;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField nome;
	private JTextField email;
	private JTextField cargo;
	private JButton cadastrar;
	static TelaCadastro frame;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the panel.
	 */
	
	private void acaoCadastro() {
		if(nome.getText().isEmpty() || email.getText().isEmpty() || cargo.getText().isEmpty() ) {
			JOptionPane.showMessageDialog(null,"Digite todos os Campos.");	
		}else {
			Funcionario f = new Funcionario(nome.getText(),email.getText(),cargo.getText());
		    FuncionarioDao fdao = new FuncionarioDao();		
			fdao.inserir(f);
			JOptionPane.showMessageDialog(null,"Inserido com Sucesso.");
			nome.setText("");
			email.setText("");
			cargo.setText("");
			Principal.frame.setContentPane(new Padrao());
			Principal.frame.setVisible(true);
		}
	}
	
	
	public TelaCadastro() {
		initComponents();
		setBounds(100, 100, 600, 300);
		
	}
	private void initComponents() {
		
		
		setLayout(new MigLayout("", "[grow][46px][443.00px][grow]", "[grow][38.00][14px][20px][20px][20px][][23px][grow]"));
		
		this.lblNewLabel = new JLabel("Cadastrar Funcionário");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		add(this.lblNewLabel, "cell 2 1,alignx center,aligny top");
		
		this.lblNewLabel_1 = new JLabel("Nome:");
		add(this.lblNewLabel_1, "cell 1 2,alignx left,aligny center");
		
		this.nome = new JTextField();
		this.nome.setColumns(10);
		add(this.nome, "cell 2 2,growx,aligny top");
		
		this.lblNewLabel_2 = new JLabel("E-mail:");
		add(this.lblNewLabel_2, "cell 1 3,alignx left,aligny bottom");
		
		this.email = new JTextField();
		this.email.setColumns(10);
		add(this.email, "cell 2 3,growx,aligny top");
		
		this.lblNewLabel_3 = new JLabel("Cargo:");
		add(this.lblNewLabel_3, "cell 1 4,alignx left,aligny center");
		
		this.cargo = new JTextField();
		this.cargo.setColumns(10);
		add(this.cargo, "cell 2 4,growx,aligny top");
		
		this.cadastrar = new JButton("Cadastrar");
		this.cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCadastro();
			}
		});
		this.cadastrar.setForeground(Color.ORANGE);
		this.cadastrar.setBackground(Color.BLACK);
		add(this.cadastrar, "cell 2 6,growx,aligny top");
	}
	


}
