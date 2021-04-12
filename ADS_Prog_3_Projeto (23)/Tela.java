package Exemplo04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTable tabela;
	private JTextField nome;
	private JTextField cpf;
	private JTextField email;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	
	public Tela() {
		initComponents();
		
//		tabela.setValueAt("Gustavo", 0, 0);
//		tabela.setValueAt("0000 - 0000 - 000", 0, 1);
//		tabela.setValueAt("gustavo@email.com", 0, 2);
//		
//		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel(); //Para inserir novas linhas na tabela
//		modelo.addRow(new String[] {});
//		tabela.setValueAt("Lilica", 1, 0);
//		
//		modelo.addRow(new String[] {"Nescau", "1111", "nescau@email.com"});
		
		//tabela.setValueAt("0000 - 0000 - 000", 0, 1);
	}
	
	
	private void acaoBotao() {
			if(nome.getText().isEmpty() || cpf.getText().isEmpty() || email.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Digite os valores de Nome, Cpf e E-mail!");
			}else {
				Pessoa p = new Pessoa(nome.getText()+"", cpf.getText()+"", email.getText()+"");
				DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
				modelo.addRow(p.toLinha()); //Precisou criar um método na classe Pessoa para aceitar um vetor de Strings.
				JOptionPane.showMessageDialog(null, "Linha Inserida!");
			}
	}
	
	private void acaoClique() {
		String selecao = tabela.getValueAt(tabela.getSelectedRow(), tabela.getSelectedColumn()) + " ";
		JOptionPane.showMessageDialog(null, "Valor selecionado: " + selecao);		
	}


	private void initComponents() {
		setTitle("Exemplo com Tabelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		
		JLabel lblNewLabel_1 = new JLabel("CPF: ");
		
		JLabel lblNewLabel_2 = new JLabel("E-mail:");
		
		nome = new JTextField();
		nome.setColumns(10);
		
		cpf = new JTextField();
		cpf.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		
		tabela = new JTable();
		tabela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				acaoClique();
			}
		});
		tabela.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "CPF", "E-mail"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabela.getColumnModel().getColumn(0).setResizable(false);
		tabela.getColumnModel().getColumn(0).setPreferredWidth(184);
		tabela.getColumnModel().getColumn(1).setResizable(false);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(167);
		tabela.getColumnModel().getColumn(2).setResizable(false);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(271);
		scrollPane.setViewportView(tabela);
		contentPane.setLayout(new MigLayout("", "[19.00,grow][33.00px][29.00px][529.00px,grow]", "[6.00px][-17.00][9.00px][-12.00][4.00px][][214px]"));
		contentPane.add(nome, "cell 3 0,growx,aligny top");
		contentPane.add(cpf, "cell 3 2,growx,aligny top");
		contentPane.add(email, "cell 3 4,growx,aligny top");
		contentPane.add(lblNewLabel_2, "cell 1 4,alignx left,aligny top");
		contentPane.add(lblNewLabel_1, "cell 1 2,alignx left,aligny center");
		contentPane.add(lblNewLabel, "cell 1 0,alignx left,aligny center");
		
		btnNewButton = new JButton("Inserir a Tabela");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoBotao();
			}
		});
		contentPane.add(btnNewButton, "cell 3 5,growx");
		contentPane.add(scrollPane, "cell 1 6 3 1,grow");
		setLocationRelativeTo(null); /*Faz com que apareça a janela no meio da tela*/
	}
}
