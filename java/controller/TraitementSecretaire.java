package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ConnexionJdbc1;
import modele.Patient;
import modele.Rv;
import modele.SuiviPatient;

public class TraitementSecretaire implements InterfaceSecretaire {
	
	
	////** Ajouter Secretaire   */////
	
	@Override
	public void creerPatient(Patient p) {
		
		ConnexionJdbc1 cj= new ConnexionJdbc1();
		cj.connect();
		String sql = "INSERT INTO patient (codePatient,prenom,nom,login,password) VALUES"
				+ " ('"+p.getCodePatient()+"','"+p.getPrenom()+"','"+p.getNom()+"',"
						+ "'"+p.getLogin()+"','"+p.getPassword()+"')";
		
		try {
			cj.st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	///*** ModifierPatient **////
	@Override
	public void modifier(Patient p) {
		ConnexionJdbc1 cj= new ConnexionJdbc1();
		cj.connect();
		///String sql = "UPDATE patient set prenom='"+p.getPrenom()+"',nom='"+p.getNom()+"',login='"+p.getLogin()+"'where password='"+p.getPassword()+"'";
		String sql="update patient set prenom='"+p.getPrenom()+"',nom='"+p.getNom()+"',login='"+p.getLogin()+"',password='"+p.getPassword()+"' where codePatient='"+p.getCodePatient()+"'";
		try {
			cj.st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public ResultSet ListerPatient() {
		ResultSet rs=null;
		ConnexionJdbc1 cj= new ConnexionJdbc1();
		cj.connect();
		
		String sql="select * from patient";
		
		try {
			cj.st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	
	/// Rechercher Patient/////////
	
	@Override
	public Patient RechercherPatient(String codeP) {
		
		Patient p= new Patient();
		ConnexionJdbc1 cj=new ConnexionJdbc1();
		cj.connect();
		
		String sql=" select * from patient where codePatient='"+codeP+"' ";
		
		try {
			
			ResultSet rs=cj.st.executeQuery(sql);
			if(rs.next()){
				String codePatient=rs.getString(1);
				String prenom=rs.getString(2);
				String nom=rs.getString(3);
				p.setCodePatient(codePatient);p.setPrenom(prenom);p.setNom(nom);
			}else {
				p=null;
			}
			cj.st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return p;
	}
	
	//// Archiver ////
	public Patient archiver(Patient p) {
		///rechercherPatient
		///Insertion de larchivage
		///supprimer le patient archiver
		

		ConnexionJdbc1 cj= new ConnexionJdbc1();
		cj.connect();
		
		Patient p2= RechercherPatient(p.getCodePatient());
		if (p2!=null) {
			
		
		String sql = "INSERT INTO archiverpatient (codePatient,prenom,nom,login,password) VALUES ('"+p.getCodePatient()+"','"+p.getPrenom()+"','"+p.getNom()+"','"+p.getLogin()+"','"+p.getPassword()+"')";
		
		
		
		try {
			cj.st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sq="delete from patient where codePatient='"+p.getCodePatient()+"'";
		
		try {
			cj.st.executeUpdate(sq);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return p2;
			
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	////******* Creer Rv ***///////
	@Override
	public void creerRv(Rv r) {
		ConnexionJdbc1 cj= new ConnexionJdbc1();
		cj.connect();
		String sql = "INSERT INTO rv (numRv,dateRv,objet,codePatient,matriculeMed) VALUES ('"+r.getNumRv()+"','"+r.getDateRv()+"','"+r.getObjet()+"','"+r.getCodePatient()+"','"+r.getMatriculeMed()+"')";
		
		
		try {
			cj.st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	///**** Modifier Rv //////
	
	@Override
	
	public void modifierRv(Rv r) {
		
		
		
		ConnexionJdbc1 cj= new ConnexionJdbc1();
		cj.connect();
		String sql="update Rv set matricule ='"+r.getMatriculeMed()+"',dateRv='"+r.getDateRv()+"',objet='"+r.getObjet()+"',codePatient='"+r.getCodePatient()+"', where numRv='"+r.getNumRv()+"'";
		
		try {
			cj.st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	///*** Lister Rv ////
	@Override
	public ResultSet listerRv() {
		
			
			ResultSet rs = null;
			
			ConnexionJdbc1 cj= new ConnexionJdbc1();
			cj.connect();
			
			
			String sql=" select * from Rv ";
			
			
			try {
				 rs=cj.st.executeQuery(sql);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
			
		}
		
	
	
	//** Rechercher Rv ////
	@Override
	public Rv  RechercherRv(int num) {
		
		Rv r =new Rv();
		ConnexionJdbc1 cj=new ConnexionJdbc1();
		cj.connect();
		
		String sql=" select * from rv where numRv='"+num+"' ";
		
		try {
			
			ResultSet rs=cj.st.executeQuery(sql);
			if(rs.next()){
				int numRv=rs.getInt(1);
				///int numRv=rs.getInt(1);
				String dateRv=rs.getString(2);
				String objet=rs.getString(3);
				String codePatient=rs.getString(4);
				String matricule=rs.getString(5);
				r.setNumRv(numRv);r.setCodePatient(codePatient);r.setDateRv(dateRv);r.setObjet(objet);r.setMatriculeMed(matricule);
				
			}else {
				r=null;
			}
			cj.st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return r;
		
		
	}
	
	///archiverRv
	
	public Rv archiverRv(Rv r) {
		

		ConnexionJdbc1 cj= new ConnexionJdbc1();
		cj.connect();
		
		Rv r2= RechercherRv(r.getNumRv());
		if (r2!=null) {
			
		
		String sql = "INSERT INTO rv (numRv,dateRv,objet,codePatient,matriculeMed) VALUES ('"+r.getNumRv()+"','"+r.getDateRv()+"','"+r.getObjet()+"','"+r.getCodePatient()+"','"+r.getMatriculeMed()+"')";
		
		
		
		try {
			cj.st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sq="delete from rv where numRv='"+r.getNumRv()+"'";
		
		try {
			cj.st.executeUpdate(sq);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		return r2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//////****ConsulterSuiviPqtient*****/////pqtient
	@Override
	public void creerSuiviPatient(SuiviPatient sv) {
		
		ConnexionJdbc1 cj= new ConnexionJdbc1();
		cj.connect();
		String sql = "INSERT INTO suivipatient (numDossier,codePatient,examen,dateExamen,resultat,dateResultat,matriculeMed) VALUES ('"+sv.getNumDossier()+"','"+sv.getCodePatient()+"','"+sv.getExamen()+"','"+sv.getDateExamen()+"','"+sv.getResultat()+"','"+sv.getDateResultat()+"','"+sv.getMatriculeMed()+"')";
		
		
		try {
			cj.st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/////modifierSuiviPatient
	@Override
	public void modifierSuiviPatient(SuiviPatient sv) {
		
		ConnexionJdbc1 cj= new ConnexionJdbc1();
		cj.connect();

		String sql="update suivipatient set codePatient='"+sv.getCodePatient()+"',examen='"+sv.getExamen()+"',dateExamen='"+sv.getDateExamen()+"',resultat='"+sv.getResultat()+"',dateResultat='"+sv.getDateResultat()+"',matriculeMed='"+sv.getMatriculeMed()+"'";
		try {
			cj.st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public ResultSet listerSuiviPatient() {
		ResultSet rs = null;
		
		ConnexionJdbc1 cj= new ConnexionJdbc1();
		cj.connect();
		
		
		String sql=" select * from suivipatient ";
		
		
		try {
			 rs=cj.st.executeQuery(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
		
	}
	
///RechercherSuiviPatient
	@Override
	public SuiviPatient RechercherSuiviPatient(int numDossie) {
		
		SuiviPatient sv=new SuiviPatient();
		ConnexionJdbc1 cj=new ConnexionJdbc1();
		cj.connect();
		String sql=" select * from suivipatient where numDossier='"+numDossie+"' ";
	
		try {
			
			ResultSet rs=cj.st.executeQuery(sql);
			if(rs.next()){
				int numDossier=rs.getInt(1);
				///int numRv=rs.getInt(1);
				String codePatient=rs.getString(2);
				String examen=rs.getString(3);
				String dateExamen=rs.getString(4);
				String resultat=rs.getString(5);
				String dateResultat=rs.getString(6);
				String matriculeMed=rs.getString(7);
				sv.setNumDossier(numDossier);sv.setCodePatient(codePatient);sv.setExamen(dateExamen);sv.setDateExamen(dateExamen);sv.setResultat(dateResultat);sv.setDateResultat(dateResultat);sv.setMatriculeMed(matriculeMed);
			}else {
				sv=null;
			}
			cj.st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return sv;
		
		
	}
	
	
	///archiverSuiviPatient
	public SuiviPatient archiverSuiviPatient(SuiviPatient sv) {
		
	


	ConnexionJdbc1 cj= new ConnexionJdbc1();
	cj.connect();
	
	SuiviPatient s2=RechercherSuiviPatient(sv.getNumDossier());
	
	if (s2!=null) {
		
	
	String sql = "INSERT INTO suivipatient (numDossier,codePatient,examen,dateExamen,resultat,dateResultat,matriculeMed) VALUES ('"+sv.getNumDossier()+"','"+sv.getCodePatient()+"','"+sv.getExamen()+"','"+sv.getDateExamen()+"','"+sv.getResultat()+"','"+sv.getDateResultat()+"','"+sv.getMatriculeMed()+"')";
	
	
	
	try {
		cj.st.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String sq="delete from suivipatient where numDossier='"+sv.getNumDossier()+"'";
	
	try {
		cj.st.executeUpdate(sq);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	return s2;
	}
	
}
