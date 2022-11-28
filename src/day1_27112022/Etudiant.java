package day1_27112022;

public class Etudiant {
	
	//les attributs(les caractéristiques) d'instance
	String nom;
	int age;
	double moy;
	
	//Attribut de classe
	static int nbr=0;
	
	// les méthodes(les actions que peut faire un étudiant)
	
	public void info()
	{
		//this.nom = nom;
		System.out.println("Nom : " +this.nom+" Age : "+this.age+" Moy : "+this.moy);
	}
	
	public static void affichage() // méthode de classe
	{
		System.out.println(nbr);
	}
	
	//Un ou plusieurs constructeurs
	
	public Etudiant() {  //constructeur par défaut
		System.out.println("Création etudiant");
		nbr++;
	}
	
	public Etudiant(String nom) {  //constructeur avec paramètre
		this.nom = nom;
		nbr++;
	}
	
	public Etudiant(String nom, int age, double moy) {  //constructeur avec 3 paramètres
		this.nom = nom;
		this.age = age;
		this.moy = moy;
		nbr++;
	}

}
