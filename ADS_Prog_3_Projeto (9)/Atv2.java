package Exec_2c_ex2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;



public class Atv2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextArea nome;
	private JTextArea telefone;
	private JTextArea email;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnGravar;
	private JScrollPane scrollPane;
	private JTextArea info;
	private JTextArea buscaContato;
	private JButton leitura;
	private JLabel lblNewLabel_4;
	private JComboBox<?> ocupacao;
	private JButton limpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atv2 frame = new Atv2();
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
	public Atv2() {
		initComponents();
		
	}
	
	
	public void acaoGravar() {
		Arquivo arq = new Arquivo("teste");
		arq.gravar(nome.getText(),email.getText(),telefone.getText(),ocupacao.getSelectedItem()+"");
		
	}
	
	public void acaoLer() {
		File f = new File(this.buscaContato.getText()+".txt");
		Arquivo arq = new Arquivo(buscaContato.getText()+"");
		if(f.exists() && !f.isDirectory()) {
			info.setText((arq.ler())+"");
			   JOptionPane.showMessageDialog(null, "Arquivo existe.");
			   
			}
		
	}
		
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 506);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		
		this.lblNewLabel = new JLabel("Agenda de Contatos");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		this.telefone = new JTextArea();
		this.telefone.setText("Digite seu Telefone");
		
		this.email = new JTextArea();
		this.email.setText("Digite seu E-mail");
		
		this.lblNewLabel_1 = new JLabel("Nome:");
		
		lblNewLabel_2 = new JLabel("Telefone:");
		
		this.lblNewLabel_3 = new JLabel("E-mail:");
		
		this.btnGravar = new JButton("Gravar");
		this.btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoGravar();
			}
		});
		
		this.scrollPane = new JScrollPane();
		
		this.nome = new JTextArea();
		this.nome.setText("Digite seu nome");
		
		this.buscaContato = new JTextArea();
		this.buscaContato.setText("Digite o nome do Contato");
		
		this.leitura = new JButton("Ler");
		this.leitura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoLer();	
			}
		});
		
		this.lblNewLabel_4 = new JLabel("Buscar Contato");
		this.lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		this.ocupacao = new JComboBox();
		this.ocupacao.setModel(new DefaultComboBoxModel(new String[] {"Profissional", "Pessoal"}));
		
		this.limpar = new JButton("Limpar Texto");
		this.limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome.setText(" ");
				telefone.setText(" ");
				email.setText(" ");
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap(16, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(this.lblNewLabel_3)
										.addGap(18)
										.addComponent(this.email, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(this.lblNewLabel_1)
										.addGap(18)
										.addComponent(this.nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(this.lblNewLabel_2)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(this.telefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(71)
										.addComponent(this.lblNewLabel)))
								.addGap(225))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(this.ocupacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(this.btnGravar)
							.addGap(20)
							.addComponent(this.limpar)
							.addGap(311)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(this.leitura)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(this.buscaContato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(this.scrollPane, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
						.addComponent(this.lblNewLabel_4))
					.addGap(234))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(this.lblNewLabel)
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.lblNewLabel_1)
						.addComponent(this.nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addComponent(this.lblNewLabel_4)
							.addGap(18)
							.addComponent(this.buscaContato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(this.leitura)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(this.scrollPane, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(this.lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.telefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(this.lblNewLabel_3)
								.addComponent(this.email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(this.ocupacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(this.btnGravar)
								.addComponent(this.limpar))))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		
		this.info = new JTextArea();
		this.info.setLineWrap(true);
		this.scrollPane.setViewportView(this.info);
		this.contentPane.setLayout(gl_contentPane);
	}
}
