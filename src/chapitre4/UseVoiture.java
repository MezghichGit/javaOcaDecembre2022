package chapitre4;

public class UseVoiture {

	public static void main(String[] args) {
		
		Voiture v2 = new Voiture("BMW","Z3",'N',30000,false);
		System.out.println(v2.getMarque());
		Voiture v1 = new Voiture();
		//v1.prix = -20_000;
		v1.setPrix(-20000);
		System.out.println(v1.getPrix());

	}

}
