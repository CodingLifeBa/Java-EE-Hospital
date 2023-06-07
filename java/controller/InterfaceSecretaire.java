package controller;

import java.sql.ResultSet;

import modele.Patient;
import modele.Rv;
import modele.SuiviPatient;

public interface InterfaceSecretaire {
	
	public void creerPatient(Patient p); //ok
	public void modifier(Patient p); //ok
	ResultSet ListerPatient();
	///public ResultSet ListerPatient();
	public Patient RechercherPatient(String codeP);//Ok
	public Patient archiver(Patient p);//Ok
	
	public void creerRv(Rv r);
	public void modifierRv(Rv r);
	public ResultSet listerRv();
	public Rv  RechercherRv(int num);
	public Rv archiverRv(Rv r);
	
	public void creerSuiviPatient(SuiviPatient sv);
	public void modifierSuiviPatient(SuiviPatient sv);
	public ResultSet listerSuiviPatient();
	public SuiviPatient RechercherSuiviPatient(int numDossie);
	public SuiviPatient archiverSuiviPatient(SuiviPatient sv);

}
