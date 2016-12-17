package br.com.tv2000.view;

import br.com.tv2000.controller.GerenciaDispositivos;
import br.com.tv2000.modelo.AppleTV;
import br.com.tv2000.modelo.Blueray;
import br.com.tv2000.modelo.CCEHome;
import br.com.tv2000.modelo.SamsungTV;
import br.com.tv2000.modelo.SmartTVLG;
import br.com.tv2000.service.ControleRemoto;

public class testa2 {

    public static void main(String[] args) {
	GerenciaDispositivos gtv = new GerenciaDispositivos();

	ControleRemoto cr1 = new SamsungTV();
	ControleRemoto cr2 = new SmartTVLG();
	ControleRemoto cr3 = new AppleTV();
	ControleRemoto cr4 = new CCEHome();
	ControleRemoto cr5 = new Blueray();

	gtv.adiciona(cr1);
	gtv.adiciona(cr2);
	gtv.adiciona(cr3);
	gtv.adiciona(cr4);
	gtv.adiciona(cr5);

	gtv.imprimeDispositivos();
    }

}
