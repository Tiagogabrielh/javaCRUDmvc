package br.com.alura.projeto1.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	
	private static List<Item> listona = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
		
	static {	
		Item item1 = new Item();
		item1.setNome("Óculos");
		item1.setPreco(100.00);
		item1.setQtd(10);
		item1.setId(chaveSequencial++);
		listona.add(item1);
		
		Usuario usuario1 = new Usuario();
		usuario1.setNome("usuario");
		usuario1.setSenha("1234");
		usuarios.add(usuario1);
	}
	
	public void guardarItem(Item item) {
		item.setId(chaveSequencial++);
		Banco.listona.add(item);
	}

	public List<Item> getItens() {
		return Banco.listona;
						
	}

	public Item getItemPeloid(Integer paramId) {
		for (Item itens : listona) {
			if(itens.getId() == paramId) {
				return itens;
			}
			
			
		}
		return null;
	}

	public void removeItem(Integer id) {
		Iterator<Item> it= listona.iterator();
		
		while(it.hasNext()) {
			Item item = it.next();
			if(item.getId() == id) {
				it.remove();
			}
		}
		
	}

	public boolean verificarUsuario(String nome, String senha) {
		
		for (Usuario usuario : usuarios ) {
			if(!usuario.getNome().equals(nome)) {
				return false;
			} 
			
			if(!usuario.getSenha().equals(senha))  {
				return false;
			}
			
		}
		return true;
	}
}
