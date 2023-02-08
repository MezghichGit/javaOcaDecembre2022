package chapitre4.expressionLambda;

public class App {

	public static void main(String[] args) {
		
		//Prediction p1 = (String ch)->{return ch.isEmpty();}; // expression verbose
		
		Prediction p1 = ch-> ch.isEmpty();  // expression lambda réduite
		
		
		Prediction p2 = (String ch)->{return ch.contains("oca");};
		
		Prediction p3 = (String ch)->{return ch.startsWith("oc");};
		
		
		String mot = "pcaoca";
		
		System.out.println(p1.test(mot));
		System.out.println(p2.test(mot));
		System.out.println(p3.test(mot));

	}

}
