/**
 * 
 */
package br.com.fbreda.utilidades.salvaBandoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Fabricio Breda 24 de fev de 2018 -
 */
public class FabricaDeConexao {

	public static Connection getConexao() {
		String url = "jdbc:mysql://localhost:3306/testes?autoReconnect=true&useSSL=false";
		String user = "root";
		String password = "root";

		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			//System.out.println("Fabrica forneceu conexão");
			return conn;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

}
