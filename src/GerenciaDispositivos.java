public class GerenciaDispositivos {
	ControleRemoto[] cr = new ControleRemoto[5];

	void adiciona(ControleRemoto cr) {
		for (int i = 0; i < this.cr.length; i++) {
			if (this.cr[i] == null) {
				this.cr[i] = cr;
				break;
			}
		}
	}

	void imprimeDispositivos() {
		for (ControleRemoto c : cr) {
			c.status();
		}
	}
}
