
package br.com.fbreda.utilidades.salvaBandoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fbreda.utilidades.geradorDB.Pessoa;

/**
 * @author Fabricio Breda 24 de fev de 2018 -
 */
public class PessoaDB {

	@SuppressWarnings("unused")
	private static String sqlCriarTabelaPessoa = "CREATE TABLE Pessoa (\n"
			+ "	    id int auto_increment primary key,\n" + "	    identidade varchar(12) not null,\n"
			+ "	    nomeCompleto varchar(50) not null,\n" + "	    email varchar(35) not null,\n"
			+ "	    telefone varchar(20) not null,\n" + "	    dataNascimento varchar(10) not null);";

	public void save(Pessoa pessoa) {

		/* Opção para realizar a inserção.
		 * String sql =
		 * "INSERT INTO Pessoa (identidade, nomeCompleto, email, telefone, dataNascimento) VALUES ('"
		 * + pessoa.getIdentidade() + "','" + pessoa.getNomeCompleto() + "','" +
		 * pessoa.getEmail() + "','" + pessoa.getTelefone() + "','" +
		 * pessoa.getDataNascimento() + "');";
		 */

		String sql2 = "INSERT INTO Pessoa (identidade, nomeCompleto, email, telefone, dataNascimento) VALUES (?,?,?,?,?)";

		Connection conexao = FabricaDeConexao.getConexao();
		PreparedStatement insereST = null;

		try {

			/* Opção sql para inserir dados comn PreparedStatement
			 * insereST = conexao.prepareStatement(sql);
			 *  insereST.executeUpdate();
			 */

			insereST = conexao.prepareStatement(sql2);
			insereST.setString(1, pessoa.getIdentidade());
			insereST.setString(2, pessoa.getNomeCompleto());
			insereST.setString(3, pessoa.getEmail());
			insereST.setString(4, pessoa.getTelefone());
			insereST.setString(5, pessoa.getDataNascimento());
			insereST.executeUpdate();
			
			//System.out.println("Dados enviados");

		} catch (SQLException e) {

			System.out.println("Erro ao incluir dados. Mensagem: " + e.getMessage());

		} finally {

			try {

				conexao.close();
				insereST.close();

			} catch (Throwable t) {

				System.out.println("Erro ao fechar conexoes. Mensagem: " + t.getMessage());

			}

		}

	}

}
