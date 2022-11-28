package day1_27112022;

public class Etudiant {
	
	//les attributs(les caract�ristiques) d'instance
	String nom;
	int age;
	double moy;
	
	//Attribut de classe
	static int nbr=0;
	
	// les m�thodes(les actions que peut faire un �tudiant)
	
	public void info()
	{
		//this.nom = nom;
		System.out.println("Nom : " +this.nom+" Age : "+this.age+" Moy : "+this.moy);
	}
	
	public static void affichage() // m�thode de classe
	{
		System.out.println(nbr);
	}
	
	//Un ou plusieurs constructeurs
	
	public Etudiant() {  //constructeur par d�faut
		System.out.println("Cr�ation etudiant");
		nbr++;
	}
	
	public Etudiant(String nom) {  //constructeur avec param�tre
		this.nom = nom;
		nbr++;
	}
	
	public Etudiant(String nom, int age, double moy) {  //constructeur avec 3 param�tres
		this.nom = nom;
		this.age = age;
		this.moy = moy;
		nbr++;
	}

}
