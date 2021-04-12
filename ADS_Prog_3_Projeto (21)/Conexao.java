package Exemplo3a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	// Deixa o construtor privado para n�o instanciar essa classe.
	private Conexao() {}
	
	public static Connection getConexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
