public class ModeloSamsungTV implements ControleRemoto {
	TV tv = new TV("Samsung",62);

	public ModeloSamsungTV() {
	}

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
	}

	@Override
	public void desligar() {
		tv.setLigado(false);
	}

	@Override
	public void status() {
		String msg = "OFFLINE";
		if (tv.isLigado()) {
			msg = "TVIN";
		}
		System.out.println(tv.getMarca() + "---" + msg);
	}

}
