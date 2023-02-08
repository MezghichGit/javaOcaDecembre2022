package day6;

public class Etudiant {
	
	public Etudiant(String nom, double moy) {
		this.nom = nom;
		this.moy = moy;
	}
	public String nom;
	
	
	
	public double moy;
	
	public String toString() {
		return "Etudiant [nom=" + nom + ", moy=" + moy + "]";
	}

}
