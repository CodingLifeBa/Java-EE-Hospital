package modele;

public class Secretaire {
	
	private String matriculeSecretaire,prenom,nom,login,password;
	
	
	
	
	
	public Secretaire(String matriculeSecretaire, String prenom, String nom, String login, String password) {
		super();
		this.matriculeSecretaire = matriculeSecretaire;
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.password = password;
	}
	
	
	
	public Secretaire(String prenom, String nom, String login, String password) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.password = password;
	}



	public String getMatriculeSecretaire() {
		return matriculeSecretaire;
	}



	public void setMatriculeSecretaire(String matriculeSecretaire) {
		this.matriculeSecretaire = matriculeSecretaire;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	

}
