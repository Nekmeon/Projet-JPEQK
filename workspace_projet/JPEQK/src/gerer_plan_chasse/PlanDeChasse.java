package gerer_plan_chasse;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class PlanDeChasse {
	
	private Date date_plan;
	private List<Gibier> gibiers_preleves = new ArrayList<>();
	
	
	public int calculerTotalGibierPreleve(List<Gibier> gibiers_preleves){
		return gibiers_preleves.size();
	}
	
	public int calculerTotalGibierPreleveFemelle(List<Gibier> gibiers_preleves){
		int total_femelles = 0;
		for(Gibier g : gibiers_preleves){
			if(g.getSexe() == "Femelle"){
				total_femelles = total_femelles + 1;
			}
		}
		return total_femelles;
	}
	
	public int calculerTotalGibierPreleveMale(List<Gibier> gibiers_preleves){
		int total_males = 0;
		for(Gibier g : gibiers_preleves){
			if(g.getSexe() == "Male"){
				total_males = total_males + 1;
			}
		}
		return total_males;
	}
	
	public void ajouterGibier(Gibier gib){
		gibiers_preleves.add(gib);
	}
	
	public void supprimerGibier(Gibier gib){
		gibiers_preleves.remove(gib);
	}
	
	public void afficherLesGibiersPreleves(List<Gibier> gibiers_preleves){
		for(Gibier g : gibiers_preleves){
			System.out.println(g + "\n____________________________________________________________________________________\n");
		}
	}
	
	public Date getDate_plan() {
		return date_plan;
	}
	
	public void setDate_plan(Date date_plan) {
		this.date_plan = date_plan;
	}
	
	public List<Gibier> getGibiers_preleves() {
		return gibiers_preleves;
	}
	
	public void setGibiers_preleves(List<Gibier> gibiers_preleves) {
		this.gibiers_preleves = gibiers_preleves;
	}
	
	public PlanDeChasse(Date date_plan, List<Gibier> gibiers_preleves) {
		super();
		this.date_plan = date_plan;
		this.gibiers_preleves = gibiers_preleves;
	}

	@Override
	public String toString() {
		return "PlanDeChasse : date_plan = " + date_plan + ", gibiers_preleves = "
				+ gibiers_preleves;
	}
	
	
	

}
