package Exec_2b_ex1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

public class Tela1 extends JFrame {

	private JPanel contentPane;
	private JButton soma;
	private JButton subtracao;
	private JButton multiplicacao;
	private JButton divisao;
	private JTextField var1;
	private JTextField var2;
	private JTextField resultado;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		initComponents();
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		
		Calculadora calc = new Calculadora();
//		Scanner s = new Scanner(System.in);
//		System.out.println("Digite o valor 1: ");
//		calc.setV1(s.nextDouble());
//		System.out.println("Digite o valor 2: ");
//		calc.setV2(s.nextDouble());
		

		
		
		this.soma = new JButton("+");
		this.soma.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc.setV1(Double.parseDouble(var1.getText()+""));
				calc.setV2(Double.parseDouble(var2.getText()+""));	
				resultado.setText(calc.getV1() + calc.getV2()+"");
			}
		});
		
		this.subtracao = new JButton("-");
		this.subtracao.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.subtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setV1(Double.parseDouble(var1.getText()+""));
				calc.setV2(Double.parseDouble(var2.getText()+""));
				resultado.setText(calc.getV1() - calc.getV2()+"");
			}
		});
		
		this.multiplicacao = new JButton("*");
		this.multiplicacao.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.multiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setV1(Double.parseDouble(var1.getText()+""));
				calc.setV2(Double.parseDouble(var2.getText()+""));
				resultado.setText(calc.getV1() * calc.getV2()+"");
			}
		});
		
		this.divisao = new JButton("/");
		this.divisao.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				calc.setV1(Double.parseDouble(var1.getText()+""));
				calc.setV2(Double.parseDouble(var2.getText()+""));
				resultado.setText(calc.getV1() / calc.getV2()+"");
			}
		});
		
		this.var1 = new JTextField();
		this.var1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		this.var1.setBackground(Color.RED);
		this.var1.setColumns(10);
		
		this.var2 = new JTextField();
		this.var2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		this.var2.setBackground(Color.RED);
		this.var2.setColumns(10);
		
		this.resultado = new JTextField();
		this.resultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.resultado.setColumns(10);
		
		this.lblNewLabel = new JLabel("=");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		


		GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(this.multiplicacao, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
								.addComponent(this.soma))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(this.divisao)
								.addComponent(this.subtracao, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(this.lblNewLabel)
							.addGap(18)
							.addComponent(this.resultado, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addGap(136))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(this.var1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(this.var2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(this.var1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.var2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(this.soma, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addComponent(this.subtracao, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(this.multiplicacao, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addComponent(this.divisao, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(35)
									.addComponent(this.lblNewLabel))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(96)
							.addComponent(this.resultado, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(61, Short.MAX_VALUE))
		);
		this.contentPane.setLayout(gl_contentPane);
	}
}
