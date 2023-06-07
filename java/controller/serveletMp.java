package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modele.Patient;
import modele.Rv;

/**
 * Servlet implementation class serveletMp
 */
@WebServlet("/serveletMp")
public class serveletMp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serveletMp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		Patient  p=new Patient("4","Amane","Linguere","ousmane@gmail.com","motdepasse123");
		TraitementSecretaire ts=new TraitementSecretaire();
		ts.creerPatient(p);
	
		
		/*TraitementSecretaire ts=new TraitementSecretaire();
		PrintWriter pw=response.getWriter();
		Patient p=ts.RechercherPatient("3");
		PrintWriter pw=response.getWriter();
		
		if(p!=null) {
			pw.println("Patient "+p.getCodePatient() + p.getPrenom()+ p.getNom());
		}else {
			pw.println("User not found");
		}*/
		
		/*Archivage
		TraitementSecretaire ts=new TraitementSecretaire();
		PrintWriter pw=response.getWriter();
		Patient p= new Patient("3","Ousmane","Linguere","ousmane@gmail.com","motdepasse");
		p=ts.archiver(p);
		if(p!=null) {
			pw.println("Patient Archivee");
		}else {
			pw.println("Patient not Found ! Archive error ");
		}
		*/
		/*
		TraitementSecretaire tc= new TraitementSecretaire();
		ResultSet rs=tc.ListerPatient();
		PrintWriter pw=response.getWriter();
		try {
			while(rs.next()) {
				int numero=rs.getInt(1);
				String nom=rs.getString(2);
				String adresse=rs.getString(3);
				int tel =rs.getInt(4);
				
				pw.println("client : " +numero+ " " +nom+ " " +adresse+ " " +tel);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Patient  p=new Patient("2","Amane","Linguere","ousmane@gmail.com","motdepasse123");
		TraitementSecretaire ts=new TraitementSecretaire();
		ts.creerPatient(p);
	
	}

}
