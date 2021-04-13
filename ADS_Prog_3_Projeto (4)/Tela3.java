package Exec_2b_ex2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela3 extends JFrame {

	private JPanel contentPane;
	private JCheckBox checkbox1;
	private JCheckBox checkbox2;
	private JCheckBox checkbox3;
	private JButton btnNewButton;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela3 frame = new Tela3();
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
	public Tela3() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		
		this.checkbox1 = new JCheckBox("Item 1");
		
		this.checkbox2 = new JCheckBox("Item 2");
		
		this.checkbox3 = new JCheckBox("Item 3");
		
		this.btnNewButton = new JButton("Mostrar");
		this.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkbox1.setSelected(true);
				checkbox1.setText("Economia de energia elétrica");
				checkbox2.setSelected(true);
				checkbox2.setText("Reaproveitamento de Água");
				checkbox3.setSelected(true);
				checkbox3.setText("Trabalhos Voluntários");
			}
		});
		
		this.lblNewLabel = new JLabel("Ações que Pratico");
		GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(69)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(this.checkbox3)
								.addComponent(this.checkbox2)
								.addComponent(this.checkbox1)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(51)
							.addComponent(this.btnNewButton)
							.addGap(26)
							.addComponent(this.lblNewLabel)))
					.addContainerGap(212, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addComponent(this.checkbox1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(this.checkbox2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(this.checkbox3)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.btnNewButton)
						.addComponent(this.lblNewLabel))
					.addContainerGap(103, Short.MAX_VALUE))
		);
		this.contentPane.setLayout(gl_contentPane);
	}
}
