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

@WebServlet(urlPatterns="/cadastro-efetuado")
public class FormularioController extends HttpServlet{
	
	
	//Instanciando o banco para gardar as informa��es
	Banco banco = new Banco();
	
	//Instanciado o objeto para futuramente inserir os valores do formul�rio nas vari�veis encapsuladas
	FormularioModel formulario = new FormularioModel();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Obtendo os valores do Formul�rio
		String nome = req.getParameter("nome");
		double valor = Double.parseDouble(req.getParameter("valor"));
		String descricao = req.getParameter("descricao");
		String categoria = req.getParameter("categoria");
		
		
		//Atribuindo os valores do formul�rio as vari�veis encapsuladas
		formulario.setNome(nome);
		formulario.setValor(valor);
		formulario.setDescricao(descricao);
		formulario.setCategoria(categoria);
		
		//Inserindo as informa��es no banco de dados
		banco.Inserir(formulario);
		
		
		req.setAttribute("formulario", formulario);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/cadastro-efetuado.jsp");
		dispatcher.forward(req, resp);
	}
}
	