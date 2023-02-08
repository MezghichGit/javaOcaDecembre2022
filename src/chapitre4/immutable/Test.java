package chapitre4.immutable;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
	ArrayList<String> plats = new ArrayList<String>();
	plats.add("Fish");
	plats.add("Eggs");
	//System.out.println(plats);
	Animal a = new Animal(2,"toto",plats);
	
	System.out.println(a.getFoods());
	plats.clear();
	System.out.println(a.getFoods());
	
	ArrayList<String> myFoods = a.getFoods();
	myFoods.clear();
	System.out.println(a.getFoods());

	}

}
