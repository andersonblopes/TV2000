package br.com.tv2000.service;

public interface ControleRemoto {
    public void volume(int volume);

    public void mudarCanal(int canal);

    public void ligar();

    public void desligar();

    public void status();
}
