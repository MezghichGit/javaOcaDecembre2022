package day5_10022023_Overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Oiseau extends Animal{
	/*
	@Override
    public Animal info()  // c'est une red�finition de la m�thode info de la classe m�re
	{
		System.out.println("Animal et Oiseau");
		
		return new Animal();
	}*/
	@Override
	public Oiseau info() throws IOException
	//public Oiseau info()  throws RuntimeException
	// c'est une red�finition de la m�thode info de la classe m�re
	{
		System.out.println("Animal et Oiseau");
		
		return new Oiseau();
	}
	
	public static void affichage() {}  // hidding
}
