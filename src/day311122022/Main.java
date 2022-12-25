package day311122022;

public class Main {

	public static void main(String[] args) {
		/*
		int x = 10;
		//int y = x++;
		int y = ++x;
		System.out.println("x = "+x); 
		System.out.println("y = "+y);*/
		/*
		int a = 4;
		//int b = --a;
		int b = a--;
		System.out.println("a = "+a); 
		System.out.println("b = "+b);*/
		
		//Opérateurs binaires logiques
		/*
		int a = 100;
		int b = 200;
		//boolean res = (a<10) && (++b<20);  // AND = & ou &&
		//boolean res = (a<10) & (++b<20);  // AND = & ou &&
		
		boolean res = (a>10) || (++b<20);
		//boolean res = (a>10) | (++b<20); 
		System.out.println("res = "+res);
		System.out.println("b = "+b);*/
		
		//3-opérateur ternaire
		int a = 100;
		int b = 200;
		
		String val = (a>b)?"Ok":"KO";
		
		int res = (a<10)?(b>20)?4:10:9;
		System.out.println("res = "+res);
		
		/*if(a>b)
			val = 1;
		else val = -1;*/
		//System.out.println(val);
		
		System.out.println((a>10)?true:"Ok");
		
		System.out.println("Ok");
		System.out.println(12.5);
		System.out.println(true);

	}

}
