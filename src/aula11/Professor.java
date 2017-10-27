package aula11;

public class Professor extends Pessoa 
{
	@Override
	public void setMatricula(String matricula)
	{
		if(matricula.length() == 8)
		{
			super.setMatricula(matricula);
		}
		else
		{
			super.setMatricula("MATRICULA INVALIDA");
		}
	}
}
