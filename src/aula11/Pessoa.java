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
	
	//m�todo "final" n�o pode ser subescrito
	public final void imprime()
	{
		
	}
	
	//m�todo "private" n�o pode ser subescrito - n�o pode ser herdado
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
	
	//n�o poder ser herdado e subescrito, mas com visibilidade inferior
	protected void espie()
	{
			
	}
	
	public Pessoa exibir()
	{
		return new Pessoa();
	}
}
