package Lib;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Code.Cercle;
import Code.Commande;
import Code.DrawingTUI;
import Code.Invoqueur;
import Code.NextCommande;
import Code.conn;

class TestCreate {

	@Test
	void testcreate() throws IOException, SQLException {
		  Cercle c=new Cercle("cc1",12,10,30);
		   DrawingTUI rec=new DrawingTUI(c,"create","Cercle");
		   Commande cm=new NextCommande(rec);
	        Invoqueur tel=new Invoqueur();
	        tel.addnew("A", cm);
	        tel.inv("A");
	        System.out.println(recherche("cc1"));
	        assertTrue(recherche("cc1")==true);
	        
	        
	}
	
	public boolean recherche(String h1) throws SQLException {
		boolean si=false;
		
			  java.sql.Statement stmt = conn.getInstance().createStatement();
			  java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM forme3");
			  System.out.println("---Table formes:---\n");
	          
	          while (rs.next()) {
	        	
	        	  if(rs.getString("nom").equals(h1)) {
	        		  si=true;
	        		  
	        	  }
	            
	          }
		        	  rs.close();
		              stmt.close();
	        	 
		
		return si;
	}
	
}
