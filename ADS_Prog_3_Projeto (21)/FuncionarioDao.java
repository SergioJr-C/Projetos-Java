package Exemplo3a;

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

	public void adicionar(Funcionario funcionario) {
		String sql = "insert into funcionario (nome, email, cargo) values (?,?,?)";

		try {
			// Cria��o do Prepared Statement para inser��o de um novo Funcion�rio
			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			// Setando os valores de acordo com o funcion�rio recebido por par�metro
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getEmail());
			stmt.setString(3, funcionario.getCargo());

			// Executa e ap�s fecha
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public LinkedList<Funcionario> listar() {
		String sql = "select * from funcionario";
		
		try {
			LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// Criando o objeto Funcionario
				Funcionario f = new Funcionario(rs.getString("nome"), rs.getString("email"), rs.getString("cargo"));
				f.setId(rs.getInt("id"));				

				// Adicionando o objeto � lista
				funcionarios.add(f);
			}
			rs.close();
			stmt.close();
			return funcionarios;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public LinkedList<Funcionario> procurar(String nome) {
		String sql = "select * from funcionario where nome like ? order by nome";
				
		try {
			LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setString(1, '%' + nome + '%');
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {				
				Funcionario funcionario = new Funcionario(rs.getString("nome"), rs.getString("email"), rs.getString("cargo"));
				funcionario.setId(rs.getInt("id"));
				funcionarios.add(funcionario);
			}
			rs.close();
			stmt.close();
			return funcionarios;			
		} catch (SQLException e) {
			throw new RuntimeException(e);
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
	
	public Funcionario procurar(int id) {
		String sql = "select * from funcionario where id = ? ";
				
		try {			
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if(rs != null){
				rs.next();
				Funcionario funcionario = new Funcionario(rs.getString("nome"), rs.getString("email"), rs.getString("cargo"));
				funcionario.setId(rs.getInt("id"));
				rs.close();
				stmt.close();
				return funcionario;
			}			
			return null;			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void alterar(Funcionario funcionario) {
	    String sql = "update funcionario set nome=?, email=?, cargo=? where id=?";
	    
	    try {
	        PreparedStatement stmt = this.conexao.prepareStatement(sql);
	        stmt.setString(1, funcionario.getNome());
	        stmt.setString(2, funcionario.getEmail());
	        stmt.setString(3, funcionario.getCargo());	        
	        stmt.setLong(4, funcionario.getId());
	        stmt.execute();
	        stmt.close();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}

	
	public void remover(Funcionario funcionario) {
		String sql = "delete from funcionario where id = ?";
				
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, funcionario.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
	public Funcionario buscar(String nome) {
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


}
