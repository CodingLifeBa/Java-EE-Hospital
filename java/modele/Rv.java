package modele;

public class Rv {
	
	private int numRv;
	private String dateRv,objet,codePatient,matriculeMed;
	
	public Rv(int numRv, String dateRv, String objet, String codePatient, String matriculeMed) {
		super();
		this.numRv = numRv;
		this.dateRv = dateRv;
		this.objet = objet;
		this.codePatient = codePatient;
		this.matriculeMed = matriculeMed;
	}
	public Rv(String dateRv, String objet, String codePatient, String matriculeMed) {
		super();
		this.dateRv = dateRv;
		this.objet = objet;
		this.codePatient = codePatient;
		this.matriculeMed = matriculeMed;
	}
	
	public Rv() {
		
	}
	public int getNumRv() {
		return numRv;
	}
	public void setNumRv(int numRv) {
		this.numRv = numRv;
	}
	public String getDateRv() {
		return dateRv;
	}
	public void setDateRv(String dateRv) {
		this.dateRv = dateRv;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public String getCodePatient() {
		return codePatient;
	}
	public void setCodePatient(String codePatient) {
		this.codePatient = codePatient;
	}
	public String getMatriculeMed() {
		return matriculeMed;
	}
	public void setMatriculeMed(String matriculeMed) {
		this.matriculeMed = matriculeMed;
	}
	
	

}
