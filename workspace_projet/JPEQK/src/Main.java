import gerer_plan_chasse.Gibier;
import gerer_plan_chasse.PlanDeChasse;
import gerer_utilisateurs.Role;
import gerer_utilisateurs.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

	public static void main(String[] args) throws ParseException {
		
		Date bonjour = new SimpleDateFormat("dd/MM/yyyy").parse("31/02/2000");
		///*
		User user = new User(0001, "Lagarrigue", "Eva", bonjour, Role.associé, false);
		user.payer(user.getRole().getPrix());
		user.setDate_depart(new SimpleDateFormat("dd/MM/yyyy").parse("21/01/2015"));
		user.setMotif_depart("décès");
		System.out.println(user.toString());
		//*/
		
		List <Gibier> gibPre = new ArrayList<>();
		// Gibiers avec bague
		Gibier gib1 = new Gibier(1234, "Bambi", "Male", 75.3, bonjour);
		Gibier gib2 = new Gibier(1235, "Bambinette", "Femelle", 61.3, bonjour);
		Gibier gib3 = new Gibier(1236, "Sangy", "Male", 107, bonjour);
		Gibier gib4 = new Gibier(1237, "Perdu", "Femelle", 12.8, bonjour);
		
		gibPre.add(gib2);
		gibPre.add(gib3);
		gibPre.add(gib4);
		// Gibiers sans bague
		Gibier gib5 = new Gibier("Coco", "Male", 12.1, bonjour);
		Gibier gib6 = new Gibier("Porcinette", "Femelle", 126.1, bonjour);
		Gibier gib7 = new Gibier("Koa", "Femelle", 1.9, bonjour);
		gibPre.add(gib5);
		gibPre.add(gib6);
		gibPre.add(gib7);
		
		PlanDeChasse pdc = new PlanDeChasse(bonjour, gibPre);
		pdc.ajouterGibier(gib1);
		pdc.afficherLesGibiersPreleves(gibPre);
		System.out.println("Total " +pdc.calculerTotalGibierPreleve(gibPre));
		System.out.println("Total Femelle " +pdc.calculerTotalGibierPreleveFemelle(gibPre));
		System.out.println("Total Male " + pdc.calculerTotalGibierPreleveMale(gibPre));
	}

}