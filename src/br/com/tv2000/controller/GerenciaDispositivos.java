package br.com.tv2000.controller;

import br.com.tv2000.service.ControleRemoto;

public class GerenciaDispositivos {
    ControleRemoto[] cr = new ControleRemoto[5];

    public void adiciona(ControleRemoto cr) {
	for (int i = 0; i < this.cr.length; i++) {
	    if (this.cr[i] == null) {
		this.cr[i] = cr;
		break;
	    }
	}
    }

    public void imprimeDispositivos() {
	for (ControleRemoto c : cr) {
	    c.status();
	}
    }
}
