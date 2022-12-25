package day2;

public class Etudiant {
	
	// attributs d'instance
	public String nom; // visibilité dans tout le projet
	 int age; //defaut = visibilté dans la classe et dans le package
	
	 // private :  visible uniquement dans la classe
	// attribut de classe
	static int MaxAgeEtudiant;
	
	//Constructeur avec paramèteres
	public Etudiant(String nom, int age) {
		this.nom = nom;
		this.age = age;
		
	}
	
	public Etudiant() {  // constructeur par défaut explicite	
	System.out.println("Constructeur");
	}
	
	// bloc d'initialisation d'instance

	{
		System.out.println("OCA 8 v2");
	}
	
	{
		System.out.println("OCA 8");
	}
	
	
	static  // bloc d'initialisation de classe
	{
		System.out.println("OCP 11");
	}


}
