package aula14;

public class Aula 
{
	private PlayerVideo video;
	
	void videos()
	{
		video = new WMV();
		video.play();
		video.pause();
		video.volume(5);
		video.taxaDeBits();
		video.taxaDeQuadros();
		video.stop();
		video.nomeArquivo("video_aula.wmv");
		
		System.out.println();
		
		video = new RMV();
		video.play();
		video.pause();
		video.volume(7);
		video.taxaDeBits();
		video.taxaDeQuadros();
		video.stop();
		video.nomeArquivo("video_aula.rmv");
	}
	
	public static void main(String[] args) 
	{
		new Aula().videos();
		
		MP3 mp3 = new MP3();
		mp3.play();
		mp3.pause();
		mp3.volume(5);
		mp3.taxaDeBits();
		mp3.stop();
		
		System.out.println();
		
		AVI avi = new AVI();
		avi.play();
		avi.pause();
		avi.volume(8);
		avi.taxaDeBits();
		avi.taxaDeQuadros();
		avi.stop();
	}
}
