package br.com.alura.gerenciador.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Conexao {
	
	static String url = "jdbc:mysql://localhost/loja2";
	static String user = "root";
	static String password = "";
	
	public static Connection getConnection() {
		
		Connection conexao = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println("Conectado!");
		}catch(SQLException e) {
			System.out.println("Não conectado!" +e);
		}
		catch(ClassNotFoundException e) {
			System.out.println("Não conectado! "+e);
		}
		return conexao;
	}
}