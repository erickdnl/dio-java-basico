package equipamento.multifuncional;

import equipamento.reprodutorMusical.ReprodutorMusical;
import equipamento.telefone.AparelhoTelefonico;
import navegador.NavegadorInternet;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PAGINA VIA IPHONE");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA VIA IPHONE");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA VIA IPHONE");
		
	}

	@Override
	public void ligar() {
		System.out.println("LIGANDO VIA IPHONE");
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO VIA IPHONE");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ VIA TELEFONE");
		
	}

	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA VIA IPHONE");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA VIA IPHONE");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MUSICA '" + musica+ "' VIA IPHONE");
		
	}

}
