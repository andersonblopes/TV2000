package br.com.tv2000.view;

import br.com.tv2000.modelo.AppleTV;
import br.com.tv2000.modelo.SamsungTV;
import br.com.tv2000.modelo.SmartTVLG;

public class TestaTVs {

    public static void main(String[] args) {
	SmartTVLG lgSmartTV = new SmartTVLG();
	SamsungTV samsungTV = new SamsungTV();
	AppleTV ap = new AppleTV();

	// Exibe o status do dispositivo
	lgSmartTV.status();
	samsungTV.status();

	// Executa operação básica no dispositivo
	lgSmartTV.ligar();
	lgSmartTV.volume(40);
	lgSmartTV.mudarCanal(12);

	samsungTV.ligar();
	samsungTV.volume(30);
	samsungTV.mudarCanal(10);

	System.out.println("------------------------------");

	lgSmartTV.status();
	samsungTV.status();
	ap.status();

    }

}
