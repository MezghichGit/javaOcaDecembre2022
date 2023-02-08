package day7_exceptions;

public class App {

	public static void main(String[] args) {
		
		//Exemple 1 : NullPointerException
		//String formation = "OCA";
		/*
		String formation = null;
		try {
		System.out.println(formation.length()); //NullPointerException
		}
		catch(NullPointerException ex)
		{
			System.out.println("Problème : " +ex.getMessage());
			//System.out.println("Pointeur sur null...");
		}*/
		
		//Exemple 2 : ArithmeticException
		
		int x = 10;
		int y = 2;
		//int y = 0;
		try {
			
		    System.out.println(x/y);
		    Object ch = "OCA";
		    Integer i = (Integer)ch;
		    
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println("Division par zéro : " + ex.getMessage());
			//ex.printStackTrace();
			//return; //sortie immediate de la méthode
		}
		
		catch(Exception ex)
		{
		  System.out.println("Problème : "+ex.getMessage());
		  ex.printStackTrace();
		}
		
		
		
		
		//Exemple 3 : ArrayIndexOutOfBoundsException
		/*
		int tab[] = {10,20};
		try {
		    //System.out.println(tab[2]); //Problème : indice 2 introuvable
			 System.out.println(tab[0]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
		  System.out.println("Problème de division par zéro...");	
		}
		*/
		/*finally {
		  System.out.println("Suite du programme...");  // release ressource(libération des ressources)
		//ressource.close();
		}*/

	}

}
