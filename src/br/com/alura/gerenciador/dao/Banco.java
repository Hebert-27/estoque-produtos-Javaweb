package br.com.alura.gerenciador.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.alura.gerenciador.model.FormularioModel;

public class Banco {
	
	public void Inserir(FormularioModel formulario) {
		try {
			Connection conexao = Conexao.getConnection();
			String query = "INSERT INTO produtos(nome, valor, descricao, categoria)VALUES(?, ?, ?, ?)";
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(query);
			System.out.println(stmt);
			stmt.setString(1, formulario.getNome());
			stmt.setDouble(2, formulario.getValor());
			stmt.setString(3, formulario.getDescricao());
			stmt.setString(4, formulario.getCategoria());
			stmt.execute();
			conexao.close();
		} catch (SQLException e) {
			System.out.println("Erro na lógica: "+e);
	
		}
	}
	
	public List<FormularioModel> Listar() throws SQLException {
		List<FormularioModel> lista = new ArrayList<FormularioModel>();
		Connection conexao = Conexao.getConnection();
		try {
			String query = "SELECT * FROM produtos";
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(query);
			ResultSet resultado = stmt.executeQuery();
			while(resultado.next()) {
				FormularioModel formulario = new FormularioModel();
				formulario.setId(resultado.getInt("id"));
				formulario.setNome(resultado.getString("nome"));
				formulario.setValor(resultado.getDouble("valor"));
				formulario.setDescricao(resultado.getString("descricao"));
				formulario.setCategoria(resultado.getString("categoria"));
				lista.add(formulario);
			}
		}catch(SQLException e) {
			System.out.println("Erro: " +e);
		}
		return lista;
	}
	
	public void Deletar(String id) {
		try {
			Connection conexao = Conexao.getConnection();
			String query = "DELETE FROM produtos WHERE id="+id;
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(query);
			stmt.execute();
			stmt.close();
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void AlterarProduto(FormularioModel formulario) {
		try {
			Connection conexao = Conexao.getConnection();
			String query = "UPDATE produtos SET nome=?, valor=?, descricao=? WHERE id=?";
			PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(query);
			stmt.setString(1, formulario.getNome());
			stmt.setDouble(2, formulario.getValor());
			stmt.setString(3, formulario.getDescricao());
			stmt.setInt(4, formulario.getId());
			
			stmt.execute();
			stmt.close();
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
	
