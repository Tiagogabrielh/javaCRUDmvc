package br.com.alura.projeto1.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.projeto1.modelo.Banco;
import br.com.alura.projeto1.modelo.Item;

public class Remove implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		Banco banco = new Banco();
		banco.removeItem(id);
		
		
		return "redirect:entrada?acao=ListaItens";
	}

}
