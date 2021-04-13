package Exec_2d_2;

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
import java.util.LinkedList;

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
	private JButton btnNewButton_1;
	private JButton gravar;

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
		while(modelo.getRowCount() > 0) {
			modelo.removeRow(0);
		}for(Pessoa pessoa : lista) {
			modelo.addRow(pessoa.toLinha());
		}
		JOptionPane.showMessageDialog(null, "Arquivo Carregado com Sucesso!");
	}
	 
	 
	 
	
	private void acaoGravarArquivo() {
		Arquivo arquivo = new Arquivo("teste");
		String dados = "";
		for(int i =0; i<tabela.getRowCount(); i++) {
			for(int j=0; j<tabela.getColumnCount(); j++) {
				if(tabela.getValueAt(i, j) == null) {
					JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");
					return;
				}
				dados += tabela.getValueAt(i, j) + "\n";
			}
		}
		arquivo.gravar(dados);
		JOptionPane.showMessageDialog(null, "Arquivo Gravado com Sucesso!");
	}
	
	
//	private void acaoClique() {
//		String selecao = tabela.getValueAt(tabela.getSelectedRow(), tabela.getSelectedColumn()) + "";
//		JOptionPane.showMessageDialog(null, "Valor Selecionado: "+selecao);
//	}
	
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[38.00,grow][48.00px][646px,grow][grow]", "[20px][][20px][][14px][][273px]"));
		
		btnNewButton_1 = new JButton("Ler do Arquivo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoLerArquivo();
			}
		});
		contentPane.add(btnNewButton_1, "cell 2 1,growx");
		
		gravar = new JButton("Gravar no Arquivo");
		gravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoGravarArquivo();
			}
		});
		contentPane.add(gravar, "cell 2 2,growx");
		
		JScrollPane scrollPane = new JScrollPane();
		
		tabela = new JTable();
		tabela.addMouseListener(new MouseAdapter() {
			

		});
		tabela.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nome", "Sobrenome", "Email", "Turma"
			}
		));
		tabela.getColumnModel().getColumn(0).setResizable(false);
		tabela.getColumnModel().getColumn(1).setResizable(false);
		tabela.getColumnModel().getColumn(2).setResizable(false);
		tabela.getColumnModel().getColumn(3).setResizable(false);
		scrollPane.setViewportView(tabela);
		contentPane.add(scrollPane, "cell 2 3,grow");
	}
}
