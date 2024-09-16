package br.com.gomesx7.cm.visao;

import br.com.gomesx7.cm.modelo.Tabuleiro;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 0);
		new TabuleiroConsole(tabuleiro);
  }

}