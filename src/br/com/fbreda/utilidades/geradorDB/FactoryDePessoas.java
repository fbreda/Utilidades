package br.com.fbreda.utilidades.geradorDB;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
/**
 * @author Fabricio Breda
 * 22 de fev de 2018 - 
 */
public class FactoryDePessoas implements Serializable {

	private static final long serialVersionUID = -9182609127753460471L;

	private static final String[] nome = { "Genivaldo", "Matusalem", "Davi", "Paulo", "Marcos", "Ricardo", "João",
			"João Claudio", "Pedro", "Saulo", "Mauricio", "Alberto", "Carlos", "Carlos Alberto", "Alberto Carlos",
			"Marina", "Andreia", "Marcia", "Aline", "Marinalva", "Jandira", "Ariadne", "Carlina", "Regina", "Marta",
			"Fabricio", "Olinda", "Bianca", "Maristela", "Silvana", "Nanci", "Neri", "Monica", "Magali", "Marcela",
			"Marcelo", "Helena", "Beatriz", "Ana", "Julia", "Ana Julia", "Branca", "Lourdes", "Fatima", "Roberto",
			"Tereza", "Paloma", "Antonio", "Renato", "Odorico", "Tiago", "Murilo", "Andre", "Cleber", "José",
			"José Carlos", "Milton", "Monir", "Stepan", "Alexandre", "Ailton", "Anderson", "Arlete", "Celso", "Bruno",
			"Catia", "Cristiane", "Clelio", "Clovis", "Danilo", "Gesse", "Edson", "José", "Carlos", "Roberto", "Fabio",
			"Francisco", "Gabriel", "Gustavo", "Hugo", "Jeferson", "Marcelo", "Marcio", "Maria", "Maria Aparecida",
			"Regiane", "Rodolfo", "Roger", "Sergio", "Ulisses", "Wagner", "Walter", "Valter", "Willian", "Fernando",
			"Alessandra", "Laura", "Sofia", "Adriana", "Alice", "Larissa", "Manuela", "Silvia", "Camila", "Mariana",
			"Lara", "Alessandra", "Amanda", "Luana", "Valentina", "Juliana", "Rebeca", "Isadora", "Lorena", "Vitoria",
			"Gabriela", "Jéssica", "Cecilia", "Nicole", "Rafaela", "Luma", "Luna", "Irma", "Melissa", "Ester",
			"Heloisa", "Milena", "Daniela", "Barbara", "Patricia", "Laís", "Priscila", "Catarina", "Debora", "Natalia",
			"Luciana", "Miguel", "Artur", "Enzo", "Felipe", "Heitor", "Vinicius", "Samuel", "Diego", "Leonardo",
			"Nicolas", "Daniel", "Antonio", "Mateus", "Caio", "Joaquim", "Luiz", "Anderson", "Clayton", "Jonathan",
			"Renan", "Douglas", "Vicente", "Otavio" };

	private static final String[] sobrenome = { "Olimpio", "Monteiro", "Azevedo", "Master", "Norris", "Alencar", "Wild",
			"Chupstink", "Laredo", "Montebelo", "Braga", "Bredo", "Blanco", "Barros", "Loyd", "Quintus", "Mortimer",
			"França", "Maltus", "Einstein", "Freud", "Monteferrario", "Castelo", "Branco", "Alves", "Silva", "Santos",
			"Oliveira", "Pereira", "Caribe", "Araujo", "Pinho", "Montesquieu", "Richelieu", "Maquiavel", "Donato",
			"Dias", "Campobelo", "Marinho", "Almeida", "Kossar", "dos Santos", "Rivera", "Alencar", "Capos",
			"Capobianco", "Kid", "Black", "Gray", "Wincz", "Shultz", "Brown", "Carter", "Moura", "Queiroz", "Carvalho",
			"Borges", "Miranda", "Gonsalves", "Gonçalves", "Costa", "Mendes", "Cunha", "Pinto", "Moreira", "Ramos",
			"Melo", "Ferreira", "Lima", "Marques", "Vieira", "Ribeiro", "Nascimento", "Lopes", "Arantes", "Fux",
			"Vilela", "Quintela", "Fonseca", "Weber", "Barroso", "Mumes", "Dodge", "Mallfoy", "Avila", "Pires", "Penha",
			"Pacheco", "Sales", "Magalhães", "Brandão", "Lacerda", "Diniz", "Aires", "Paiva", "Antunes", "Freitas",
			"Bastos", "Leal", "Sampaio", "Cabral", "Couto", "Castilho", "Muniz", "Esteves", "Ataide", "Crispim",
			"Pedroso", "Ferraz", "Vasconcelos", "Galvão", "Boaventura", "Padilha", "Rabelo", "Gentil", "Aguilar",
			"Garcia", "Furlan", "Neves", "Tavares", "Vilasboas", "Reis", "Nogueira", "Pinheiro", "Cruz", "Barreto",
			"Prado", "Almeida", "Medeiros", "Lancelotti", "Junior", "Neto", "da Silva", "de Almeida", "de Araujo",
			"de Barros", "da Costa", "da Cunha", "de Lima", "de Vasconcelos", "Marcondes" };

