package day5_10022023_Overriding;

import java.io.IOException;

public class Animal extends Object{
	
	Number x;
	Integer y;
	Double z;
	public Animal()
	{
		super();
	}
	
	protected Animal info() throws Exception
	//protected Animal info() throws NullPointerException
	{
		System.out.println("Animal");
		return new Animal();
	}
	
	protected Animal info(int age) 
	//protected Animal info() throws NullPointerException
	{
		System.out.println("Animal");
		return new Animal();
	}
	
	public static void affichage() {}

}
