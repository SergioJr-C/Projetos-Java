package Exec_2b_ex5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;


public class Tela5 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JRadioButton rb1;
	private JRadioButton rb2;
	private JTextField nome;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JLabel saida;
	private final ButtonGroup grupo = new ButtonGroup();
	private LinkedList<JRadioButton> lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela5 frame = new Tela5();
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
	
	private void botao() {
		String selecionados = "";
		for(JRadioButton rb : lista) {
			if(rb.isSelected()) {
				selecionados += rb.getText() + ", " + nome.getText();
				break;
			}
		}
		saida.setText(selecionados);
	}
	
	public Tela5() {
		initComponents();
		
		lista = new LinkedList<JRadioButton>();
		lista.add(rb1);
		lista.add(rb2);
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 397);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		
		this.lblNewLabel = new JLabel("Estado Civil:");
		
		this.rb1 = new JRadioButton("Solteiro");
		grupo.add(this.rb1);
		
		this.rb2 = new JRadioButton("Casado");
		grupo.add(this.rb2);
		
		this.nome = new JTextField();
		this.nome.setColumns(10);
		
		this.lblNewLabel_1 = new JLabel("Nome:");
		this.lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		this.btnNewButton = new JButton("Mostrar");
		this.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao();
				
			}
		});
		
		this.saida = new JLabel("New label");
		this.saida.setFont(new Font("Verdana", Font.BOLD, 36));
		GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addComponent(this.lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(this.nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
					.addComponent(this.saida)
					.addGap(150))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(this.rb1)
						.addComponent(this.lblNewLabel)
						.addComponent(this.rb2)
						.addComponent(this.btnNewButton))
					.addContainerGap(498, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(140)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(this.lblNewLabel_1)
								.addComponent(this.nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(this.lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(this.rb1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(this.rb2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(this.btnNewButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(119)
							.addComponent(this.saida)))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		this.contentPane.setLayout(gl_contentPane);
	}
}
