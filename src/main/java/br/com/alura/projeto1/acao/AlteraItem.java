package br.com.alura.projeto1.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.projeto1.modelo.Banco;
import br.com.alura.projeto1.modelo.Item;

public class AlteraItem implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		String nome = request.getParameter("nome");
		Integer qtd = Integer.parseInt(request.getParameter("qtd"));
		Double preco = Double.parseDouble(request.getParameter("preco"));
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		Item item = banco.getItemPeloid(id);
		item.setNome(nome);
		item.setQtd(qtd);
		item.setPreco(preco);
				
		return "redirect:entrada?acao=ListaItens";
	}

}
