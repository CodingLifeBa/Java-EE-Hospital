package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ConnexionJdbc1;

public class TraitmentMedecin {
	
	public ResultSet consulterRv(String matriculeMed) {
		ResultSet rs=null;
		ConnexionJdbc1 cj= new ConnexionJdbc1();
		cj.connect();
		
		String sql="select * from rv where matriculeMed='"+matriculeMed+"'";
		try {
			cj.st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
	}

	public ResultSet consulterDossierPatient(String matriculeMed) {
		ResultSet rs=null;
		ConnexionJdbc1 cj= new ConnexionJdbc1();
		cj.connect();
		
		String sql="select * from suivipatient where matriculeMed='"+matriculeMed+"'";
		try {
			cj.st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
