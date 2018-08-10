package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.Banco;

@WebServlet(urlPatterns="/removercontroller")
public class RemoverController extends HttpServlet{
	
	Banco banco = new Banco();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		System.out.println(id);
		
		banco.Deletar(id);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/listar-produtos.jsp");
		dispatcher.forward(req, resp);
		
	}

}
