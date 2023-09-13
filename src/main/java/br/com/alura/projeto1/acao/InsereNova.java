package br.com.alura.projeto1.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.projeto1.modelo.Banco;
import br.com.alura.projeto1.modelo.Item;

public class InsereNova implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		String nome= request.getParameter("nome");
		int qtd= Integer.parseInt(request.getParameter("qtd"));
		double preco= Double.parseDouble(request.getParameter("preco"));
		
		Banco banco = new Banco();
		Item item = new Item();
		item.setNome(nome);
		item.setQtd(qtd);
		item.setPreco(preco);
		banco.guardarItem(item);
		
		request.setAttribute("novoItem", banco);
		
		
		return "redirect:entrada?acao=ListaItens";
	}

}
