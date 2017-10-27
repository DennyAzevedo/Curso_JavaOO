package aula10;

import java.time.LocalDate;

public class Pessoa 
{
	private String nome;
	
	private String sobrenome;
	
	private LocalDate dataNascimwento;
	
	private char sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public LocalDate getDataNascimwento() {
		return dataNascimwento;
	}

	public void setDataNascimwento(LocalDate dataNascimwento) {
		this.dataNascimwento = dataNascimwento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Pessoa()
	{
		super();
	}
	
	public Pessoa(String nome, String sobrenome, LocalDate dataNascimento, char sexo)
	{
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimwento = dataNascimento;
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "[nome=" + nome + ", sobrenome=" + sobrenome + ", dataNascimwento=" + dataNascimwento + ", sexo="
				+ sexo + ", ";
	}
	
	
}
