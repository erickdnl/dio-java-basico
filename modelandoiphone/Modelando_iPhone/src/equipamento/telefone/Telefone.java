package equipamento.telefone;


public class Telefone implements AparelhoTelefonico {

	@Override
	public void ligar() {
		System.out.println("LIGANDO VIA TELEFONE");
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO VIA TELEFONE");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ VIA TELEFONE");
		
	}

}
