package chapitre4;

public class Application {
	
	//public : modificateur de visibilité
	//static : optionnal specifier
	//void : return type
	//somme : methode name...
	
	public static void somme(int a, int b)  // Méthode de classe
	{
		System.out.println("La somme = "+(a+b));
	}
	
	public void produit(int a, int b)  // Méthode d'instance
	{
		System.out.println("Le produit = "+(a*b));
	}
	
	public  void division(int a, int b) throws ArithmeticException,IllegalArgumentException  // Méthode d'instance
	{
		System.out.println("Le quotient = "+(a/b));
	}


	final public static void main(String[] args) {
		//Application.somme(10,20);
		somme(10,20);
		Application app = new Application();
		app.produit(10, 20);

	}

}
