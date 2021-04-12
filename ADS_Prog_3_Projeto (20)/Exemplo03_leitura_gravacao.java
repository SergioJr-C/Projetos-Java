package Exemplo03;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Exemplo03_leitura_gravacao extends JFrame {

	private JPanel contentPane;
	private JTextArea texto;
	private JButton gravar;
	private JButton leitura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemplo03_leitura_gravacao frame = new Exemplo03_leitura_gravacao();
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
	public Exemplo03_leitura_gravacao() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		
		this.texto = new JTextArea();
		this.texto.setText("Digite aqui ");
		
		this.gravar = new JButton("Gravar Arquivo");
		this.gravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arquivo arq = new Arquivo();
				arq.gravar(texto.getText());
			}
		});
		
		this.leitura = new JButton("Ler Arquivo");
		this.leitura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Arquivo arq = new Arquivo();
				texto.setText(arq.ler());
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(134)
							.addComponent(this.texto, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(68)
							.addComponent(this.gravar)
							.addGap(44)
							.addComponent(this.leitura)))
					.addContainerGap(116, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(70)
					.addComponent(this.texto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.gravar)
						.addComponent(this.leitura))
					.addContainerGap(98, Short.MAX_VALUE))
		);
		this.contentPane.setLayout(gl_contentPane);
	}
}
