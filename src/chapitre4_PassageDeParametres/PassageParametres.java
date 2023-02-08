package chapitre4_PassageDeParametres;

public class PassageParametres {

	public static void permut(int x, int y)
	{
		int aux = x;
		x = y;
		y = aux;
	}
	
	public static void modifStringBuilder(StringBuilder sb) // sb va prendre une copie de l'adresse de formation
	{
		sb.append("-OCP");
	}
	
	public static void modifString(String s) {
		//s.concat("-OCP");  // s immutable
		s = s.concat("-OCP");
	}
	
	public static void main(String[] args) {
		
		
		String formation = new String("OCA");
		System.out.println(formation);
		modifString(formation); // formation c'est un type reference
		System.out.println(formation);
		
		
		/*
		StringBuilder formation = new StringBuilder("OCA");
		System.out.println(formation);
		modifStringBuilder(formation); // formation c'est un type reference
		System.out.println(formation);*/
		
		/*
		int a = 10;
		int b = 20;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		permut(a,b);
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);*/

	}

}
