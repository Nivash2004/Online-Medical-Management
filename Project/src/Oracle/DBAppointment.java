package Oracle;

import java.util.ResourceBundle;

import Group2.Appointment;


import java.sql.*;
public class DBAppointment {
	
	
	public static Appointment search(long A_id) throws Exception {
        Connection conn= DBConnection.getConnection();
        Appointment a=new Appointment();
            a.getA_id();
        System.out.println(conn);
         String query = "select * from \"ONLINE MEDICAL MANAGEMENT\".APPOINTMENT where A_ID = "+A_id ;
             Statement stmt = conn.createStatement(); {
                 System.out.println(query);
              ResultSet rs = stmt.executeQuery(query);
              System.out.println(rs);
              while (rs.next()) {
            	  a.setA_id(rs.getLong(1));
       	     	  a.setP_name(rs.getString(2));
       	     	  a.setD_name(rs.getString(3));
                  a.setA_date(rs.getString(4));
                  a.setTime(rs.getString(5));
                  System.out.println("\nA_id...."+a.getA_id()+" P_name "+a.getP_name()+" D_name "+a.getD_name()+" A_date "+a.getA_date()+" Time "+a.getTime());
                       
                }
              
             }
             conn.close(); 
  			return a;
  			} 
	   
	}
            
    
   