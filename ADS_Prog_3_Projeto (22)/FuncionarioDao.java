package Exemplo3b;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;



public class FuncionarioDao {
	private Connection conexao;

	public FuncionarioDao() {
		this.conexao = Conexao.getConexao();
	}

	

	
	
	public void inserir(Funcionario f) {
		String sql = "insert into funcionario (nome, email, cargo)value (?,?,?)";//1,2,3
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getEmail());
			stmt.setString(3, f.getCargo());
			
			boolean inseriu = stmt.execute(); //0 se inseriu e 1 se deu erro
			if(inseriu) {
				System.out.println("Erro ao Inserir.");
			}
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao inserir funcionário. " +e.getMessage());
			e.printStackTrace();
		}

	}
	
	
	public LinkedList<String> listarNomes() {
		String sql = "select  nome from funcionario";
				
		try {
			LinkedList<String> nomes = new LinkedList<String>();
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {				
				nomes.add(rs.getString("nome"));
			}
			rs.close();
			stmt.close();
			return nomes;			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public LinkedList<String> listarCargos(){
		String sql = "select distinct cargo from funcionario order by cargo";
		try {
			LinkedList<String> cargos = new LinkedList<String>();
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if(rs != null) {
				while (rs.next()){
					cargos.add(rs.getString("cargo"));
				}
			}
			rs.close();
			stmt.close();
			return cargos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public Funcionario buscarNome(String nome) {
		String sql = "select * from Funcionario where nome = ?";
		Funcionario funcionario = null;
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setString(1,nome);
			ResultSet rs = stmt.executeQuery();
			if(rs != null) {
				rs.next();
				funcionario = new Funcionario(rs.getString("nome"), rs.getString("email"),rs.getString("cargo"));
				funcionario.setId(rs.getInt("id"));
			}
			rs.close();
			stmt.close();
			return funcionario;
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public LinkedList<Funcionario> buscarCargo(String cargo) {
		String sql = "select * from Funcionario where cargo = ?";
		LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setString(1,cargo);
			ResultSet rs = stmt.executeQuery();
			if(rs != null) {
				
				while(rs.next()) {
				Funcionario f = new Funcionario(rs.getString("nome"), rs.getString("email"),rs.getString("cargo"));
				f.setId(rs.getInt("id"));
				funcionarios.add(f);
			}
				}
			rs.close();
			stmt.close();
			return funcionarios;
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	
}
