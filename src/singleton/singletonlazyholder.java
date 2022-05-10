package singleton;

/**
 * singleton "Lazy Holder".
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author AlineCadinho
 *
 */

public class singletonlazyholder {
	
	private static class InstanceHolder {
		public static singletonlazyholder instancia = new singletonlazyholder();
	}
	
	private singletonlazyholder() {
		super();
	}
	
	public static singletonlazyholder getinstancia() {
		return InstanceHolder.instancia;
	}
}
