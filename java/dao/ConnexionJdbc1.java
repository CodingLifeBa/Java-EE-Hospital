package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnexionJdbc1 {
	
	String driver="com.mysql.cj.jdbc.Driver";
	
	String utilisateur = "root";
	String password="";
	String url = "jdbc:mysql://localhost/miniprojet";
	Connection co=null;

	public Statement st=null;
	
	public void connect(){
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			co=DriverManager.getConnection(url, utilisateur, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			st=co.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
