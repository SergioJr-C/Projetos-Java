package Exec_3c;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField marca;
	private JTextField modelo;
	private JTextField ano_fab;
	private JButton cadastrar;
	static TelaCadastro frame;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TelaCadastro();
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
	
	private void acaoCadastro() {
		if(marca.getText().isEmpty() || modelo.getText().isEmpty() || ano_fab.getText().isEmpty() ) {
			JOptionPane.showMessageDialog(null,"Digite todos os Campos.");	
		}else {
			Automovel f = new Automovel(marca.getText(),modelo.getText(),ano_fab.getText());
		    AutomovelDao fdao = new AutomovelDao();		
			fdao.inserir(f);
			JOptionPane.showMessageDialog(null,"Inserido com Sucesso.");
			marca.setText("");
			modelo.setText("");
			ano_fab.setText("");
			TelaPrincipal.frame.setContentPane(new Padrao());
			TelaPrincipal.frame.setVisible(true);
		}
	}
	
	
	public TelaCadastro() {
		initComponents();
		setBounds(100, 100, 600, 300);
		
	}
	private void initComponents() {
		
		
		setLayout(new MigLayout("", "[grow][46px][443.00px][grow]", "[grow][38.00][14px][20px][20px][20px][][23px][grow]"));
		
		this.lblNewLabel = new JLabel("Cadastrar Funcionário");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		add(this.lblNewLabel, "cell 2 1,alignx center,aligny top");
		
		this.lblNewLabel_1 = new JLabel("Marca:");
		add(this.lblNewLabel_1, "cell 1 2,alignx left,aligny center");
		
		this.marca = new JTextField();
		this.marca.setColumns(10);
		add(this.marca, "cell 2 2,growx,aligny top");
		
		this.lblNewLabel_2 = new JLabel("Modelo:");
		add(this.lblNewLabel_2, "cell 1 3,alignx left,aligny bottom");
		
		this.modelo = new JTextField();
		this.modelo.setColumns(10);
		add(this.modelo, "cell 2 3,growx,aligny top");
		
		this.lblNewLabel_3 = new JLabel("Ano de Fabricação:");
		add(this.lblNewLabel_3, "cell 1 4,alignx left,aligny center");
		
		this.ano_fab = new JTextField();
		this.ano_fab.setColumns(10);
		add(this.ano_fab, "cell 2 4,growx,aligny top");
		
		this.cadastrar = new JButton("Cadastrar");
		this.cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCadastro();
			}
		});
		this.cadastrar.setForeground(Color.ORANGE);
		this.cadastrar.setBackground(Color.BLACK);
		add(this.cadastrar, "cell 2 6,growx,aligny top");
	}
	


}
