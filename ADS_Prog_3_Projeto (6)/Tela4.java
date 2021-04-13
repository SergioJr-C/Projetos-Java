package Exec_2b_ex4;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class Tela4 extends JFrame {

	private JPanel contentPane;
	private JCheckBox checkbox1;
	private JCheckBox checkbox2;
	private JCheckBox checkbox3;
	private JCheckBox checkbox4;
	private JCheckBox checkbox5;
	private JTextField saida;
	private JButton btnNewButton;
	private LinkedList<JCheckBox> lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela4 frame = new Tela4();
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
		for(JCheckBox chk : lista) {
			if(chk.isSelected()) {
				selecionados += chk.getText() + " ";
			}
		}
		saida.setText(selecionados);
	}
	
	public Tela4() {
		initComponents();
		
		lista = new LinkedList<JCheckBox>();
		
		lista.add(checkbox1);
		lista.add(checkbox2);
		lista.add(checkbox3);
		lista.add(checkbox4);
		lista.add(checkbox5);
		
		for(JCheckBox chk : lista) {
			chk.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
						
				}
		
			});
		}
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 336);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		
		this.checkbox1 = new JCheckBox("Opção 1");
		
		this.checkbox2 = new JCheckBox("Opção 2");
		
		this.checkbox3 = new JCheckBox("Opção 3");
		
		this.checkbox4 = new JCheckBox("Opção 4");
		
		this.checkbox5 = new JCheckBox("Opção 5");
		
		this.saida = new JTextField();
		this.saida.setColumns(10);
		
		this.btnNewButton = new JButton("Executar");
		this.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao();
		}
										
		});
		GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(this.btnNewButton)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(this.checkbox3)
							.addComponent(this.checkbox2)
							.addComponent(this.checkbox1)
							.addComponent(this.checkbox4)
							.addComponent(this.checkbox5)))
					.addGap(27)
					.addComponent(this.saida, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(49)
							.addComponent(this.saida))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addComponent(this.checkbox1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(this.checkbox2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(this.checkbox3)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(this.checkbox4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(this.checkbox5)
							.addGap(36)
							.addComponent(this.btnNewButton)))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		this.contentPane.setLayout(gl_contentPane);
	}

}
