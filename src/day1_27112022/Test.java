package day1_27112022;

public class Test {

	public static void main(String[] args) {
		System.out.println(Etudiant.nbr);
		Etudiant e1 = new Etudiant(); //appel au constructeur par défaut
		System.out.println(Etudiant.nbr);
		e1.info();
		e1.nom="Amine";
		e1.age=20;
		e1.moy =18;
		e1.info();
		Etudiant e2 = new Etudiant("Salah");
		System.out.println(Etudiant.nbr);
		e2.info();
		
		Etudiant e3 = new Etudiant("Farid",24,17.5);
		e3.info();
		
		System.out.println(Etudiant.nbr);
		System.out.println(e1.nbr);
		System.out.println(e3.nbr);
		
		Etudiant.affichage();
	}

}
