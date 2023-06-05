/*
DAO é a sigla para Data Access Object, que pode ser traduzido como Objeto de Acesso a Dados. 
É um padrão de projeto (design pattern) utilizado na programação para separar a lógica de acesso 
a dados do restante da aplicação.
*/

package Cadastros;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	//Essa classe faz a conexão com banco de dados
	
	Connection conn; //Conexao com o Banco de dados
	PreparedStatement stmt; //Acessa a tabela (insert, update, delete, select)
	ResultSet rs; //Resultado da consulta a tabela(select)
	CallableStatement call; //Procedures e Function
	
	public void open() throws Exception {
		String url = "jdbc:mysql://localhost:3306/cadastros";
		String user = "root";
		String password = "";
		
		//Tratamento de exceção Try Catch
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Erro ao conectar com o banco");
		}
	}
	
	public void close() throws Exception{
		conn.close();
	}

}
