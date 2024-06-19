package estabelecimento;

import equipamento.multifuncional.IPhone;

public class Fabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPhone iphone = new IPhone();
		
		iphone.atender();
		iphone.atualizarPagina();
		iphone.tocar();
		
	}

}
