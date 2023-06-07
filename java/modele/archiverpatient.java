package modele;

public class archiverpatient {
	private String codePatient,prenom,nom,login,password;

	public archiverpatient(String codePatient, String prenom, String nom, String login, String password) {
		super();
		this.codePatient = codePatient;
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.password = password;
	}

	public archiverpatient(String prenom, String nom, String login, String password) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.password = password;
	}

	public archiverpatient() {
		super();
	}

	public String getCodePatient() {
		return codePatient;
	}

	public void setCodePatient(String codePatient) {
		this.codePatient = codePatient;
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
