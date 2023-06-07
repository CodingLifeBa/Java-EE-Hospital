package modele;

public class SuiviPatient {

		private int numDossier;
		private String codePatient,examen,dateExamen,resultat,dateResultat,matriculeMed;
		
		
		public SuiviPatient(int numDossier, String codePatient, String examen, String dateExamen, String resultat,
				String dateResultat, String matriculeMed) {
			super();
			this.numDossier = numDossier;
			this.codePatient = codePatient;
			this.examen = examen;
			this.dateExamen = dateExamen;
			this.resultat = resultat;
			this.dateResultat = dateResultat;
			this.matriculeMed = matriculeMed;
		}
		public SuiviPatient(String codePatient, String examen, String dateExamen, String resultat, String dateResultat,
				String matriculeMed) {
			super();
			this.codePatient = codePatient;
			this.examen = examen;
			this.dateExamen = dateExamen;
			this.resultat = resultat;
			this.dateResultat = dateResultat;
			this.matriculeMed = matriculeMed;
		}
		
		
		public SuiviPatient() {
			super();
		}
		public int getNumDossier() {
			return numDossier;
		}
		public void setNumDossier(int numDossier) {
			this.numDossier = numDossier;
		}
		public String getCodePatient() {
			return codePatient;
		}
		public void setCodePatient(String codePatient) {
			this.codePatient = codePatient;
		}
		public String getExamen() {
			return examen;
		}
		public void setExamen(String examen) {
			this.examen = examen;
		}
		public String getDateExamen() {
			return dateExamen;
		}
		public void setDateExamen(String dateExamen) {
			this.dateExamen = dateExamen;
		}
		public String getResultat() {
			return resultat;
		}
		public void setResultat(String resultat) {
			this.resultat = resultat;
		}
		public String getDateResultat() {
			return dateResultat;
		}
		public void setDateResultat(String dateResultat) {
			this.dateResultat = dateResultat;
		}
		public String getMatriculeMed() {
			return matriculeMed;
		}
		public void setMatriculeMed(String matriculeMed) {
			this.matriculeMed = matriculeMed;
		}
		
		
}
