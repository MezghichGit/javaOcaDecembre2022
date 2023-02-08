package chapitre5_08022023;

public class Voiture implements Vehicule{

	@Override
	public void demarrer() {
		System.out.println("Tourner la clé");
		
	}

	@Override
	public void tourner() {
		System.out.println("Tourner la Volant");
		
	}
	
	public static void affichage()
	{
		System.out.println("info voiture");
	}

}
