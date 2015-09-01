public class TestaTVs {

	public static void main(String[] args) {
		ModeloSmartTVLG lgSmartTV = new ModeloSmartTVLG();
		ModeloSamsungTV samsungTV = new ModeloSamsungTV();
		AppleTV ap = new AppleTV();
		
		//Exibe o status do dispositivo
		lgSmartTV.status();
		samsungTV.status();
		
		//Executa operação básica no dispositivo
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
