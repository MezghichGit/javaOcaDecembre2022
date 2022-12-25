package day2;
import java.util.ArrayList;

public class App {

	static void somme(int ...v)
	{}
	public final static void main(String ... args) {
		Animal a;
		somme();
		somme(10,2);
		somme(10,4,8,60,4);
		
		String Public ="abc";
		Etudiant e1 = new Etudiant(); //appel au constructeur par défaut.
		Etudiant e2 = new Etudiant();
		
		/*e1.age = 30;
		System.out.println(e1.nom);  //null
		System.out.println(e1.age);  //0
		System.out.println(Etudiant.MaxAgeEtudiant);*/
		
		double moy2; 
		//System.out.println(moy2); //impossible
		/*e1.nom="Amine";
		e1.age = 22;
		
		e2.nom="Aymen";
		e2.age = 25;*/
		
		Etudiant.MaxAgeEtudiant = 32;
		
		
		//e1 = null;
		int x1 = 20;
		
		String nom = "Amine";
		x1 = nom.length();
		//x = null;
		/*
		String formation = "OCA";
		// x et y : sont des variables de types primitifs
		byte x = 10; //local variable
		short y = 20;
		// Etudiant : type reference
		Etudiant e1 = new Etudiant();
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);*/
		
		
		
		System.out.println(Long.MAX_VALUE);
		//9223372036854775807
	    int v = 1_0_00_00_0;
	    double y = 140.5;
	    
		long x = 9223372036851L;
		
		float moy = 12.5F;
		
		
		ArrayList<Integer>notes;
		
		int _x=10;
		int $x= 10;
		

	}

}
