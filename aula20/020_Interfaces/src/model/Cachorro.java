package model;

public class Cachorro implements Animal {
	
	private String nome;
	
	public Cachorro(String nome) {
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
		return "au! au!";
	}

}
