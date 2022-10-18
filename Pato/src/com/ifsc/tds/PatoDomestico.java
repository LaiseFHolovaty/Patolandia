package com.ifsc.tds;

public class PatoDomestico extends Pato implements Voar, Quack{

	@Override
	public void display() {
		System.out.println("Oi! Eu sou um Pato Doméstico");
	}

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void Voador() {
		System.out.println("Estou voando!");
	} 
}
