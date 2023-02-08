package day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Application {
	public static void main(String[] args) {
		
		/*List<String> liste1 = new ArrayList<>();// se base sur un tableau
		liste1.add("oca");
		//List<String> liste2 = new LinkedList<>(); // se base sur une liste chainée
		//liste2.add("oca");
		
		//List<String>l = new List<>();
		
		List<String> l1 = new ArrayList<>();
		
		ArrayList<String> l2 = new ArrayList<>();*/
		
		List<String> ls = new ArrayList<>();
		System.out.println(ls.isEmpty());
		System.out.println(ls.size());
		
		ls.add("oca");
		ls.add("ocp");
		System.out.println(ls.isEmpty());
		System.out.println(ls.size());
		System.out.println(ls);
		ls.clear();
		System.out.println(ls);
		
	}
}
