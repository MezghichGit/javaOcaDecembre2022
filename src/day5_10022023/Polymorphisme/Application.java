package day5_10022023.Polymorphisme;

public class Application {

	
	public static void affichage(Animal a)
	{
		// traitement sur Animal
	}
	
	
	public static void main(String[] args) {
		
		Animal animals[] = new Animal[2];
		animals[0] = new Poisson();
		animals[1] = new Oiseau();
		
		affichage(new Poisson());  //Upcasting
		affichage(new Oiseau());
		affichage(new Animal());
		
		
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		
		 //a = o;
		a = new Oiseau();  //Upcasting
		
		o = (Oiseau)a;  //DownCasting
		
		
		System.out.println("Fin du programme");
	}

}
