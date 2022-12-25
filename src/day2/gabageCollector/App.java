package day2.gabageCollector;

public class App {

	public static void main(String[] args) {
		
		Oiseau o1 = new Oiseau();	
		Oiseau o2 = new Oiseau();
		o1 = o2;  // l'objet précedement pointé par o1 sera perdu
		o1 = null;
		o2 = null;
		//System.gc();  //il faut jamais dans le code faire un System.gc();
		for(int i=0; i<100; i++)
		{
			System.out.println("i = "+i);
		}
		
		System.out.println("Fin du programme...");

	}

}
