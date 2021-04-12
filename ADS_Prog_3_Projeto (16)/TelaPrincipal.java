package Exec_3c;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame {
	static TelaPrincipal frame;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TelaPrincipal();
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
	
	private void acaoAlterarExcluir() {
		frame.setContentPane(new TelaAlterar());
		frame.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
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
		
		this.mntmNewMenuItem = new JMenuItem("Consultar Automóveis");
		this.mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoConsultar();
			}
		});
		this.mnNewMenu.add(this.mntmNewMenuItem);
		
		this.mntmNewMenuItem_1 = new JMenuItem("Cadastrar Automóvel");
		this.mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCadastrar();
			}
		});
		this.mnNewMenu.add(this.mntmNewMenuItem_1);
		
		this.mntmNewMenuItem_2 = new JMenuItem("Alterar/Excluir Automóvel");
		this.mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//chama o jpanel alterar exluir
				acaoAlterarExcluir();
			}
		});
		this.mnNewMenu.add(this.mntmNewMenuItem_2);
	}

}
