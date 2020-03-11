package br.fai.collections03;

public abstract class Animal {
	
	public void som() {
		System.out.println("Este e o som padrao" + "de um animal:zzz");
	}
	
	public void dizerMeuNome() {
		System.out.println("O nome do animal e: xxx");
	}
	
	private void dizerMinhaIdade() {
		System.out.println("Minha idade e: XXX");
	}
	
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	private String cor = "preto";
	private int idade = 5;
	private String nome = "Nao definido";
	
	

}
