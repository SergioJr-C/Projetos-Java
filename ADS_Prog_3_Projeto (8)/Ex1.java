package Exec_2c_ex1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex1 extends JFrame {

	private JPanel contentPane;
	private JTextArea entrada;
	private JButton gravar;
	private JButton leitura;
	private JButton limpar;
	private JTextArea nomeArq;
	private JButton gravarArq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1 frame = new Ex1();
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
	private void acaoLer() {
		Arquivo arq = new Arquivo();
		entrada.setText(arq.ler());
	}
	
	private void acaoGravar() {
		Arquivo arq = new Arquivo();
		arq.gravar(entrada.getText());
	}
	
	public Ex1() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 317);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		
		this.entrada = new JTextArea();
		this.entrada.setText("Digite Aqui");
		
		this.gravar = new JButton("Gravar Arquivo");
		this.gravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			acaoGravar();
			}
		});
		
		this.leitura = new JButton("Ler Arquivo");
		this.leitura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			acaoLer();
			}
		});
		
		this.limpar = new JButton("Limpar texto");
		this.limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entrada.setText(" ");
				nomeArq.setText(" ");
			}
		});
		
		this.nomeArq = new JTextArea();
		this.nomeArq.setText("Digite o nome do Arquivo");
		
		this.gravarArq = new JButton("Gravar nome do Arquivo");
		this.gravarArq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arquivo arq = new Arquivo();
				arq.gravarArq(nomeArq.getText());
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(this.limpar, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(this.entrada, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
									.addGap(18))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(this.nomeArq, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(57)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(this.gravar)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(this.leitura))
								.addComponent(this.gravarArq))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(this.entrada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(this.gravar)
							.addComponent(this.leitura)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(this.nomeArq, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(this.gravarArq)))
					.addGap(28)
					.addComponent(this.limpar)
					.addContainerGap(98, Short.MAX_VALUE))
		);
		this.contentPane.setLayout(gl_contentPane);
	}

}
