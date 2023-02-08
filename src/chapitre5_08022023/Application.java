package chapitre5_08022023;

public class Application {

	public static void main(String[] args) {
		Oiseau o = new Oiseau();
		
		System.out.println(o.nom);
		System.out.println(o.age);
		
		Voiture v =  new Voiture();
		v.info();  // méthode héritée de l'interface
		//v.affichage();
		Voiture.affichage();
		Vehicule.affichage();

	}

}
