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

	/* N�o posso subescrever o m�todo "final"
	@Override
	public void imprime() 
	{
		
	}
	*/
	
	/* N�o posso subescrever um m�todo "private
	@Override
	public mostra()
	{
		
	}
	*/
	
	//subescrevo o m�todo com visibilidade igual
	@Override
	protected void olha()
	{
		
	}
	
	//subescrevo o m�todo com visibilidade menos restritiva
	@Override
	public void veja()
	{
		
	}
	
	/* N�o posso subescrever o m�todo com visibilidade mais restritiva
	@Override
	private void espia()
	{
		
	}
	*/
	
	@Override
	public Pessoa exibir()
	{
		return new Aluno(); // � valido por ser uma subclasse de Pessoa
	}
}
