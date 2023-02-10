package day5_10022023;

public class App {

	public static void main(String[] args) {
		/*Etudiant e =  new Etudiant("Amine");
		System.out.println("*************");
		Etudiant e2 =  new Etudiant(20);*/
		
		Etudiant e = new Etudiant("Amine",20,"amine@gmail.com");
		System.out.println(e.nom);
		System.out.println(e.age);
		System.out.println(e.email);

	}

}
