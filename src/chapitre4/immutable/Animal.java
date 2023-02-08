package chapitre4.immutable;

import java.util.ArrayList;


// règles de l'immutable
//1)rendre la classe encapsulated(attributs private + seulement les getters)
//2)Ajouter final au niveau de la classe et des attributs
//3)Enlever les setters
//4)si on a un attribut de type réference qui est mutable tel que StringBuilder ou ArrayList, utiliser des copies au niveau du constructeur et get()
public final class Animal {
	
	public final void info() {}
	final private int age;
	public Animal(int age, String nom, ArrayList<String> foods) {
		this.age = age;
		this.nom = nom;
		this.foods = new ArrayList(foods);
	}
	
	final private String nom;
	final private ArrayList<String>foods;
	
	public int getAge() {
		return age;
	}
	/*public void setAge(int age) {
		this.age = age;
	}*/
	public String getNom() {
		return nom;
	}
	/*public void setNom(String nom) {
		this.nom = nom;
	}*/
	public ArrayList<String> getFoods() {
		return new ArrayList(foods);  // il faut renvoyer une copie
	}
	/*public void setFoods(ArrayList<String> foods) {
		this.foods = foods;
	}*/

}
