package chapitre5_08022023;

public class Chien extends Animal implements Carnivor,Domestique{

	@Override
	public void faireCalin() {
		System.out.println("Hab Hab");
		
	}

	@Override
	public void mangerViand() {
		System.out.println("Je veux du poulet");
		
	}

}
