package chapitre4.expressionLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfExemple {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("amine");
		names.add("salah");
		names.add("rami");
		names.add("walid");
		names.add("samir");
		System.out.println(names);
		
		// Créer un prédicate pour supprimer via une lambda les noms contenant "s"
		Predicate<String> filter =  ch->ch.contains("s");  //Lambda
		
		names.removeIf(filter);
		
		/*
		for(String name : names)
		{
			if(name.contains("s"))
				names.remove(name);
		}*/
		
		System.out.println(names);

	}

}
