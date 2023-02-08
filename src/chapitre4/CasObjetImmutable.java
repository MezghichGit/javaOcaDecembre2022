package chapitre4;

import java.time.LocalDate;

public class CasObjetImmutable {

	public static void main(String[] args) {
		String formation = "OCA";
		formation.concat("-OCP");
		System.out.println(formation);
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		ld.plusDays(3);
		System.out.println(ld);

	}

}
