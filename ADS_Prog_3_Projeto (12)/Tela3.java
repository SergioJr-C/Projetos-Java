package Exec_2e_ex1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela3 extends JFrame {

	private JPanel contentPane;
	private JTextField curso;
	private JTextField turma;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnFinalizarCadastro = new JButton("Finalizar Cadastro");
		btnFinalizarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if("".equals(curso.getText()) || "".equals(turma.getText())) {
					JOptionPane.showMessageDialog(null, "Digite os Campos Obrigatórios!");
				}else {
					Tela1 tela = new Tela1();
					tela.setVisible(true);
					JOptionPane.showMessageDialog(null, "Cadastro Realizado!");
					dispose();
				}
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("Insira seus dados:");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		curso = new JTextField();
		curso.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso:");
		
		JLabel lblNewLabel_1 = new JLabel("Turma:");
		
		turma = new JTextField();
		turma.setColumns(10);
		contentPane.setLayout(new MigLayout("", "[][31px][288px]", "[][14px][][20px][][20px][][23px][]"));
		contentPane.add(btnFinalizarCadastro, "cell 2 7,growx,aligny top");
		contentPane.add(lblNewLabel_3, "cell 2 1,alignx left,aligny top");
		contentPane.add(curso, "cell 2 3,growx,aligny top");
		contentPane.add(lblCurso, "cell 1 3,growx,aligny center");
		contentPane.add(lblNewLabel_1, "cell 1 5,growx,aligny center");
		contentPane.add(turma, "cell 2 5,growx,aligny top");
	}

}
