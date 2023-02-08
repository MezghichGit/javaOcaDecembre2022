package chapitre4.expressionLambda;

public abstract interface Telecommande {
	
	
	public static final int DureeMaxTelecommande = 10;
	// Avant Java 8
	
	 void augmenterVolume();
	
	abstract void diminuerVolume();
	
	
	abstract void changerChaine(int num);
	
	abstract void eteindreTv();
	
	public abstract void allumerTv();
	
	// A partir de la version 8, on peut déclarer des méthodes concrêtes via les mots clés : default ou static
	
	public default void changerSatellite() {
		System.out.println("....");
	}
	
	public static void InstallerChaine() {
		System.out.println("....");
	}
	
	// Version 9 , on peut avoir des méthodes private concrêtes
	
	private void info() {
		
		System.out.println("information TELECOMMANDE");
	}
	
	private static void info2() {}

}
