package br.com.alura.projeto1.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.projeto1.modelo.Banco;
import br.com.alura.projeto1.modelo.Item;

public class Mostra implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		Integer paramId= Integer.valueOf(request.getParameter("id"));
		Banco banco = new Banco();
		Item item  = banco.getItemPeloid(paramId);
		
		request.setAttribute("item", item);
		
		return "forward:AlteraItem.jsp";
	}

}
