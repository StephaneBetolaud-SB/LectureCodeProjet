package token;

public class Token {
	
	private String type;
	private String informationToken;
	private String valeur;
	private String nom;
	
	public Token(String nom,String informationToken, String type, String valeur) {
		this.nom = nom;
		this.type = type;
		this.valeur = valeur;
		this.informationToken = informationToken;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getInformationToken() {
		return informationToken;
	}

	public void setInformationToken(String informationToken) {
		this.informationToken = informationToken;
	}
	
	public String toString() {
		return "token de nom : " + this.nom + ", l'information du token est : " + this.informationToken + ", le type : " + this.type + " et de valeur : " + this.valeur;
		//return "le type : " + this.type;
		//return this.informationToken;
	}

}
