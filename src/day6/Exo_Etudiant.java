package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exo_Etudiant {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant("Sami",16.5);
		Etudiant e2 = new Etudiant("rami",17.85);
		Etudiant e3 = new Etudiant("amine",16.85);
		//System.out.println(e1);
		//System.out.println(e1.toString());
		//System.out.println(e2);
		/*
		List<Etudiant> le = new ArrayList<>();
		
		System.out.println(le);
		le.add(e1);
		le.add(e2);
		le.add(e3);
		System.out.println(le);
		
		for(Etudiant e : le)	
		{
			System.out.println(e);
		}*/
		
		List<String> names = new ArrayList<>();
		names.add("rami");
		names.add("sami");
		names.add("amine");
		names.add("ali");
		System.out.println(names);
		
		Collections.sort(names);
		int index = Collections.binarySearch(names, "amine");
		
		System.out.println(names);
		System.out.println(index);
		
		// Page d'un tableau vers une classe et vise versa
		
		String [] tab = new String[2];
		tab[0] ="oca";
		tab[1] ="ocp";
		//tab[0]="spring";
		
		// passage de tableau vers list
		List<String>ls = Arrays.asList(tab);
		System.out.println(ls);
		//ls.add("ocp 11");  // Exception
		ls.set(0, "oca 8");
		System.out.println(tab[0]);
		System.out.println(ls.get(0));
		
		// passage de list vers tableau
		
		List<String> formations = new ArrayList<>();
		formations.add("oca");
		formations.add("fullstack");
		formations.add("ocp");
		
		Object[]tab2 = formations.toArray();
		
		for(Object o : tab2)
		{
			System.out.print(o +"\t");
		}
		
		
		
	}

}
