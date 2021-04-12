package Exemplo3b;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {
	private JTextField nome;
	private JTextField email;
	private JTextField cargo;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
		}
	}
	
	public Cadastro() {
		initComponents();
		setLocationRelativeTo(null);
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 411);
		
		this.nome = new JTextField();
		this.nome.setColumns(10);
		
		this.email = new JTextField();
		this.email.setColumns(10);
		
		this.cargo = new JTextField();
		this.cargo.setColumns(10);
		
		this.lblNewLabel = new JLabel("Nome:");
		
		this.lblNewLabel_1 = new JLabel("Email:");
		
		this.lblNewLabel_2 = new JLabel("Cargo:");
		getContentPane().setLayout(new MigLayout("", "[grow 80][56px][552.00px][grow]", "[][14px][20px][20px][20px][][]"));
		
		this.lblNewLabel_4 = new JLabel("Cadastrar Funcionário");
		this.lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblNewLabel_4.setLabelFor(this.lblNewLabel_4);
		this.lblNewLabel_4.setBackground(Color.ORANGE);
		this.lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		getContentPane().add(this.lblNewLabel_4, "cell 2 0,alignx center");
		getContentPane().add(this.nome, "cell 2 2,growx,aligny top");
		getContentPane().add(this.email, "cell 2 3,growx,aligny top");
		getContentPane().add(this.cargo, "cell 2 4,growx,aligny top");
		getContentPane().add(this.lblNewLabel, "cell 1 2,alignx left,aligny center");
		getContentPane().add(this.lblNewLabel_1, "cell 1 3,alignx left,aligny center");
		getContentPane().add(this.lblNewLabel_2, "cell 1 4,alignx left,aligny center");
		
		this.btnNewButton = new JButton("Cadastrar Funcionário");
		this.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCadastro();
			}
		});
		this.btnNewButton.setForeground(Color.ORANGE);
		this.btnNewButton.setBackground(Color.BLACK);
		getContentPane().add(this.btnNewButton, "cell 2 6,growx");
	}
}
