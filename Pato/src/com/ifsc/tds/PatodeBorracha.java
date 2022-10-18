package com.ifsc.tds;

public class PatodeBorracha extends Pato implements Quack{
	
	@Override
	public void quack() {
		System.out.println("Quick!");
	}
	public void display() {
		System.out.println("Oi! Eu sou um Pato de Borracha");
	}
	public void nadar() {
		System.out.println("Estou boiando");
	}
}
