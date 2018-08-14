package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.FormularioModel;

@WebServlet(urlPatterns="/alterar-produto")
public class AlterarController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	FormularioModel formulario = new FormularioModel();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String nome = req.getParameter("nome");
		Double valor = Double.parseDouble((req.getParameter("valor")));
		String descricao = req.getParameter("descricao");
		String categoria = req.getParameter("categoria");
		
		formulario.setNome(id);
		formulario.setNome(nome);
		formulario.setValor(valor);
		formulario.setDescricao(descricao);
		formulario.setCategoria(categoria);

		
		req.setAttribute("formulario", formulario);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/alterar-produto.jsp");
		dispatcher.forward(req, resp);
		
		
		
	}
}
