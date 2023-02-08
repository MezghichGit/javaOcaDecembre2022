package day6;

public class Op implements OperationBancaire {

	@Override
	public void debiter() {
		System.out.println("Vous avez debiter");
		
	}

	@Override
	public void crediter() {
		System.out.println("Vous avez crediter");
		
	}
	
	public void infoCompte()
	{
		System.out.println("Vous compte est en ...");
	}

}
