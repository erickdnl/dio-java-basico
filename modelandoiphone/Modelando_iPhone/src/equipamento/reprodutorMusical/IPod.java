package equipamento.reprodutorMusical;

public class IPod implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA VIA IPOD");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA VIA IPOD");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MUSICA '" + musica+ "' VIA IPOD");
		
	}

}
