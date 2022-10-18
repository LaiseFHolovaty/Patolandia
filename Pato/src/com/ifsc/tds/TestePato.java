package com.ifsc.tds;

public class TestePato {

	public static void main(String[] args) {
		PatoReal patolino = new PatoReal();
		PatoDomestico patoDonald = new PatoDomestico();
		PatodeBorracha patinho = new PatodeBorracha();
		PatodeMadeira patoo = new PatodeMadeira();
		
		patolino.display();
		patolino.quack();
		patolino.nadar();
		patolino.Voador();
		patoDonald.display();
		patoDonald.quack();		
		patoDonald.nadar();
		patoDonald.Voador();
		patinho.display();
		patinho.quack();
		patinho.nadar();
		patoo.display();
		patoo.nadar();
	}

}
