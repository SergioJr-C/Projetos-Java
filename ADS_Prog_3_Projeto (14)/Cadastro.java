package Exec_2e_ex3;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;


import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JPanel {
	private JTextField nome;
	private JTextField email;
	private JTextField telefone;

	/**
	 * Create the panel.
	 */
	
		private void acaoGravar(){
			Arquivo arq = new Arquivo("Agenda");
			arq.gravar(nome.getText(),email.getText(),telefone.getText());
			
		}
		
		public Cadastro() {
		
		nome = new JTextField();
		nome.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		
		telefone = new JTextField();
		telefone.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		
		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			acaoGravar();
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("Dados:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		setLayout(new MigLayout("", "[][][46px][86px][]", "[][16px][][20px][][20px][][20px][][23px]"));
		add(nome, "cell 3 3 2 1,alignx left,aligny top");
		add(email, "cell 3 5,alignx left,aligny top");
		add(telefone, "cell 3 7,alignx left,aligny top");
		add(lblNewLabel, "cell 2 3,alignx left,aligny bottom");
		add(lblNewLabel_1, "cell 2 5,alignx left,aligny center");
		add(lblNewLabel_2, "cell 2 7,alignx left,aligny center");
		add(btnNewButton, "cell 3 9,alignx right,aligny top");
		add(lblNewLabel_3, "cell 2 1,alignx left,aligny top");

	}
}
