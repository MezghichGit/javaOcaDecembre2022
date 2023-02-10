package day5_10022023_Overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Oiseau extends Animal{
	/*
	@Override
    public Animal info()  // c'est une redéfinition de la méthode info de la classe mère
	{
		System.out.println("Animal et Oiseau");
		
		return new Animal();
	}*/
	@Override
	public Oiseau info() throws IOException
	//public Oiseau info()  throws RuntimeException
	// c'est une redéfinition de la méthode info de la classe mère
	{
		System.out.println("Animal et Oiseau");
		
		return new Oiseau();
	}
	
	public static void affichage() {}  // hidding
}
