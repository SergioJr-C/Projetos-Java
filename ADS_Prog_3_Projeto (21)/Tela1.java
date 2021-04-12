package Exemplo3a;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;

public class Tela1 extends JFrame {


	private JPanel contentPane;
	static Tela1 frame;//Deixar em static pra ter acessoem outra classe
	private JButton botaoConsultar;
	private JScrollPane scrollPane;
	private JTable saida;
	private JComboBox combo;
	private JLabel lblNewLabel;
	private FuncionarioDao fdao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Tela1();
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
	
	private void acaoConsultar() {
		FuncionarioDao dao = new FuncionarioDao();
		LinkedList<Funcionario> lista = dao.listar();
		DefaultTableModel model = (DefaultTableModel) saida.getModel();
		for (Funcionario funcionario : lista) {
			model.addRow(new String [] {funcionario.getId()+"",funcionario.getNome()+"",funcionario.getEmail()+"",funcionario.getCargo()+""});
		}
	}
	
	private void preencherCombo() {
		LinkedList<String> nomes = fdao.listarNomes();
		combo.addItem("Selecione um nome: ");
		for(String nome : nomes) {
			combo.addItem(nome);
		}
	}
	
	private void acaoCombo() {
		if(!combo.getSelectedItem().equals("Selecione um nome: ")) {
		Funcionario consultaCombo = fdao.buscar(combo.getSelectedItem()+"");
		DefaultTableModel model = (DefaultTableModel) saida.getModel();
		for(int i=0; i<model.getRowCount(); i++) {
			model.removeRow(i);
			}
		model.addRow(new String[] {consultaCombo.getId()+"",consultaCombo.getNome()+"",consultaCombo.getEmail()+"",consultaCombo.getCargo()+""});
		}
	}

	public Tela1() {
		initComponents();
		fdao = new FuncionarioDao();
		
		preencherCombo();//Para aparecer o Combo preenchido
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 430);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		
		this.botaoConsultar = new JButton("Consultar Funcionários");
		this.botaoConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoConsultar();
 			}
		});
		
		this.scrollPane = new JScrollPane();
		
		this.combo = new JComboBox();
		this.combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCombo();//Através do nome Selecionado busca no banco de dados, preenche a tabela com os valores 
			}
		});
		
		this.lblNewLabel = new JLabel("Selecionar Funcionário");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(242)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(this.combo, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(this.botaoConsultar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(this.lblNewLabel, Alignment.LEADING))
					.addContainerGap(26, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(42, Short.MAX_VALUE)
					.addComponent(this.scrollPane, GroupLayout.PREFERRED_SIZE, 568, GroupLayout.PREFERRED_SIZE)
					.addGap(26))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addComponent(this.lblNewLabel)
					.addGap(18)
					.addComponent(this.combo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(this.botaoConsultar)
					.addGap(18)
					.addComponent(this.scrollPane, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		
		this.saida = new JTable();
		this.saida.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "E-mail", "Cargo"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		this.saida.getColumnModel().getColumn(0).setResizable(false);
		this.saida.getColumnModel().getColumn(0).setPreferredWidth(34);
		this.saida.getColumnModel().getColumn(1).setResizable(false);
		this.saida.getColumnModel().getColumn(1).setPreferredWidth(94);
		this.saida.getColumnModel().getColumn(2).setResizable(false);
		this.saida.getColumnModel().getColumn(2).setPreferredWidth(89);
		this.saida.getColumnModel().getColumn(3).setResizable(false);
		this.saida.getColumnModel().getColumn(3).setPreferredWidth(94);
		this.scrollPane.setViewportView(this.saida);
		this.contentPane.setLayout(gl_contentPane);
	}
}
