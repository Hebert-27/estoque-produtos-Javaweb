package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/concluir-alteracao")
public class AlteracaoConcluidaController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String nome = req.getParameter("nome");
		Double valor = Double.parseDouble(req.getParameter("valor"));
		String descricao = req.getParameter("descricao");
		String categoria = req.getParameter("categoria");
		
		
		
		
	}
}
