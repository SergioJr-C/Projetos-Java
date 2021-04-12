package Exec_3c;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.LinkedList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;



public class TelaConsulta extends JPanel {
	private JComboBox<String> marca;
	private JComboBox<String> ano;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTable saida;
	private AutomovelDao fdao;
	static TelaConsulta frame;
	private JComboBox modelo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TelaConsulta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the panel.
	 */
	public TelaConsulta() {
		initComponents();
		fdao = new AutomovelDao();
		preencherComboMarca();
		preencherComboModelo();
		preencherComboAno();
	}
	
	
	private void preencherComboMarca() {
		LinkedList<String> marcas = fdao.listarMarcas();
		marca.addItem("Selecione uma Marca: ");
		for(String m : marcas) {
			marca.addItem(m);
		}
		
	}
	
	private void preencherComboModelo() {
		LinkedList<String> modelos = fdao.listarModelos();
		modelo.addItem("Selecione um Modelo: ");
		for(String mo : modelos) {
			modelo.addItem(mo);
		}
	}
	
	private void preencherComboAno() {
		LinkedList<String> anos = fdao.listarAno();
		ano.addItem("Selecione Ano: ");
		for(String mo : anos) {
			ano.addItem(mo);
		}
	}

	
	private void acaoComboAno() {
		if(marca.getItemCount()>0) {
			if(!marca.getSelectedItem().equals("Selecione um Ano: ")) {
				LinkedList<Automovel> lista = fdao.buscarAno(ano.getSelectedItem()+"");
				DefaultTableModel model = (DefaultTableModel) saida.getModel();
				while(model.getRowCount() > 0) {
					model.removeRow(0);
				}
				for(Automovel Automovel : lista) {
					model.addRow(new String[] {Automovel.getId() + "", Automovel.getMarca() + "", Automovel.getModelo() + "", Automovel.getAno_fab()});
					}
			}
		}
	}
	
	
	private void acaoComboMarca() {
		if(marca.getItemCount()>0) {
			if(!marca.getSelectedItem().equals("Selecione uma Marca: ")) {
				LinkedList<Automovel> lista = fdao.buscarMarca(marca.getSelectedItem()+"");
				DefaultTableModel model = (DefaultTableModel) saida.getModel();
				while(model.getRowCount() > 0) {
					model.removeRow(0);
				}
				for(Automovel Automovel : lista) {
					model.addRow(new String[] {Automovel.getId() + "", Automovel.getMarca() + "", Automovel.getModelo() + "", Automovel.getAno_fab()});
					}
			}
		}
	}
	
	private void acaoComboModelo() {
		if(modelo.getItemCount()>0) {
			if(!modelo.getSelectedItem().equals("Selecione um modelo: ")) {
				LinkedList<Automovel> lista = fdao.buscarModelo(modelo.getSelectedItem()+"");
				DefaultTableModel model = (DefaultTableModel) saida.getModel();
				while(model.getRowCount() > 0) {
					model.removeRow(0);
				}
				for(Automovel Automovel : lista) {
					model.addRow(new String[] {Automovel.getId() + "", Automovel.getMarca() + "", Automovel.getModelo() + "", Automovel.getAno_fab()});
					}
			}
		}
	}
	
	
	private void initComponents() {
		setBounds(100, 100, 761, 388);
		setLayout(new MigLayout("", "[45.00,grow 50][171.00,grow][37.00][209.00,grow][57.00,grow 50][199.00][128.00,grow]", "[][][][][][136.00,grow][]"));
		
		this.lblNewLabel = new JLabel("Consultar Automóvel");
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(this.lblNewLabel, "cell 1 1 5 1,growx");
		
		marca = new JComboBox();
		
		this.marca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoComboMarca();
			}
		});
		add(this.marca, "cell 1 3,growx");
		
		ano = new JComboBox();
		
		this.ano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoComboAno();
			}
		});
		add(this.ano, "cell 3 3,growx");
		
		this.modelo = new JComboBox();
		this.modelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoComboModelo();
			}
			}
		);
		add(this.modelo, "cell 5 3,growx");
		
		this.scrollPane = new JScrollPane();
		add(this.scrollPane, "cell 1 5 5 1,grow");
		
		saida = new JTable();
		
		this.saida.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Marca", "Modelo", "Ano"
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