	private static final String[] ddd = { "11", "11", "11", "12", "13", "16", "21", "31", "41", "51", "61", "71", "81",
			"91", "11" };

	private static final String[] letras = { "a", "b", "c", "d", "e", "f", "j", "k", "l", "m", "n", "o", "p", "q", "r",
			"s", "t", "u", "v", "w", "y", "x", "z" };

	private static final String[] provedores = { "@hotmail.com", "@msn.com.br", "@msn.com", "@hotmail.com",
			"@gmail.com", "@bol.com.br", "@uol.com.br", "@linux.org", "@gov.br", "@yahoo.com", "@yahoo.com.br",
			"@webmail.com" };

	private String nomeCompleto;

	private Random random = new Random();

	private String getNomeCompleto() {

		final int qtdeSobrenomes = random.nextInt(6);//Gera aproximadamente 70% de chance de 2 sobrenomes
		String n;
		String s1;
		String s2 = "";

		if (qtdeSobrenomes > 2) {

			n = nome[random.nextInt(nome.length)];
			s1 = sobrenome[random.nextInt(sobrenome.length)];
			s2 = sobrenome[random.nextInt(sobrenome.length)];

			if (s1.equals(s2)) {
				s2 = "Fox";
			}

		} else {
			n = nome[random.nextInt(nome.length)];
			s1 = sobrenome[random.nextInt(sobrenome.length)];

		}

		return this.nomeCompleto = n + " " + s1 + " " + s2;
	}

	private String getTelefone() {

		final int celularOuTelefone = random.nextInt(2);
		final String telTipo;
		final String ultimosNumeros;
		final String primeirosNumeros;

		String codigoDDD = ddd[random.nextInt(ddd.length)];

		if (celularOuTelefone == 1) {

			telTipo = "Cel";
			Integer a = (random.nextInt(2999) + 7000);
			primeirosNumeros = a.toString();
			Integer b = random.nextInt(8999) + 1000;
			ultimosNumeros = b.toString();

		} else {

			telTipo = "Tel";
			Integer a = (random.nextInt(499) + 200);
			primeirosNumeros = a.toString();
			Integer b = random.nextInt(8999) + 1000;
			ultimosNumeros = b.toString();

		}

		return telTipo + "=" + "(" + codigoDDD + ")" + primeirosNumeros + "-" + ultimosNumeros;
	}

	// Gera uma identificação qualquer.
	private String getIdentidade() {

		Integer a = random.nextInt(899) + 100;
		Integer b = random.nextInt(8999) + 1000;
		String letra1 = letras[random.nextInt(letras.length)];
		String letra2 = letras[random.nextInt(letras.length)];
		String letra3 = letras[random.nextInt(letras.length)];
		String letra4 = letras[random.nextInt(letras.length)];

		return letra1.toUpperCase() + letra2.toUpperCase() + "-" + a.toString() + letra3 + b.toString() + letra4;
	}

	private String getDataNascimento() {

		LocalDate dataAtual = LocalDate.now();
		int idadeMinima = 6570;// idade minima 18 anos
		int idadeMaxima = random.nextInt(21900);

		LocalDate aniversario = dataAtual.minusDays(idadeMaxima + idadeMinima);// idade entre 18 e 78

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");// Saida String

		return aniversario.format(formatador);

	}

	private String getEmail() {

		String email = "";
		String provedor = provedores[random.nextInt(provedores.length - 1)];
		String[] nomeSeparado = nomeCompleto.split(" ");

		if (nomeSeparado[1].length() > 2) {

			email = nomeSeparado[0].toLowerCase() + "." + nomeSeparado[1].toLowerCase() + provedor;

		} else {

			email = nomeSeparado[0].toLowerCase() + "." + nomeSeparado[2].toLowerCase() + provedor;
		}

		return email;
	}

	public Pessoa factoryPessoa() {

		Pessoa pessoa = new Pessoa(getIdentidade(), getNomeCompleto(), getEmail(), getTelefone(), getDataNascimento());

		return pessoa;

	}

}// fim da classe
