package br.com.fbreda.utilidades.salvaBandoDados;

import br.com.fbreda.utilidades.geradorDB.FactoryDePessoas;
import br.com.fbreda.utilidades.geradorDB.Pessoa;
import br.com.fbreda.utilidades.tempoExecucao.TempoExecucao;

/**
 * @author Fabricio Breda 24 de fev de 2018 -
 */
public class TesteDB {

	public static void main(String[] args) {

		TempoExecucao.comecar();
		
		FactoryDePessoas factoryPessoa = new FactoryDePessoas();
		PessoaDB pessoadb = new PessoaDB();

		for (int i = 0; i < 1000; i++) {

			Pessoa pessoa = factoryPessoa.factoryPessoa();
			pessoadb.save(pessoa);

		}

		System.out.println(TempoExecucao.parar());
	}

}
