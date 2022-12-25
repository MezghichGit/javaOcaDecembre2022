package day4_25122022;

import java.util.ArrayList;

public class App {

	enum Mois {
		JANVIER, FEVRIER, MARS
	};

	public static void main(String[] args) {

		final int a = 10; // final = constante
		// a = 11;
		/*
		 * int age = 12;
		 * 
		 * if(age>10) { System.out.println("Age > 10");
		 * System.out.println("Vous êtes encore jeune"); } else
		 * System.out.println("Age <= 10 ");
		 */

		/*
		 * int jour = 4; switch (jour) { case 1: System.out.println("Dimanche"); break;
		 * 
		 * case 2: System.out.println("Lundi"); break; case 3:
		 * System.out.println("Mardi"); break; default:
		 * System.out.println("Autre valeur que 1, 2 et 3");
		 * 
		 * }
		 */

		/*
		 * String jour = "lundi"; switch (jour) { case "lundi":
		 * System.out.println("LUNDI"); break;
		 * 
		 * case "mardi": System.out.println("MARDI"); break; case "mercredi":
		 * System.out.println("MERCREDI"); break; default:
		 * System.out.println("Autre jour");
		 * 
		 * }
		 */
		/*
		 * Mois mois = Mois.FEVRIER; switch (mois) { case JANVIER : case FEVRIER:
		 * System.out.println("Hiver"); break;
		 * 
		 * case FEVRIER: System.out.println("Hiver"); break; case MARS:
		 * System.out.println("Printemps"); break; default:
		 * System.out.println("Autre jour");
		 * 
		 * }
		 */
		/*
		 * int jour = 4; final int x = 2; //x++; switch (jour) { case 1:
		 * System.out.println("Dimanche"); break;
		 * 
		 * case x: System.out.println("Lundi"); break; case 3:
		 * System.out.println("Mardi"); break; default:
		 * System.out.println("Autre valeur que 1, 2 et 3");
		 * 
		 * }
		 */

		// int x = 10; // type primitif
		// Integer X = 10; // type reference

		// ArrayList <Integer>list;
		// System.out.println("Fin du programme");

		String[] names = { "amine", "ali", "sami", "salah" };
		// classic loop
		/*
		 * for(int i=0; i<names.length;i++) { System.out.println(names[i]); }
		 */

		// enhanced loop : Utilisable sur les collections

		/*
		 * for(String name : names) { System.out.println(name); }
		 */
/*
		int[][] tab = { { 10, 11, 12 }, { 1, 2 }, { 10, 47, 2, 96 } };

		// affichage avec classic loop
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j] + "\t");
			}

			System.out.println();
		}
		System.out.println("*********");
		// affichage avec enhanced loop
		for (int t[] : tab) {
			for (int e : t) {
				System.out.print(e + " \t");
			}
			System.out.println();
		}*/
		
		int x = -1;
		/*while(x>=0)
		{
			System.out.println("x = "+x);
			x--;
		}*/
		do
		{
			System.out.println("x = "+x);
			x--;
		}while(x>=0);

	}

}
