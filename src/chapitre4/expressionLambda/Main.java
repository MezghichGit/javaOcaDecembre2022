package chapitre4.expressionLambda;

import java.io.FileNotFoundException;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args){
		
		Predicate<String>pred;
		Operations opSomme = (int a, int b)->{return a+b;};// expression verbose(complete)
		Operations opSomme2 =(a,b)->a+b; // expression réduite
				
		System.out.println(opSomme.calcul(10, 2));
		
		Operations opProduit = (int a, int b)->{return a*b;};
		System.out.println(opProduit.calcul(10, 2));

	}

}
