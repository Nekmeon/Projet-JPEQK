package gerer_postes;

import java.util.ArrayList;
import java.util.List;

public class Secteur {
	
	private String nom;
	private List<Poste> postes = new ArrayList<>();
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	} 
	public void ajouterPoste(Poste poste, Secteur secteur){
		if(poste.getNumero().contains(secteur.getNom().substring(0, 1))){
			secteur.postes.add(poste);
		}
		
	}
	
	public Secteur(String nom) {
		this.nom = nom;
	}
	public Secteur() {
	}
	
	@Override
	public String toString() {
		return "Secteur : nom = " + nom + ", postes = " + postes;
	}
}
