package controller;

public class SobrecargaMetodo {
//atributos
	int idade ;
	String nome ;

//metodos	
	public static void main(String[] args) {
	//o método main está instanciando um objeto
		SobrecargaMetodo scm = new SobrecargaMetodo ();
		scm.CadastrarPessoa(28);
		scm.CadastrarPessoa("Michael Ferreira");
		scm.CadastrarPessoa(35, "Fabricio Gomes");
	}
	public void CadastrarPessoa (int valor) {
		idade = valor;
		System.out.println("idade: " + idade);
	}
	public void CadastrarPessoa (String valor) {
		nome = valor;
		System.out.println("nome: " + nome);
	}
	public void CadastrarPessoa (int valor1, String valor2) {
		idade = valor1;
		nome = valor2;
		System.out.println("Idade: "+ idade + " -nome " + nome);
	}
}
