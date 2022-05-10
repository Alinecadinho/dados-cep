package facade;

import subsistema.crm.crmservice;
import subsistema2.cep.cepapi; 

public class facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = cepapi.getInstancia().recuperarCidade(cep);
		String estado = cepapi.getInstancia().recuperarEstado(cep);
		
		crmservice.gravarCliente(nome, cep, cidade, estado);
	}

}
