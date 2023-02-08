package day5_08012023;

public class Main {

	public static void main(String[] args) {
		String ch = "Mohamed amine MEZGHICH";
		
		// Ing. Mohamed Amine MEZGHICH
		/*
		ch = ch.replace("ami", "Ami");
		System.out.println(ch);
		ch = "Ing. ".concat(ch);
		ch = ch.concat("-Formateur");
		System.out.println(ch);*/
		
		StringBuilder sb = new StringBuilder(ch);
		System.out.println(sb);
		sb.append("-Formateur");
		sb.replace(8,9,"A");
		sb.insert(0, "Ing. ");
		System.out.println(sb);
		ch = sb.toString();

	}

}
