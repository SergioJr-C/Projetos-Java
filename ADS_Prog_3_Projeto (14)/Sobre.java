package Exec_2e_ex3;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Sobre extends JPanel {

	/**
	 * Create the panel.
	 */
	public Sobre() {
		
		JLabel nomeSelecionado = new JLabel("Nome");
		
		JLabel emailSelecionado = new JLabel("Email");
		
		JLabel lblNewLabel = new JLabel("Software Crud Versão Beta 0.1");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(98)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(emailSelecionado)
								.addComponent(nomeSelecionado)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(141)
							.addComponent(lblNewLabel)))
					.addContainerGap(263, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(nomeSelecionado)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(emailSelecionado)
					.addContainerGap(191, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
