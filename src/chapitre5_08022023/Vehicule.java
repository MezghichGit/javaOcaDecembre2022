package chapitre5_08022023;

public abstract interface Vehicule {
	
	// Dans une interface, on peut avoir des attributs : public static final
	
	public static final int VitesseMax = 300; // equivalent : int vitesseMax = 300
	
	// Avant Java 8, doit avoir des méthodes uniquement abstraites
	// Le mot abstract est optionnel
	
	
	public abstract void demarrer();  //service
	
	public void tourner();  //service
	
	// Avec la version 8, on peut déclarer des méthodes concrêtes soit avec "default" ou "static"
	
	public default void info()
	{
		System.out.println("Vitesse max est 300 KM/H");
	}
	
	public static void affichage()
	{
		System.out.println("info vehicule");
		info2();
	}
	
	
	public static void affichage2()
	{
		System.out.println("info vehicule");
		info2();
	}
	 
	 // A partir de la version 9
	 
	 private void info1() {
		 //...
	 }
	 
	 private static void info2() {
		 //...
	 }


}
