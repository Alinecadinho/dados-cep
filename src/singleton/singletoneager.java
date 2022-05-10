package singleton;

/**
 * singleton "apressado".
 * 
 * @author AlineCadinho
 *
 */

public class singletoneager {

		private static singletoneager instancia = new singletoneager();
		
		private singletoneager() {
			super();
		}
		
		public static singletoneager getInstancia() {			
			return instancia;
		}
		
	}		
