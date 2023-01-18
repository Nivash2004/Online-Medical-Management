package Oracle;

import java.util.ResourceBundle;

import Group2.Patient;

import java.sql.*;
public class DBPatient {
	
	 
       public static Patient search(long P_id) throws Exception {
            Connection conn= DBConnection.getConnection();
            Patient p=new Patient();
           
        System.out.println(conn);
         String query = "select * from \"ONLINE MEDICAL MANAGEMENT\".PATIENT where P_ID = "+P_id;
             Statement stmt = conn.createStatement(); {
                 System.out.println(query);
              ResultSet rs = stmt.executeQuery(query);
              System.out.println(rs);
              while (rs.next()) {                            
                p.setP_id(rs.getLong(1));
                p.setP_name(rs.getString(2));
                p.setAddress(rs.getString(3));
                p.setPhoneNumber(rs.getLong(4));
                System.out.println("\nP_id...."+p.getP_id()+" P_name "+p.getP_name()+" address "+p.getAddress()+ " P_phoneNumber "+p.getPhoneNumber());
                                     
              }
            }
			conn.close(); 
			return p;}

	
		 
	

            
    }
    

