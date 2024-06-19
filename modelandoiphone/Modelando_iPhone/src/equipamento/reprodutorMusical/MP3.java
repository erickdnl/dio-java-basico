package equipamento.reprodutorMusical;

public class MP3 implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA VIA MP3");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA VIA MP3");		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MUSICA '" + musica+ "' VIA MP3");
		
	}

}
