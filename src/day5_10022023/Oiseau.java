package day5_10022023;

public class Oiseau extends Animal{
	String nom = "Carari";
	public Oiseau()
	{
		super();  //appel au constructeur par défaut de la classe mère
		//super(10);  // appel au constructeur de la classe mère acceptant int
		System.out.println("Oiseau");
	}
	
	public void info()
	{
		System.out.println("Nom Animal : "+super.nom);
		System.out.println("Nom Oiseau : "+this.nom);
	}
}
