package equipamento.multifuncional;

import equipamento.reprodutorMusical.ReprodutorMusical;
import equipamento.telefone.AparelhoTelefonico;
import navegador.NavegadorInternet;

public class ComputadorPessoal implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	
	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PAGINA VIA COMPUTADOR PESSOAL");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA VIA COMPUTADOR PESSOAL");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA VIA COMPUTADOR PESSOAL");
		
	}

	@Override
	public void ligar() {
		System.out.println("LIGANDO VIA COMPUTADOR PESSOAL");
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO VIA COMPUTADOR PESSOAL");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ VIA COMPUTADOR PESSOAL");
		
	}

	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA VIA COMPUTADOR PESSOAL");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA VIA COMPUTADOR PESSOAL");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MUSICA '" + musica+ "' VIA COMPUTADOR PESSOAL");
		
	}
	
}
