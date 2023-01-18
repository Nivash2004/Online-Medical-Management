package Group2;

import java.sql.SQLException;

import Oracle.DBPatient;

public class Patient {
      private long P_id;
      private String P_name;
      private String address;
      private long phoneNumber;
      
      public long getP_id() {
		return P_id;
	}



	public void setP_id(long p_id) {
		P_id = p_id;
	}



	public String getP_name() {
		return P_name;
	}



	public void setP_name(String p_name) {
		P_name = p_name;
	}
	 public String getAddress() {
			return address;
		}



		public void setAddress(String address) {
			this.address = address;
		}



		public long getPhoneNumber() {
			return phoneNumber;
		}



		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

 

      // Constructor to initialize a patient's information
      public Patient(long P_id, String P_name, String address, long phoneNumber) {
        this.P_id = P_id;
        this.P_name = P_name;
        this.address = address;
        this.phoneNumber = phoneNumber;
      }

 

      public Patient() {
    	  this.P_id = P_id;
    	  this.P_name = P_name;
          this.address = address;
          this.phoneNumber = phoneNumber;
		// TODO Auto-generated constructor stub
          	}
      public static Patient search(long P_id) throws Exception {
    	  return DBPatient.search(P_id);
      }
}
    

	