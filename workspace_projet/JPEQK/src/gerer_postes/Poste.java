package gerer_postes;

public class Poste extends Secteur{

	private String numero;
	private String libelle;
	private GPS coordonnees;
	private Secteur secteur;
	private String observations;
	
	public Poste(String numero, String libelle, GPS coordonnees) {
		super();
		this.numero = numero;
		this.libelle = libelle;
		this.coordonnees = coordonnees;
	}
		
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		System.out.println("Le numéro doit avoir la 1e lettre de son secteur en 1e position.");
		if(numero.contains(secteur.getNom().substring(0, 1))){
			this.numero = numero;
		}
		return;
		
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public GPS getCoordonnees() {
		return coordonnees;
	}
	public void setCoordonnees(GPS coordonnees) {
		this.coordonnees = coordonnees;
	}
	public String getObservations(){
		return this.observations;
	}
	public void setObservations(String observations){
		this.observations = observations;
	}



	@Override
	public String toString() {
		return "Poste [numero=" + numero + ", libelle=" + libelle
				+ ", coordonnees=" + coordonnees + ", secteur=" + secteur
				+ ", observations=" + observations + "]";
	}
}
