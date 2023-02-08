package day5_08012023;

public class App {

	public static void main(String[] args) {
		int x =10;
		double moy = 16.5;
		Etudiant e = new Etudiant();
		
		/*
		String ch1 = "oca";
		String ch2 = new String("oca");
		String ch3 = "oca";
		String ch4 = new String("oca");
		System.out.println(ch1 == ch2); // false
		System.out.println(ch1 == ch3); // true
		
		System.out.println(ch1.equals(ch2));  //true
		System.out.println(ch1.equals(ch3));  //true*/
		
		String ch = "oca";
		//String ch2 = "oca";
	   // System.out.println(ch.concat("-ocp"));
	    ch = ch.concat("ocp");
		//ch.concat("ocp");
	    System.out.println(ch);
	    
	    StringBuilder sb = new StringBuilder("oca");
	    sb.append("-ocp");
	    System.out.println(sb);

	}

}
