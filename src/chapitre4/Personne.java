package chapitre4;

public class Personne {
	
	public String nom;  // accessible partout dans le projet
	int age;   // default : visible dans la classe et dans le package
	private String password; // visible uniquement dans la classe
	protected String email; // visible dans la classe, dans le package et chez le fils dans un autre package
	
	
	public void info() {
		System.out.println(this.password+" "+ this.age+" "+this.email +" "+this.nom);
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
