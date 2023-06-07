package modele;

public class ArchiverRv {

	private int numRv;
	private String dateRv,objet,codePatient,matriculeMed;
	
	public ArchiverRv(int numRv,String dateRv,String objet,String codePatient,String matriculeMed) {
		this.numRv=numRv;
		this.dateRv=dateRv;
		this.objet=objet;
		this.codePatient=codePatient;
		this.matriculeMed=matriculeMed;
	}
	public ArchiverRv() {
		
	}
	
	public int getNumRv() {
		return  numRv;
	}
	public void setNumRv(int numRv) {
		this.numRv=numRv;
	}
	
	public String getDateRv() {
		return dateRv;
	}
	public void setDateRv(String dateRv) {
		this.dateRv=dateRv;
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
