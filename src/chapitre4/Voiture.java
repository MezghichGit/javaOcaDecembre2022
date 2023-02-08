package chapitre4;

public class Voiture {
	
	private String marque;
	private String modele;
	private char couleur;
	private double prix;
	
	public Voiture(String marque, String modele, char couleur, double prix, boolean estCitadine) {
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.prix = prix;
		this.estCitadine = estCitadine;
	}
	
	public Voiture() {
		
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public char getCouleur() {
		return couleur;
	}
	public void setCouleur(char couleur) {
		this.couleur = couleur;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		if(prix > 1000) {
		  this.prix = prix;
		}
		else
		{
			System.out.println("Le prix est invalide");
		}
	}
	public boolean isEstCitadine() {
		return estCitadine;
	}
	public void setEstCitadine(boolean estCitadine) {
		this.estCitadine = estCitadine;
	}
	private boolean estCitadine;

}
