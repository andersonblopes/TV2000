package br.com.tv2000.modelo;

import br.com.tv2000.service.ControleRemoto;

public class CCEHome implements ControleRemoto {

    @Override
    public void volume(int volume) {
	// TODO Auto-generated method stub

    }

    @Override
    public void mudarCanal(int canal) {
	// TODO Auto-generated method stub

    }

    @Override
    public void ligar() {
	// TODO Auto-generated method stub

    }

    @Override
    public void desligar() {
	// TODO Auto-generated method stub

    }

    @Override
    public void status() {
	System.out.println("CCE HOME ESTÁ LIGADO");

    }

}
