package aula11;

public class Pessoa 
{
	private String nome;
	
	private String matricula;
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getMatricula() 
	{
		return matricula;
	}

	public void setMatricula(String matricula) 
	{
		this.matricula = matricula;
	}
	
	//método "final" não pode ser subescrito
	public final void imprime()
	{
		
	}
	
	//método "private" não pode ser subescrito - não pode ser herdado
	private void mostra()
	{
		
	}
	
	//poder ser herdado e subescrito, mas com visibilidade igual ou superior
	protected void olha()
	{
		
	}
	
	//poder ser herdado e subescrito, mas com visibilidade igual ou superior
	protected void veja()
	{
		
	}
	
	//não poder ser herdado e subescrito, mas com visibilidade inferior
	protected void espie()
	{
			
	}
	
	public Pessoa exibir()
	{
		return new Pessoa();
	}
}
