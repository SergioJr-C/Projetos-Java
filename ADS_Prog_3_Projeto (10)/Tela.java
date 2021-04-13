package Exec_2d_1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTable tabela;
	private JTextField nome;
	private JTextField email;
	private JButton btnNewButton_1;
	private JButton gravar;
	private JTextField cpf;
	private JLabel lblNewLabel_1;

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
	}
	
	
	private void acaoLerArquivo() {
		Arquivo arquivo = new Arquivo("teste");
		LinkedList<Pessoa> lista = arquivo.ler();
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
		for(Pessoa pessoa : lista) {
			modelo.addRow(pessoa.toLinha());
		}
		JOptionPane.showMessageDialog(null, "Arquivo Carregado com Sucesso!");
	}
	
	private void acaoGravarArquivo() {
		Arquivo arquivo = new Arquivo("teste");
		String dados = "";
		for(int i =0; i<tabela.getRowCount(); i++) {
			dados += tabela.getValueAt(i, 0) + "\n" + tabela.getValueAt(i, 1) + "\n" + tabela.getValueAt(i, 2);
		}
		arquivo.gravar(dados);
		JOptionPane.showMessageDialog(null, "Arquivo Gravado com Sucesso!");
	}
	
	
	private void acaoClique() {
		String selecao = tabela.getValueAt(tabela.getSelectedRow(), tabela.getSelectedColumn()) + "";
		JOptionPane.showMessageDialog(null, "Valor Selecionado: "+selecao);
	}
	
	private void acaoBotao() {
		if(nome.getText().isEmpty() || cpf.getText().isEmpty() || email.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Digite os Valores de Nome, CPF e Email.");
		}else {
			Pessoa p = new Pessoa(nome.getText()+"", cpf.getText()+"", email.getText()+"");
			
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			modelo.addRow(p.toLinha());
		}
	}
	
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
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
				"Nome", "Cpf", "Email"
			}
		));
		scrollPane.setViewportView(tabela);
		contentPane.setLayout(new MigLayout("", "[38.00,grow][48.00px][646px,grow][grow]", "[20px][][20px][][14px][][273px]"));
		
		btnNewButton_1 = new JButton("Ler do Arquivo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoLerArquivo();
			}
		});
		
		JButton btnNewButton = new JButton("Inserir na Tabela");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoBotao();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Nome:");
		contentPane.add(lblNewLabel, "cell 1 0,alignx left,aligny center");
		
		nome = new JTextField();
		nome.setColumns(10);
		contentPane.add(nome, "cell 2 0,growx,aligny top");
		
		lblNewLabel_1 = new JLabel("Cpf:");
		contentPane.add(lblNewLabel_1, "cell 1 1,alignx left");
		
		cpf = new JTextField();
		cpf.setColumns(10);
		contentPane.add(cpf, "cell 2 1,growx");
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		contentPane.add(lblNewLabel_2, "cell 1 2,alignx left,aligny top");
		
		email = new JTextField();
		contentPane.add(email, "cell 2 2,growx");
		email.setColumns(10);
		contentPane.add(btnNewButton, "cell 2 3,growx");
		contentPane.add(btnNewButton_1, "flowx,cell 2 5,alignx left");
		contentPane.add(scrollPane, "cell 1 6 2 1,grow");
		
		gravar = new JButton("Gravar no Arquivo");
		gravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoGravarArquivo();
			}
		});
		contentPane.add(gravar, "cell 2 5,alignx right");
	}
}
