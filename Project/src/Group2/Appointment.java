package Group2;

import Oracle.DBAppointment;

public class Appointment {
      private long A_id;
      private String P_name;
      private String D_name;
      private String A_date;
      private String time;

      

      public long getA_id() {
		return A_id;
	}



	public void setA_id(long a_id) {
		A_id = a_id;
	}



	public String getP_name() {
		return P_name;
	}



	public void setP_name(String p_name) {
		P_name = p_name;
	}



	public String getD_name() {
		return D_name;
	}



	public void setD_name(String d_name) {
		D_name = d_name;
	}



	public String getA_date() {
		return A_date;
	}



	public void setA_date(String a_date) {
		A_date = a_date;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	// Constructor to initialize an appointment's information
      public Appointment(long A_id, Patient patient, Doctor doctor, String A_date, String time) {
        this.A_id = A_id;
        this.P_name = P_name;
        this.D_name = D_name;
        this.A_date = A_date;
        this.time = time;
      }

 

      public Appointment() {
    	  this.A_id = A_id;
          this.P_name = P_name;
          this.D_name = D_name;
          this.A_date = A_date;
          this.time = time;
		// TODO Auto-generated constructor stub
	}



	
    }