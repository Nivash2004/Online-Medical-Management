package Group2;

import java.sql.SQLException;

import Oracle.DBDoctor;

public class Doctor{
      private long D_id;
      private String D_name;
      private String speciality;

      public long getD_id() {
		return D_id;
	}



	public void setD_id(long d_id) {
		D_id = d_id;
	}



	public String getD_name() {
		return D_name;
	}



	public void setD_name(String d_name) {
		D_name = d_name;
	}



	public String getSpeciality() {
		return speciality;
	}



	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}



	     
 

      // Constructor to initialize a doctor's information
      public Doctor(long D_id, String D_name, String speciality) {
        this.D_id = D_id;
        this.D_name = D_name;
        this.speciality = speciality;
      }

 

      public Doctor() {
    	  this.D_id = D_id;
          this.D_name = D_name;
          this.speciality = speciality;
		// TODO Auto-generated constructor stub
	}
      public static Doctor Display() throws Exception {
    	  return DBDoctor.Display();
      }


}