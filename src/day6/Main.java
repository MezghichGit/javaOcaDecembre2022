package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello tout le monde");
		//1-Création des date et time
		/*
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);*/
		//ZonedDateTime zdt = ZonedDateTime.now();
		//System.out.println(zdt);
		
		//LocalDate ld = LocalDate.of(2011, 1, 14);
		/*LocalDate ld = LocalDate.of(2011, Month.JANUARY, 14);
		System.out.println(ld);
		LocalTime lt = LocalTime.of(15,10,20);
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner votre année de naissaince");
		int annee = sc.nextInt(); //permet de lire à partir du clavier un entier
		
		System.out.println("Donner votre mois de naissaince");
		int mois = sc.nextInt();
		System.out.println("Donner votre jour de naissaince");
		int jour = sc.nextInt();
		//System.out.println(annee+" "+mois+" "+jour);
		
		LocalDate naissance = LocalDate.of(annee, mois, jour);*/
		
		//2-Manipulating
		/*
		LocalDate ld = LocalDate.of(2011, 1, 14);
		//System.out.println(ld.minusDays(2));
		//ld.minusDays(2);
		ld = ld.plusYears(1);
		System.out.println(ld);
		
		LocalTime lt = LocalTime.of(15,10);
		System.out.println(lt);
		lt = lt.plusHours(2);
		System.out.println(lt);*/
		
		//Period period=Period.ofDays(4);
		Period period2=Period.of(2, 3, 10);
		//System.out.println(period2);
		
		LocalDate ld = LocalDate.of(2011, 1, 14);
		ld = ld.plus(period2);
		System.out.println(ld);
		
		//3-Formatting
		/*DateTimeFormatter f = 
				//DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);*/
		
		DateTimeFormatter f = 
				//DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
				DateTimeFormatter.ofPattern("'jour : 'dd 'mois : ' MM 'année : 'yyyy");
		
		System.out.println(ld.format(f));
		System.out.println(f.format(ld));
		
		//LocalDate ld2 = LocalDate.of(2022, 1, 45);
		//System.out.println(ld2);
		
		String formation = " formation oca ";
		System.out.println(formation);
		formation = formation.trim().toUpperCase(); // methods chaining
		System.out.println(formation);
		
		Period p = Period.ofDays(2).ofMonths(3).ofWeeks(2);  // chaining is not applicable
		System.out.println(p);
		
		

	}

}
