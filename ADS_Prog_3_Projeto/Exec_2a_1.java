package Exec_2a_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class Exec_2a_1 extends JFrame {

	private JPanel contentPane;
	private JLabel nome;
	private JLabel cor;
	private JLabel anofabri;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exec_2a_1 frame = new Exec_2a_1();
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
	public Exec_2a_1() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		Veiculo veiculo = new Veiculo();
		
		this.nome = new JLabel("Nome: " + veiculo.getNome());
		
		this.cor = new JLabel("Cor: " + veiculo.getCor());
		
		this.anofabri = new JLabel("Ano de Fabricação: " + veiculo.getAnoFabri());
		
		GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(159)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(this.nome)
						.addComponent(this.cor)
						.addComponent(this.anofabri))
					.addContainerGap(176, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(63)
					.addComponent(this.nome)
					.addGap(18)
					.addComponent(this.cor)
					.addGap(18)
					.addComponent(this.anofabri)
					.addContainerGap(110, Short.MAX_VALUE))
		);
		this.contentPane.setLayout(gl_contentPane);
	}

}
