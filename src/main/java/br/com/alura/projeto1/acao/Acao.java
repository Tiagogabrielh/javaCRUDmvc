package br.com.alura.projeto1.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract interface Acao {
	
	String executa(HttpServletRequest request, HttpServletResponse response);

}
