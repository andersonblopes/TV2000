package br.com.tv2000.modelo;

public class TV {
    private String marca;
    private int polegadas;
    private int canal;
    private int volume;
    private boolean ligado;

    public TV() {

    }

    public TV(String marca, int polegadas) {
	this.marca = marca;
	this.polegadas = polegadas;
    }

    public String getMarca() {
	return marca;
    }

    public void setMarca(String marca) {
	this.marca = marca;
    }

    public int getPolegada() {
	return polegadas;
    }

    public void setPolegadas(int polegadas) {
	this.polegadas = polegadas;
    }

    public int getCanal() {
	return canal;
    }

    public void setCanal(int canal) {
	this.canal = canal;
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

    public void setLigado(boolean ligado) {
	this.ligado = ligado;
    }

}
