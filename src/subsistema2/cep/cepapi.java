package subsistema2.cep;

public class cepapi {

	private static cepapi instancia = new cepapi();

	private cepapi() {
		super();
	}

	public static cepapi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Interlagos";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
