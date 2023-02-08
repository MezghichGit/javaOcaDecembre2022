package chapitre4.expressionLambda;

public class Test {

	public static void main(String[] args) {
	Vehicule v = new Voiture();
	System.out.println(v.demarrer(10));
	
	Vehicule v2 = (int x)->{return x + 10;};
	
	System.out.println(v2.demarrer(10));
	}

}
