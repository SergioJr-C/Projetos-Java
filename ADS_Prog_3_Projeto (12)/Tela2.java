package Exec_2e_ex1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela2 extends JFrame {

	private JPanel contentPane;
	private JTextField estado;
	private JTextField cidade;
	private JTextField endereco;
	private JTextField cep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela2 frame = new Tela2();
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
	public Tela2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][46px][288px,grow][]", "[][14px][][20px][][20px][][20px][][][][23px]"));
		
		JLabel lblNewLabel_3 = new JLabel("Insira seus dados:");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_3, "cell 2 0,alignx left,aligny top");
		
		JLabel lblNewLabel = new JLabel("Endereço:");
		contentPane.add(lblNewLabel, "cell 1 2,alignx right,aligny center");
		
		endereco = new JTextField();
		endereco.setColumns(10);
		contentPane.add(endereco, "cell 2 2,growx,aligny top");
		
		JLabel lblNewLabel_1 = new JLabel("Cidade:");
		contentPane.add(lblNewLabel_1, "cell 1 4,alignx right,aligny center");
		
		cidade = new JTextField();
		cidade.setColumns(10);
		contentPane.add(cidade, "cell 2 4,growx,aligny top");
		
		JLabel lblNewLabel_2 = new JLabel("Estado:");
		contentPane.add(lblNewLabel_2, "cell 1 6,alignx left,aligny center");
		
		estado = new JTextField();
		estado.setColumns(10);
		contentPane.add(estado, "cell 2 6,growx,aligny top");
		
		JLabel lblNewLabel_4 = new JLabel("CEP:");
		contentPane.add(lblNewLabel_4, "cell 1 8,alignx trailing");
		
		cep = new JTextField();
		contentPane.add(cep, "cell 2 8,growx");
		cep.setColumns(10);
		
		JButton botao1 = new JButton("Próximo");
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if("".equals(endereco.getText()) || "".equals(cidade.getText()) ||  "".equals(estado.getText()) || "".equals(cep.getText())) {
					JOptionPane.showMessageDialog(null, "Digite os Campos Obrigatórios!");
				}else {
					Tela3 tela = new Tela3();
					tela.setVisible(true);
					dispose();
				}
			}
		});
		contentPane.add(botao1, "cell 2 10,growx,aligny top");
	}

}
