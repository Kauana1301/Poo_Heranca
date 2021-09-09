package br.com.generation.heranca;

public class Animal01 {

	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void emitirSom() {
		System.out.println("***Emitindo som***");
	}
	public void correr() {
		System.out.println("***Animal correndo***");
	}

}
