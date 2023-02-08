package day5_08012023.lesTableaux;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// tableau unidimentionnel
		//int tab[]= {10,3,6};
		/*
		for(int e : tab)
		{
			System.out.println(e);
		}
		int tab2[] = new int[4];
		tab2[0] = 12;
		tab2[1] = 9;
		tab2[2] = 4;
		tab2[3] = 8;
		
		
		String noms[] = new String[2];
		noms[0]="Ali";
		noms[1]="salah";
		
		String names[] = {"sarra","salim","achraf"};
		for(int i = 0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
		
		for(String name : names)
			System.out.println(name);*/
		/*
		int tab[]= {10,3,6,14,4};
		for(int e : tab)
		{
			System.out.print(e+"\t");
		}
		Arrays.sort(tab);
		System.out.println();
		for(int e : tab)
		{
			System.out.print(e+"\t");
		}*/
		
		//Tableaux multi-dimensions
		
		int [][]tab = {{1,2,6},{10,4},{145,8,9,2}};
		System.out.println(tab[1][1]);
		System.out.println(tab[2][3]);
		
		int[]tab2[] = new int[4][] ;
		tab2[0]=new int[8];
		tab2[1]=new int[5];
		tab2[2]=new int[3];
		tab2[3]=new int[2];

	}

}
