public class testa2 {

	public static void main(String[] args) {
		GerenciaDispositivos gtv = new GerenciaDispositivos();

		ControleRemoto cr1 = new ModeloSamsungTV();
		ControleRemoto cr2 = new ModeloSmartTVLG();
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
