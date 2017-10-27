package aula11;

public class Aluno extends Pessoa
{
	@Override
	public void setMatricula(String matricula)
	{
		if(matricula.length() == 10)
		{
			super.setMatricula(matricula);
		}
		else
		{
			System.out.println("Matricula invalida para o aluno " + this.getNome());
		}
	}

	/* Não posso subescrever o método "final"
	@Override
	public void imprime() 
	{
		
	}
	*/
	
	/* Não posso subescrever um método "private
	@Override
	public mostra()
	{
		
	}
	*/
	
	//subescrevo o método com visibilidade igual
	@Override
	protected void olha()
	{
		
	}
	
	//subescrevo o método com visibilidade menos restritiva
	@Override
	public void veja()
	{
		
	}
	
	/* Não posso subescrever o método com visibilidade mais restritiva
	@Override
	private void espia()
	{
		
	}
	*/
	
	@Override
	public Pessoa exibir()
	{
		return new Aluno(); // é valido por ser uma subclasse de Pessoa
	}
}
