package chapitre4.expressionLambda;

@FunctionalInterface
public interface Vehicule {
	
	public abstract int demarrer(int a);  // m�thode abstraite
	
	public default void info() {
		
	}
	
	public static void info(int x) {
		
	}

}
