package model;

public class Professor extends Usuario {

	private int matricula;
	private String nome;
	private String  especialidade;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	@Override
	public void mostrar() {
		
		System.out.println("Informações do Professor: ");
		System.out.println("Login: "+ super.getLogin());
		System.out.println("Senha: *****");
		
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("Turno: "+ especialidade);	
	}
	public Professor() {
		super();

	}
	public Professor(String login, String senha, int tipo, String especialidade, int matricula, String nome) {
		super(login, senha, tipo);
		
		this.especialidade = especialidade;
		this.matricula = matricula;
		this.nome = nome;
	}


}
