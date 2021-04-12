package Exec_2e_ex3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Tela1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private void acaoIrCadastro() {
		Tela1 frame = new Tela1();
		frame.setContentPane(new Cadastro());
		frame.setVisible(true);
		dispose();
	}
	
	private void acaoIrConsulta() {
		Tela1 frame = new Tela1();
		frame.setContentPane(new Consulta());
		frame.setVisible(true);
		dispose();
	}
	
	private void acaoIrSobre() {
		Tela1 frame = new Tela1();
		frame.setContentPane(new Sobre());
		frame.setVisible(true);
		dispose();
	}
	
	
	
	public Tela1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 412);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu AbaMenu = new JMenu("Menu");
		menuBar.add(AbaMenu);
		
		JMenuItem IrCadastro = new JMenuItem("Cadastro");
		IrCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoIrCadastro();
				
			}
		});
		AbaMenu.add(IrCadastro);
		
		JMenuItem IrConsulta = new JMenuItem("Consulta");
		IrConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoIrConsulta();
			}
		});
		AbaMenu.add(IrConsulta);
		
		JMenuItem IrSobre = new JMenuItem("Sobre");
		IrSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoIrSobre();
			}
		});
		AbaMenu.add(IrSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 583, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 363, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}

}
