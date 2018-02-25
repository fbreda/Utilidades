package br.com.fbreda.utilidades.salvaArquivo;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import br.com.fbreda.utilidades.geradorDB.FactoryDePessoas;
import br.com.fbreda.utilidades.geradorDB.Pessoa;

//Classe salva em arquivo excluindo texto existente.
/**
 * @author Fabricio Breda 22 de fev de 2018 -
 */
public class SalvaEmArquivo {

	public static void main(String[] args) {

		FactoryDePessoas gerador = new FactoryDePessoas();

		try {
			FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
			PrintWriter pr = new PrintWriter(arquivo);

			for (int i = 0; i < 1000; i++) {
				Pessoa pessoa = gerador.factoryPessoa();

				pr.println(pessoa.getIdentidade() + ";" + pessoa.getNomeCompleto() + ";" + pessoa.getEmail() + ";"
						+ pessoa.getTelefone() + ";" + pessoa.getDataNascimento());

			}
			pr.close();
			arquivo.close();
			System.out.println("processo terminou!");

		} catch (Exception e) {
			System.out.println("Mensagem de erro: " + e.getStackTrace());
		}

	}

}
