package Exec_2e_ex2;

import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class Aluno extends JPanel {

	/**
	 * Create the panel.
	 */
	public Aluno() {
		setLayout(new MigLayout("", "[105px][][][][][]", "[14px]"));
		
		JLabel lblNewLabel = new JLabel("Informações do Aluno");
		add(lblNewLabel, "cell 2 0,alignx left,aligny top");

	}

}
