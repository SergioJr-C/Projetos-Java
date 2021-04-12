package Exemplo3b;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal extends JFrame {
	static Principal frame;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	private void acaoConsultar() {
		frame.setContentPane(new TelaConsulta());
		frame.setVisible(true);
	}
	
	private void acaoCadastrar() {
		frame.setContentPane(new TelaCadastro());
		frame.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public Principal() {
		initComponents();
		this.setContentPane(new Padrao());
		setLocationRelativeTo(null);
	}
	private void initComponents() {
		setTitle("Sistema de Gestão de Funcionários");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		
		this.menuBar = new JMenuBar();
		setJMenuBar(this.menuBar);
		
		this.mnNewMenu = new JMenu("Sistema");
		this.menuBar.add(this.mnNewMenu);
		
		this.mntmNewMenuItem = new JMenuItem("Consultar Funcionários");
		this.mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoConsultar();
			}
		});
		this.mnNewMenu.add(this.mntmNewMenuItem);
		
		this.mntmNewMenuItem_1 = new JMenuItem("Cadastrar Funcionários");
		this.mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCadastrar();
			}
		});
		this.mnNewMenu.add(this.mntmNewMenuItem_1);
	}

}
