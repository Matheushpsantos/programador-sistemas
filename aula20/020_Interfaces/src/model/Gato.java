package model;

public class Gato implements Animal {
	
	private String nome;
	
	public Gato(String nome) {
		this.nome = nome;
	}

	@Override
	public String seuNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public String seuBarulho() {
		// TODO Auto-generated method stub
		return "miau!";
	}

}
