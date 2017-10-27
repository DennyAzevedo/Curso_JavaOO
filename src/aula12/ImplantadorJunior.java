package aula12;

public class ImplantadorJunior extends Implatador 
{

	@Override
	public double calculaSalario() 
	{
		return (getSalario() * 0.15) + getSalario();
	}

}
