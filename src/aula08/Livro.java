package aula08;

public class Livro 
{
	String titulo;
	String autor;
	int paginas;
	boolean lancamento;
	
	public Livro()
	{
		super();
		System.out.println("Construtor Default");
	}
	
	public Livro(String titulo)
	{
		super(); //se não for colocado o compilador cria automatico
		this.titulo = titulo;
	}
	
	public Livro(int paginas)
	{
		this.paginas = paginas;
	}
	
	public Livro(String titulo, String autor, int paginas, boolean lancamento) 
	{
		//super();
		this();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.lancamento = lancamento;
		System.out.println("Constutor com 4 argumentos");
	}

	public String getTitulo()
	{
		return titulo;
	}
	
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	
	public String getAutor()
	{
		return autor;
	}
	
	public void setAutor(String autor)
	{
		this.autor = autor;
	}
	
	public int getPaginas()
	{
		return paginas;
	}
	
	public void setPaginas(int paginas)
	{
		this.paginas = paginas;
	}
	
	public boolean isLancamento()
	{
		return lancamento;
	}
	
	public void setLancamento(boolean lancamento)
	{
		this.lancamento = lancamento;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", lancamento=" + lancamento
				+ "]";
	}
	
	
}
