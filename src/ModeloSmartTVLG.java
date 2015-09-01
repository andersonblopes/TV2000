public class ModeloSmartTVLG implements ControleRemoto {
	TV tv = new TV("LG", 40);

	@Override
	public void volume(int volume) {
		tv.setVolume(volume);

	}

	@Override
	public void mudarCanal(int canal) {
		tv.setCanal(canal);
	}

	@Override
	public void ligar() {
		tv.setLigado(true);
		System.out.println("Ligando sua TV LG........");

	}

	@Override
	public void desligar() {
		tv.setLigado(false);
		System.out.println("Xau e volte sempre.....");

	}

	@Override
	public void status() {
		String msg = "Sua TV está desligada";
		if (tv.isLigado()) {
			msg = "Sua TV está ligada!";
		}
		System.out.println(tv.getMarca() + "---" + msg);
		System.out.println("Canal: " + tv.getCanal());
		System.out.println("Volume: " + tv.getVolume());

	}
}
