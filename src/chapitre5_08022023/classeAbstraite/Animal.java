package chapitre5_08022023.classeAbstraite;

public abstract class Animal {
	String name;
	int age;
	
	public void manger() {
		System.out.println("Je mange");
	}
	
	public void dormir() {
		System.out.println("Je dors");
	}
	
	public void maxAge() {
		System.out.println("200");
	}
	
	public abstract void seDeplacer();
	
}
