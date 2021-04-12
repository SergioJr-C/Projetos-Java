package Exemplo3b;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.LinkedList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class TelaConsulta extends JPanel {
	private JComboBox nome;
	private JComboBox cargo;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTable saida;
	private FuncionarioDao fdao;

	/**
	 * Create the panel.
	 */
	public TelaConsulta() {
		initComponents();
		fdao = new FuncionarioDao();
		preencherCombo();
	}
	
	
	private void preencherCombo() {
		LinkedList<String> nomes = fdao.listarNomes();
		nome.addItem("Selecione um nome: ");
		for(String n : nomes) {
			nome.addItem(n);
		}
		
		LinkedList<String> cargos = fdao.listarCargos();
		cargo.addItem("Selecione um cargo: ");
		for(String n : cargos) {
			cargo.addItem(n);
	}
	
	}
	
	private void acaoComboCargo() {
		if(!cargo.getSelectedItem().equals("Selecione um cargo: ")) {
			LinkedList<Funcionario> funcionarios = fdao.buscarCargo(cargo.getSelectedItem()+"");
			DefaultTableModel model = (DefaultTableModel) saida.getModel();
			while(model.getRowCount() > 0) {
				model.removeRow(0);
			}
			for (Funcionario funcionario : funcionarios) {
				model.addRow(new String[] {funcionario.getId()+"",funcionario.getNome()+"",funcionario.getEmail()+"",funcionario.getCargo()+""});
			}
			
			}
	}
	
	
	private void acaoCombo() {
		if(!nome.getSelectedItem().equals("Selecione um nome: ")) {
		Funcionario consultaCombo = fdao.buscarNome(nome.getSelectedItem()+"");
		DefaultTableModel model = (DefaultTableModel) saida.getModel();
		while(model.getRowCount() > 0) {
			model.removeRow(0);
		}
			model.addRow(new String[] {consultaCombo.getId()+"",consultaCombo.getNome()+"",consultaCombo.getEmail()+"",consultaCombo.getCargo()+""});
		}
	}
	
	private void initComponents() {
		setBounds(100, 100, 600, 300);
		setLayout(new MigLayout("", "[grow 50][grow][][grow][grow 50]", "[][][][][][136.00,grow][]"));
		
		this.lblNewLabel = new JLabel("Consultar Funcionários");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(this.lblNewLabel, "cell 1 1 3 1,alignx center");
		
		this.nome = new JComboBox();
		this.nome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCombo();
			}
		});
		add(this.nome, "cell 1 3,growx");
		
		this.cargo = new JComboBox();
		this.cargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoComboCargo();
			}
		});
		add(this.cargo, "cell 3 3,growx");
		
		this.scrollPane = new JScrollPane();
		add(this.scrollPane, "cell 1 5 3 1,grow");
		
		this.saida = new JTable();
		this.saida.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Email", "Cargo"
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
		this.saida.getColumnModel().getColumn(1).setResizable(false);
		this.saida.getColumnModel().getColumn(2).setResizable(false);
		this.saida.getColumnModel().getColumn(3).setResizable(false);
		this.scrollPane.setViewportView(this.saida);
	}

}
