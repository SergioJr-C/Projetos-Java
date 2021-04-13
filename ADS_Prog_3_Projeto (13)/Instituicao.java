package Exec_2e_ex2;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

public class Instituicao extends JPanel {

	/**
	 * Create the panel.
	 */
	public Instituicao() {
		setLayout(new MigLayout("", "[][][][][][][]", "[]"));
		
		JLabel lblNewLabel = new JLabel("Informações da Instituição");
		add(lblNewLabel, "cell 5 0");

	}

}
