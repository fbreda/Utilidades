package br.com.fbreda.utilidades.salvaArquivo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import br.com.fbreda.utilidades.geradorDB.*;


//Classe salva em arquivo mantendo o conteudo existente.
/**
 * @author Fabricio Breda
 * 22 de fev de 2018 - 
 */
public class SalvaEmArquivoAppend {

	public static void main(String[] args) throws IOException {

		FactoryDePessoas gerador = new FactoryDePessoas();

		File arquivo = new File("arquivo.txt");

		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}
		for (int i = 0; i < 1000; i++) {
			Pessoa pessoa = gerador.factoryPessoa();
			List<String> lista = new ArrayList<>();
			lista.add(pessoa.getIdentidade() + ";" + pessoa.getNomeCompleto() + ";" + pessoa.getEmail() + ";"
					+ pessoa.getTelefone() + ";" + pessoa.getDataNascimento());

			Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);

		}
		
		System.out.println("processo terminou!");
	}
}
