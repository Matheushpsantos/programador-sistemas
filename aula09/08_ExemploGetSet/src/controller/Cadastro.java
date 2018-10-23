package controller;
	
	import model.Pessoa;
	
	public class Cadastro {
		
		public static void main (String[] args) {
			Pessoa pessoa = new Pessoa();
			
			pessoa.setNome("Leandro Ferra");
			pessoa.setIdade(28);
			pessoa.setSexo("masculino");
			
			System.out.println("Nome:" + pessoa.getNome());
			System.out.println("idade: " + pessoa.getIdade());
			System.out.println("sexo: " + pessoa.getSexo());
		}
	}
