package br.com.alura.projeto1.acao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.projeto1.modelo.Banco;
import br.com.alura.projeto1.modelo.Item;

public class ListaItens implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		
//		Item item3 = new Item();
//		item3.setNome("Headphone");
//		item3.setPreco(150.00);
//		item3.setQtd(15);
		Banco banco = new Banco();
//		banco.guardarItem(item3);
		List<Item> lista = banco.getItens();
		
		request.setAttribute("itens", lista );
		
		return "forward:ListaItens.jsp";
	}

}
