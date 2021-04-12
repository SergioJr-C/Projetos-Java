package Exec_2e_ex3;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Consulta extends JPanel {
	private JTable tabela;
	private JLabel destaque;

	/**
	 * Create the panel.
	 */
	
	
	 private void acaoLerArquivo() {
		Arquivo arquivo = new Arquivo("Agenda");
		LinkedList<Pessoa> lista = arquivo.ler();
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
		while(modelo.getRowCount() > 0) {
			modelo.removeRow(0);
		}for(Pessoa pessoa : lista) {
			modelo.addRow(pessoa.toLinha());
		}
		JOptionPane.showMessageDialog(null, "Arquivo Carregado com Sucesso!");
	}
	
	
		private void acaoClique() {
			String selecao = tabela.getValueAt(tabela.getSelectedRow(), tabela.getSelectedColumn()) + "";
			destaque.setText(selecao);
		}
	 
	 
	public Consulta() {
		
		tabela = new JTable();
		tabela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				acaoClique();
			}
		});
		
		tabela.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Nome", "Email", "Telefone"
				
			}
		));
		
		
		
	    destaque = new JLabel("");
		destaque.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		JButton consulta = new JButton("Consultar");
		consulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoLerArquivo();
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(74)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
							.addComponent(consulta)
							.addGap(20))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(destaque)
							.addContainerGap(376, Short.MAX_VALUE))))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabela, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addComponent(tabela, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addComponent(destaque)
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addComponent(consulta)
					.addContainerGap())
		);
		setLayout(groupLayout);

	}
}
