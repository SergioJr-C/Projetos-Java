package Exec_3b;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;

public class Padrao extends JPanel {
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public Padrao() {
		initComponents();
		setBounds(100, 100, 600, 300);
	}
	private void initComponents() {
		setLayout(new MigLayout("", "[grow][413.00px][grow][11.00]", "[grow][49px,grow][grow]"));
		
		this.lblNewLabel = new JLabel("<html>\r\n<body>\r\n<h1 style=\"text-align:center;\">Sistema de Automóveis</h1>\r\n<body>\r\n<html>\r\n");
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(this.lblNewLabel, "cell 1 1,growx,aligny top");
	}

}
