package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionFactory {

	// Nome do usuário do  mySQL
	private static final String USERNAME = "root";
	
	// senha do banco
	private static final String PASSWORD = "Roth86Barth/";
	
	// Caminho do banco de dados, porta, nome do banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	/*
	 * Conexao com o banco de dados
	 */
	
	 
	 public static Connection createConnectionToMySQL() throws Exception{
		// faz om que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		// Cria a conexao com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String [] args) throws Exception {
		
		// Recuperar conexao com o banco de dados
		Connection con = createConnectionToMySQL();
		
		// Testar se a conexao é nula
		if(con!= null) {
			System.out.println("Conexao obtida com sucesso!");
			con.close();
		}
	}
}
