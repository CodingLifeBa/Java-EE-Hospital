package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ConnexionJdbc1;

public class TraitementPatient {
	
	public ResultSet consulterRv(String codePatient){
		ResultSet rs=null;
		ConnexionJdbc1 cj=new ConnexionJdbc1();
		cj.connect();
		
		String sql="select rv where codePatient= '"+codePatient+"'";
		
		try {
			cj.st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
	
	
	public ResultSet consulterSuiviPatient(String codePatient){
		ResultSet rs=null;
		ConnexionJdbc1 cj=new ConnexionJdbc1();
		cj.connect();
		
		String sql="select suivipatient where codePatient='"+codePatient+"'";
		try {
			cj.st.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return rs;
		
	}
}
