package br.com.fbreda.utilidades.geradorDB;

import java.io.Serializable;

/*CREATE TABLE Pessoa (
	    id int auto_increment primary key,
	    identidade varchar(12) not null,
	    nomeCompleto varchar(50) not null,
	    email varchar(50) not null,
	    telefone varchar(20) not null,
	    dataNascimento varchar(10) not null);*/

/**
 * @author Fabricio Breda 22 de fev de 2018 -
 */
public class Pessoa implements Serializable {

	private static final long serialVersionUID = -5960147849642054831L;
    
	private Integer id;
	private String identidade;
	private String nomeCompleto;
	private String email;
	private String telefone;
	private String dataNascimento;

	public Pessoa(String identidade, String nomeCompleto, String email, String telefone, String dataNascimento) {
		this.identidade = identidade;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

}