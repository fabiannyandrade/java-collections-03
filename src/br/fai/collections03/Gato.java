package br.fai.collections03;

public class Gato extends Animal{
	
	public Gato() {
		setCor("branco");
		
	}
	
	public Gato(String cor) {
		setCor(cor);
	}
	
	@Override
	public void som() {
		super.som();
		System.out.println("eu gosto de miar");
	}
	
	public void oQueFacoDuranteANoite() {
		System.out.println("Gosto de pular a" + "cerca toda noite");
	}

}
