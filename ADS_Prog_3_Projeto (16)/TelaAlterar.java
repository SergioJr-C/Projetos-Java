package Exec_3c;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class TelaAlterar extends JPanel {
	private JComboBox <String> comboBox;
	private JLabel lblNewLabel;
	private JTextField id;
	private JTextField marca;
	private JTextField modelo;
	private JTextField ano_fab;
	private JButton Balterar;
	private JButton Bexcluir;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private AutomovelDao fdao;
	
	/**
	 * Create the panel.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlterar panel = new TelaAlterar();
					panel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	private void preencherComboMarca() {
		LinkedList<String> marcas = fdao.listarMarcas();
		comboBox.addItem("Selecione uma Marca: ");
		for(String m : marcas) {
			comboBox.addItem(m);
		}
	}
	
	private void acaoComboBox() {
		if(comboBox.getItemCount()>0) {
			if(!comboBox.getSelectedItem().equals("Selecione um marca:")) {
			Automovel a = fdao.buscarMarcas(comboBox.getSelectedItem()+"");
			id.setText(a.getId()+"");
			marca.setText(a.getMarca()+"");
			modelo.setText(a.getModelo()+"");
			id.setText(a.getAno_fab()+"");
			}
			//else {
//				id.setText("");
//				marca.setText("");
//				modelo.setText("");
//				ano_fab.setText("");
//			}
		}
	}
	
	private void acaoSalvar() {
		if(id.getText().isEmpty() || marca.getText().isEmpty() || modelo.getText().isEmpty() || ano_fab.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Para salvar as alterações todos os campos devem estar preenchidos." ,"Dados Insuficientes", JOptionPane.INFORMATION_MESSAGE);
		}else {
				Automovel a = new Automovel(marca.getText(),modelo.getText(),ano_fab.getText());
				a.setId(Integer.parseInt(id.getText()));
				fdao.alterar(a);
				comboBox.removeAllItems();
				preencherComboMarca();
				id.setText("");
				marca.setText("");
				modelo.setText("");
				ano_fab.setText("");
				JOptionPane.showMessageDialog(null,"Dados Atualizado ");
			}
		}
	
	
	private void acaoExcluir() {
		if(id.getText().isEmpty() || marca.getText().isEmpty() || modelo.getText().isEmpty() || ano_fab.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Para salvar as alterações todos os campos devem estar preenchidos." ,"Dados Insuficientes", JOptionPane.INFORMATION_MESSAGE);
		}else {
				Automovel a = new Automovel(marca.getText(),modelo.getText(),ano_fab.getText());
				a.setId(Integer.parseInt(id.getText()));
				fdao.alterar(a);
				comboBox.removeAllItems();
				preencherComboMarca();
				id.setText("");
				marca.setText("");
				modelo.setText("");
				ano_fab.setText("");
				JOptionPane.showMessageDialog(null,"Dados Atualizado ");
			}
		}
	
	public TelaAlterar() {
		initComponents();
		fdao = new AutomovelDao();
		preencherComboMarca();
	}
	
	private void initComponents() {
		
		this.comboBox = new JComboBox<String>();
		this.comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//método listar combo
			}
		});
		
		this.lblNewLabel = new JLabel("Alterar Funcionários");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		this.id = new JTextField();
		this.id.setEditable(false);
		this.id.setColumns(10);
		
		this.marca = new JTextField();
		this.marca.setColumns(10);
		
		this.modelo = new JTextField();
		this.modelo.setColumns(10);
		
		this.ano_fab = new JTextField();
		this.ano_fab.setColumns(10);
		
		this.Balterar = new JButton("Salvar Alterações");
		this.Balterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoSalvar();
			}
		});
		
		this.Bexcluir = new JButton("Excluir Automóvel");
		this.Bexcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoExcluir();
			}
		});
		
		this.lblNewLabel_1 = new JLabel("ID:");
		
		this.lblNewLabel_2 = new JLabel("Marca:");
		
		this.lblNewLabel_3 = new JLabel("Modelo:");
		
		this.lblNewLabel_4 = new JLabel("Ano de Fabricação:");
		setLayout(new MigLayout("", "[grow 50][93px][18px][86px,grow][4px][164px][grow 50]", "[][14px][][22px][20px][20px][20px][21px][][23px][grow]"));
		add(this.comboBox, "cell 1 3 5 1,growx,aligny top");
		add(this.lblNewLabel, "cell 3 1,alignx center,aligny top");
		add(this.id, "cell 3 4 3 1,growx,aligny top");
		add(this.marca, "cell 3 5 3 1,growx,aligny top");
		add(this.modelo, "cell 3 6 3 1,growx,aligny top");
		add(this.ano_fab, "cell 3 7 3 1,grow");
		add(this.Balterar, "cell 1 9 3 1,growx,aligny top");
		add(this.Bexcluir, "cell 5 9,growx,aligny top");
		add(this.lblNewLabel_1, "cell 1 4,alignx right,aligny bottom");
		add(this.lblNewLabel_2, "cell 1 5,alignx right,aligny center");
		add(this.lblNewLabel_3, "cell 1 6,alignx right,aligny center");
		add(this.lblNewLabel_4, "cell 1 7,alignx left,aligny center");
	}
}
