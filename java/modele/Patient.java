package modele;

public class Patient {
	
	private String codePatient,prenom,nom,login,password;
	

public Patient(String codePatient, String prenom, String nom, String login, String password) {
		super();
		this.codePatient = codePatient;
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.password = password;
	}


public Patient(String prenom, String nom, String login, String password) {
	super();
	this.prenom = prenom;
	this.nom = nom;
	this.login = login;
	this.password = password;
}




public Patient() {

	// TODO Auto-generated constructor stub
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


public boolean TestLogin(String string, String string2) {
	// TODO Auto-generated method stub
	return false;
}



}

