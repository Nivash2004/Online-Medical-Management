package Oracle;

import java.util.ResourceBundle;

import Group2.Doctor;
import Group2.Patient;

import java.sql.*;
public class DBDoctor {
    
       
	public static Doctor Display() throws Exception {
        Connection conn= DBConnection.getConnection();
        Doctor d=new Doctor();
        System.out.println(conn);
         String query = "select * from \"ONLINE MEDICAL MANAGEMENT\".DOCTOR";
             Statement stmt = conn.createStatement(); {
                 System.out.println(query);
              ResultSet rs = stmt.executeQuery(query);
              System.out.println(rs);
              while (rs.next()) {
            	  d.setD_id(rs.getLong(1));
                  d.setD_name(rs.getString(2));
                  d.setSpeciality(rs.getString(3));
                     
                System.out.println("\nD_id "+d.getD_id()+" D_name "+d.getD_name()+ " Speciality "+d.getSpeciality());
              }
            } 
             conn.close(); 
 			return d;
 			} 
            
public static Doctor search(long D_id) throws Exception {
    Connection conn= DBConnection.getConnection();
    Doctor d=new Doctor();
   
System.out.println(conn);
 String query = "select * from \"ONLINE MEDICAL MANAGEMENT\".DOCTOR where D_ID = "+D_id;
     Statement stmt = conn.createStatement(); {
         System.out.println(query);
      ResultSet rs = stmt.executeQuery(query);
      System.out.println(rs);
      while (rs.next()) {                            
    	  d.setD_id(rs.getLong(1));
          d.setD_name(rs.getString(2));
          d.setSpeciality(rs.getString(3));
             
        System.out.println("\nD_id "+d.getD_id()+" D_name "+d.getD_name()+ " Speciality "+d.getSpeciality());
                             
      }
    }
	conn.close(); 
	return d;
	}
   
}

                           
    