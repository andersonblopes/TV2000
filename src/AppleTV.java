public class AppleTV implements ControleRemoto {
	private int canal;
	private int volume;
	private boolean ligado;

	@Override
	public void volume(int volume) {
		setVolume(volume);
	}

	@Override
	public void mudarCanal(int canal) {
		setCanal(canal);
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	@Override
	public void ligar() {
		setLigado(true);
	}

	@Override
	public void desligar() {
		setLigado(false);
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	@Override
	public void status() {
		String msg = "AppleTV DESLIGADO";
		if (isLigado()) {
			msg = "AppleTV LIGADO";
			System.out.println(msg);
		}
		System.out.println(msg);
	}

}
