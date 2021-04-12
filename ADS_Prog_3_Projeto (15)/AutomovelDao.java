package Exec_3b;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.swing.JOptionPane;


public class AutomovelDao {
	private Connection conexao;

	public AutomovelDao() {
		this.conexao = Conexao.getConexao();
	}

	
	public LinkedList<Automovel> buscarMarca(String marca) { //acaoCombo
		String sql = "select * from automovel where marca = ?";
		LinkedList<Automovel> automoveis = new LinkedList<Automovel>();
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setString(1,marca);
			ResultSet rs = stmt.executeQuery();
			if(rs != null) {
				while(rs.next()) {
				Automovel a = new Automovel(rs.getString("marca"), rs.getString("modelo"),rs.getString("ano_fab"));
				a.setId(rs.getInt("id"));
				automoveis.add(a);
			}
			}
			rs.close();
			stmt.close();
			return automoveis;
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Erro ao buscar.");
			return null;
		}
	}
	
	public LinkedList<Automovel> buscarAno(String ano) {//acaoCombo
		String sql = "select * from automovel where ano_fab = ?";
		LinkedList<Automovel> automovel = new LinkedList<Automovel>();
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setString(1,ano);
			ResultSet rs = stmt.executeQuery();
			if(rs != null) {
				
				while(rs.next()) {
				Automovel a = new Automovel(rs.getString("marca"), rs.getString("modelo"),rs.getString("ano_fab"));
				a.setId(rs.getInt("id"));
				automovel.add(a);
			}
				}
			rs.close();
			stmt.close();
			return automovel;
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Erro ao buscar.");
			return null;
		}
	}
	
	
	public LinkedList<Automovel> buscarModelo(String modelo) {//acaoCombo
		String sql = "select * from automovel where modelo = ?";
		LinkedList<Automovel> automovel = new LinkedList<Automovel>();
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setString(1,modelo);
			ResultSet rs = stmt.executeQuery();
			if(rs != null) {
				
				while(rs.next()) {
				Automovel a = new Automovel(rs.getString("marca"), rs.getString("modelo"),rs.getString("ano_fab"));
				a.setId(rs.getInt("id"));
				automovel.add(a);
			}
				}
			rs.close();
			stmt.close();
			return automovel;
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Erro ao buscar.");
			return null;
		}
	}
	
	
	
	public LinkedList<String> listarMarcas(){//preencher Combo
		String sql = "select marca from automovel";
		
		try {
			LinkedList<String> marcas = new LinkedList<String>();
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				marcas.add(rs.getString("marca"));
			}
			rs.close();
			stmt.close();
			return marcas;
		} catch (SQLException e) {
			System.out.println("Erro ao listar marcas dos automóveis!" + e.getMessage());
			return null;
		}
	}
	
	public LinkedList<String> listarAno(){ //preencherCombo
		String sql = "select distinct ano_fab from automovel order by ano_fab";
		try {
			LinkedList<String> ano = new LinkedList<String>();
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if(rs != null) {
				while (rs.next()){
					ano.add(rs.getString("ano_fab"));
				}
			}
			rs.close();
			stmt.close();
			return ano;
		} catch (SQLException e) {
			System.out.println("Erro ao listar automóveis!" + e.getMessage());
			return null;
		}
		
	}
	
	
	
	public LinkedList<String> listarModelos(){ //preencherCombo
		String sql = "select distinct modelo from automovel order by modelo";
		try {
			LinkedList<String> modelo = new LinkedList<String>();
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if(rs != null) {
				while (rs.next()){
					modelo.add(rs.getString("modelo"));
				}
			}
			rs.close();
			stmt.close();
			return modelo;
		} catch (SQLException e) {
			System.out.println("Erro ao listar automóveis!" + e.getMessage());
			return null;
		}
		
	}
	
	
	public void inserir(Automovel a) {//cadastro
		String sql = "insert into automovel (marca, modelo, ano_fab)value (?,?,?)";//1,2,3
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setString(1, a.getMarca());
			stmt.setString(2, a.getModelo());
			stmt.setString(3, a.getAno_fab());
			
			boolean inseriu = stmt.execute(); //0 se inseriu e 1 se deu erro
			if(inseriu) {
				System.out.println("Erro ao Inserir.");
			}
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao inserir Automóvel. " +e.getMessage());
			e.printStackTrace();
		}

	}


	
}
