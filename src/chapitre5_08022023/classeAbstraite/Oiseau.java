package chapitre5_08022023.classeAbstraite;

public class Oiseau extends Animal {
	
	@Override
	public void seDeplacer() {
		System.out.println("Je vol");
	}
	
	@Override
	public void maxAge() {
		System.out.println("12");
	}

}
