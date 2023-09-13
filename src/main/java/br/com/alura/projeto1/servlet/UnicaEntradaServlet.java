package br.com.alura.projeto1.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.projeto1.acao.Acao;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public UnicaEntradaServlet() {
        super();   }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		String nomeClasse = "br.com.alura.projeto1.acao." + paramAcao;
		
		
		HttpSession sessao = request.getSession();
		boolean naoTemSessao= sessao.getAttribute("nome") == null;
		boolean ehProtegido= !(paramAcao.equals("Login") || paramAcao.equals("FazerLogin"));
		
		if(naoTemSessao && ehProtegido) {
			response.sendRedirect("entrada?acao=Login");
			return;
		}
		
		String nome = null;
		
		try {
			Class classe = Class.forName(nomeClasse);
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		String[] tipoDeEndereco = nome.split(":");
		if(tipoDeEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/" +tipoDeEndereco[1]);
			rd.forward(request, response);
		}else {
			response.sendRedirect(tipoDeEndereco[1]);
		}
		
		
	}

}
