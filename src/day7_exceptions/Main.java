package day7_exceptions;

public class Main {
	
	
	public static void info1()   throws Exception //Checked exception
	{
		//System.out.println("Hello");
		throw new Exception("Checked exception...");
	}
	public static void info2()  throws RuntimeException  // Unchecked(runtime exception) exception
	{
		throw new NullPointerException();
	}
	public static void calcul() throws IllegalArgumentException,ArithmeticException, NullPointerException  // Une m�thode de classe
	{
		System.out.println("Hello World");
		//throw new ArithmeticException("Juste un test");
		System.out.println(10/0);
	}
	public static void main(String[] args) {  // We declare
		
		try {
		info1();  // le compilateur v�rifie la m�thode // we handle
		}
		catch(Exception e)
		{
			System.out.println("Merci de v�rifer la date de validation de votre carte");
		}
		info2();
		
		
		//Main.calcul();
		/*
		try {
		calcul();
		}
		catch(Exception e)
		{
			System.out.println("Message : "+e.getMessage());
			e.printStackTrace();
		}*/
		
		
		//Main m = new Main();
		//m.info();
		

	}

}
