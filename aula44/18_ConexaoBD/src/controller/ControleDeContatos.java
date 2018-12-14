package controller;

import model.Contato;
import model.DAO.ContatoDAO;
import util.teclado;

public class ControleDeContatos {
	
	private static final int CADASTRAR_MENSAGEM = 1;
	private static final int VISUALIZAR_MENSAGENS = 2;
	private static final int APAGAR_MENSAGEM = 3;
	private static final int ATUALIZAR_MENSAGEM = 4;
	private static final int SAIR = 5;

	public static void main(String[] args) {
		
		
		ControleDeContatos cdc = new ControleDeContatos();
		
		int opcao = SAIR;
		
		
		
		do {
			cdc.mostrarMenu();
			opcao = teclado.lerInt("Digite sua opção");

			switch (opcao) {
			case CADASTRAR_MENSAGEM:
				cdc.cadastrarMensagem();
				break;
			
			case VISUALIZAR_MENSAGENS:
				 cdc.buscarMensagens();
				 break;
			
			default:
				System.out.println("Opção invalida!");
			}
			teclado.lerTexto("Pressione uma tecla para continuar...");

		} while (opcao != SAIR);
		
	}

	
	public void mostrarMenu() {
		
		
		System.out.println("===================================  =");
		System.out.println("         Cadastro de Mensagens        ");
		System.out.println("====================================  ");
		System.out.println("1 - Cadastrar Mensagem");
		System.out.println("2 - Mostrar Mensagens");
		System.out.println("3 - Apagar Mensagem");
		System.out.println("4 - Atualizar Mensagem");
		System.out.println("5 - sair");
	}
	
	public void cadastrarMensagem() {
	
		System.out.println("===================================  =");
		System.out.println("         Cadastro de Mensagens        ");
		System.out.println("====================================  ");
		String nome = teclado.lerTexto("Nome: ");
		String email = teclado.lerTexto("E-mail: ");
		String mensagem = teclado.lerTexto("Mensagem: ");
		
		Contato contato = ContatoDAO.inserir(nome, email, mensagem);
		
		System.out.println(contato);
		
	}
	
	public void buscarMensagens() {
		
		Contato[] contatos = ContatoDAO.buscarTodos();

		for (int i=0; i<contatos.length; i++){
			if (contatos[i] !=null){
				System.out.println(
						contatos[i].getId() + "-----" +
						contatos[i].getNome() + "-----" +
						contatos[i].getEmail() + "-----" +
						contatos[i].getMensagem());
			}
		 }
	}
	
	public void apagarMensagem() {
		
		
		System.out.println("===================================  =");
		System.out.println("         Apagar Mensagem        ");
		System.out.println("====================================  ");
		int id = teclado.lerInt("Mensagem apagada com sucesso");
	
		ContatoDAO.excluir(id);
		
		System.out.println("Mensagem apagada com sucesso");
	}

	public void atualizarMensagem() {
		
		System.out.println("====================================");
		 System.out.println(" Atualizar Mensagem ");
		 System.out.println("====================================");
		 int id = teclado.lerInt("Digite o número id da mensagem a ser editada:");
		 String mensagem = teclado.lerTexto("Mensagem: ");

		 ContatoDAO.atualizar(mensagem, id);

		 System.out.println("Mensagem atualizada com sucesso");
		
	}
	
	
}
