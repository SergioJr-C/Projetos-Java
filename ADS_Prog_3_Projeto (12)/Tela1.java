package Exec_2e_ex1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela1 extends JFrame {

	private JPanel Tela1;
	private JTextField nome;
	private JTextField cpf;
	private JTextField telefone;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton botao1;
	private JLabel lblNewLabel_3;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 375);
		Tela1 = new JPanel();
		Tela1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Tela1);
		
		nome = new JTextField();
		nome.setColumns(10);
		Tela1.setLayout(new MigLayout("", "[][][][288px][]", "[][][][20px][][][20px][][20px][]"));
		
		lblNewLabel_3 = new JLabel("Insira seus dados:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.BLACK);
		Tela1.add(lblNewLabel_3, "cell 3 1");
		
		lblNewLabel = new JLabel("Nome:");
		Tela1.add(lblNewLabel, "cell 2 3,alignx trailing");
		
		lblNewLabel_1 = new JLabel("Cpf:");
		Tela1.add(lblNewLabel_1, "cell 2 5,alignx right");
		
		cpf = new JTextField();
		cpf.setColumns(10);
		Tela1.add(cpf, "cell 3 5,growx,aligny top");
		Tela1.add(nome, "cell 3 3,growx,aligny top");
		
		lblNewLabel_2 = new JLabel("Telefone:");
		Tela1.add(lblNewLabel_2, "cell 2 7,alignx trailing");
		
		telefone = new JTextField();
		telefone.setColumns(10);
		Tela1.add(telefone, "cell 3 7,growx,aligny top");
		
		botao1 = new JButton("Próximo");
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if("".equals(cpf.getText()) || "".equals(nome.getText()) ||  "".equals(telefone.getText())) {
					JOptionPane.showMessageDialog(null, "Digite os Campos Obrigatórios!");
				}else {
					Tela2 tela = new Tela2();
					tela.setVisible(true);
					dispose();
				}
			}
		});
		Tela1.add(botao1, "cell 3 9,growx");
	}
}
