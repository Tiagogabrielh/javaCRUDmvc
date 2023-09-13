package br.com.alura.projeto1.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.projeto1.modelo.Banco;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		Banco banco = new Banco();
		boolean tem = banco.verificarUsuario(nome, senha);
		if(tem) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("nome", nome);
			return "redirect:entrada?acao=ListaItens";
		}
		
		return "redirect:entrada?acao=FazerLogin";
	}

}
