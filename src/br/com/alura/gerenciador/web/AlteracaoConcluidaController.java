package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.Banco;
import br.com.alura.gerenciador.model.FormularioModel;

@WebServlet(urlPatterns="/concluir-alteracao")
public class AlteracaoConcluidaController extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Banco banco = new Banco();
	FormularioModel formulario = new FormularioModel();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		formulario.setId(Integer.parseInt(req.getParameter("id")));
		formulario.setNome(req.getParameter("nome"));
		formulario.setValor(Double.parseDouble(req.getParameter("valor")));
		formulario.setDescricao(req.getParameter("descricao"));
		formulario.setCategoria(req.getParameter("categoria"));
		
		banco.AlterarProduto(formulario);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/listar-produtos.jsp");
		dispatcher.forward(req, resp);
	}
}
