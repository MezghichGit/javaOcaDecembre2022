package chapitre4.VarArgs_Surcharge;

public class Calcul {
/*
	public static int somme(int a, int b)
	{
	  return a+b;
		
	}
	
	public static int somme(int a, int b, int c)
	{
	  return a+b+c;
		
	}
	
	public static int somme(int a, int b, int c, int d)
	{
	  return a+b+c+d;
		
	}*/
	
	public static int somme(String x,int ... tab) // varargs  : variable number of arguments
	{
		int s = 0;
		for(int v : tab)
		{
			s = s + v;
		}
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(somme("a"));
		System.out.println(somme("a",10));
		System.out.println(somme("a",2,4));
		System.out.println(somme("a",2,4,5));

	}

}
