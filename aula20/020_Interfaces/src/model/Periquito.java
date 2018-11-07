package model;

public class Periquito implements Animal {

	private String nome;
	
	public Periquito(String nome) {
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
		return "fiu! fiu! fiu!";
	}

}
