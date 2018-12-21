package model.DAO;

import java.sql.*;

import model.Notebook;
import model.Usuario;
import util.Conexao;
import util.Configurador;

	public class NotebookDAO {
	
	Configurador config = new Configurador();
	String url;
	String driver;
	String login;
	String senha;
	
	
	public NotebookDAO() {
		
		url = config.getUrl();
		driver = config.getDriver();
		login = config.getLogin();
		senha = config.getSenha();


	}

	public static Notebook inserirNotebook(String serialNote, 
			String modelo, String descricao, int estoque,
	double precoUnitario, String figura, String dataCadastro) {
		
		
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
			// Criação do insert
			String sql = "insert into usuario (login, senha, tipo) values (?,?,?)";
		
			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver,
					noteDAO.login, noteDAO.senha);
			
			// Abrir a conexão
			Connection con = conex.obterConexao();
			
			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1, serialNote);
			comando.setString(2, modelo);
			comando.setString(3, descricao);
			comando.setInt(4, estoque);
			comando.setDouble(5, precoUnitario);
			comando.setString(6, figura);
			comando.setString(7, dataCadastro);
	
			// Comando executado
			comando.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return notebook;
	}

	public static Notebook[] buscarTodos(){
		
		Notebook[] notebook = null;
		
		try {

			String sql = "Select * from notebook";

			Conexao conex = new Conexao ("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true%serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver","jeffrey","password");
			
			Connection con = conex.obterConexao();

			Statement comando = con.createStatement();


			ResultSet rs = comando.executeQuery(sql);

			notebook = new Notebook[10];

			int i = 0;
			while (rs.next()) {
				notebook[i++] = new Notebook(rs.getString("construSerialNote"), rs.getString("construModelo"), 
						rs.getString("construDescricao"), rs.getInt("construEstoque"), rs.getDouble("construPrecoUnitario"), rs.getString("construFigura"), rs.getString("construDataCadastro"));
			} 

			rs.close();
			comando.close();
			con.close();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		return notebook;
	}
	

	
	
	public static Notebook excluir (int serialNote) {
		
		Notebook notebook = null;
		
		
		try {
			String sql = "delete from notebook where serialnote = ?";

			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true%serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver","jeffrey","password");

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);

			comando.setInt(1, serialNote);
			comando.executeUpdate();

		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
		
		return notebook;
	
	}

	

	
	public static Notebook atualizar(String descricao, int estoque, double precoUnitario,
			String figura, String dataCadastro, String serialNote) {
		
		Notebook notebook = null;
		
		
		try {
			String sql = "update notebook set descricao = ?, estoque = ?, precounitario = ?, figura = ?, datacadastro = ? where serialnote = ?";

			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true%serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver","jeffrey","password");

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setString(1,descricao);
			comando.setInt(2,estoque);
			comando.setDouble(3,precoUnitario);
			comando.setString(4,figura);
			comando.setString(5,dataCadastro);
			comando.setString(6,serialNote);
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	
		
		return notebook;
	
	}
	
	public static Notebook atualizar(String descricao, String serialNote) {
		
		Notebook notebook = null;
		
		
		try {
			String sql = "update notebook set descricao = ? where serialnote = ?";

			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true%serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver","jeffrey","password");

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setString(1,descricao);
			comando.setString(2, serialNote);

		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	
		
		return notebook;
	
	}

	public static Notebook atualizar(int estoque, String serialNote) {
		
		Notebook notebook = null;
		
		
		try {
			String sql = "update notebook set estoque = ? where serialnote = ?";

			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true%serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver","jeffrey","password");

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);
			
			
			comando.setInt(1,estoque);
			comando.setString(2,serialNote);

		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	
		
		return notebook;
	
	}

	
	public static Notebook atualizar(double precoUnitario, String serialNote) {
		
		Notebook notebook = null;
		
		
		try {
			String sql = "update notebook set precounitario = ? where serialnote = ?";

			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true%serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver","jeffrey","password");

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setDouble(1,precoUnitario);
			comando.setString(2,serialNote);
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	
		
		return notebook;
	
	}

	public static Notebook atualizar(String figura, String serialNote ,int assinatura) {
		
		Notebook notebook = null;
		
		
		try {
			String sql = "update notebook set figura = ? where serialnote = ?";

			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true%serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver","jeffrey","password");

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);
			
			
			comando.setString(1,figura);
			comando.setString(2,serialNote);
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	
		
		return notebook;
	
	}

	public static Notebook atualizar(String dataCadastro, String serialNote, double assinatura) {
		
		Notebook notebook = null;
		
		
		try {
			String sql = "update notebook set datacadastro = ? where serialnote = ?";

			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true%serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver","jeffrey","password");

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setString(1,dataCadastro);
			comando.setString(2,serialNote);
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	
		
		return notebook;
	
	}

	
	
}
