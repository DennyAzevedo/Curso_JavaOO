package aula12;

public class Analista extends Funcionario 
{

	@Override
	public double calculaSalario() 
	{
		return (getSalario() * 0.40) + getSalario();
	}

}
