package Exec_2a_2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Exec_2a_1.Veiculo;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class Tela1 extends JFrame {

	private JPanel contentPane;
	private JLabel NomeDisc;
	private JLabel CargaH;
	private JLabel NomeProf;

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
		Disciplina disc = new Disciplina();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome da Disciplina: ");
		disc.setNomeDisc(s.nextLine());
		System.out.println("Digite a Carga Horária: ");
		disc.setCargaH(s.nextLine());
		System.out.println("Digite o nome do Professor: ");
		disc.setNomeProf(s.nextLine());


		
		this.NomeDisc = new JLabel("Nome Disciplina: " +disc.getNomeDisc());
		
		
		this.CargaH = new JLabel("Carga Horária: " +disc.getCargaH());
		
		
		this.NomeProf = new JLabel("Nome Professor: " +disc.getNomeProf());
		
		GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(180)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(this.NomeProf)
						.addComponent(this.CargaH)
						.addComponent(this.NomeDisc))
					.addContainerGap(198, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addComponent(this.NomeDisc)
					.addGap(53)
					.addComponent(this.CargaH)
					.addGap(57)
					.addComponent(this.NomeProf)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		this.contentPane.setLayout(gl_contentPane);
	}

}
