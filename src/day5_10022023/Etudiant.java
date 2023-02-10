package day5_10022023;

public class Etudiant {
	
	String nom;
	String email;
	int age;
	
	public Etudiant(String email, String nom)
	{
		System.out.println("Cons. avec deux parms String");
	}
	
	
	public Etudiant()
	{
		this("amine@gmail.com","Amine");
		System.out.println("Cons. par défaut");
	}
	
	public Etudiant(String nom)
	{
		this(); // appel au constructeur par défaut de la même lcasse
		this.nom = nom;
		System.out.println("Cons. avec param nom");
	}
	
	public Etudiant(int age)
	{
		this("Ali"); // appel au constructeur avec paramètre String
		this.age = age;
		System.out.println("Cons. avec param age");
		
	}

	public Etudiant(String nom, int age) {
		this.nom = nom;
		this.age = age;
		System.out.println("Cons. avec params nom et age");
	}
	
	public Etudiant(String nom, int age, String email) {
		//this.nom = nom;
		//this.age = age;
		this(nom,age);
		this.email = email;
		System.out.println("Cons. avec  3 params nom, age et email");
	}
	
}
