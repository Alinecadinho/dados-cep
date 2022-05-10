package one;

import facade.facade;
import singleton.singletoneager;
import singleton.singletonlazy;
import singleton.singletonlazyholder;
import one.strategy.comportamento;
import one.strategy.comportamentoagressivo;
import one.strategy.comportamentodefensivo;
import one.strategy.comportamentonormal;
import one.strategy.robo;

public class Teste {

	public static void main(String[] args) {
		
		// Singleton
		
				singletonlazy lazy = singletonlazy.getInstancia();
				System.out.println(lazy);
				lazy = singletonlazy.getInstancia();
				System.out.println(lazy);
				
				singletoneager eager = singletoneager.getInstancia();
				System.out.println(eager);
				eager = singletoneager.getInstancia();
				System.out.println(eager);
				
				singletonlazyholder lazyholder = singletonlazyholder.getinstancia();
				System.out.println(lazyholder);
				lazyholder = singletonlazyholder.getinstancia();
				System.out.println(lazyholder);
		
				// Strategy
				
				comportamento defensivo = new comportamentodefensivo();
				comportamento normal = new comportamentonormal();
				comportamento agressivo = new comportamentoagressivo();
				
				robo robo = new robo();
				robo.setComportamento(normal);
				robo.mover();
				robo.mover();
				robo.setComportamento(defensivo);
				robo.mover();
				robo.setComportamento(agressivo);
				robo.mover();
				robo.mover();
				robo.mover();
				
				// Facade
				
				facade facade = new facade();
				facade.migrarCliente("Aline Cadinho", "23165768854");

	}

}
