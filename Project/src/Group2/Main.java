package Group2;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import Oracle.DBAppointment;
import Oracle.DBDoctor;
import Oracle.DBPatient;


public class Main {

	public static void main(String[] args) throws Exception {
		Driver d= new oracle.jdbc.driver.OracleDriver();
	      DriverManager.registerDriver(d);
	      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","GROUP-2","Nivash");
	      Statement stmt=con.createStatement();
		Scanner input = new Scanner(System.in);
		MedicalManagementSystem system = new MedicalManagementSystem();
		Scanner sc = new Scanner(System.in);              

		while (true) {
			
			// Print a menu to the console
			System.out.println("\nWelcome to MedicalManagement System");
			System.out.println("------------------------");
			System.out.println("1. Search for a patient");
			System.out.println("2. Create a new appointment");
			System.out.println("3. Search for an appointment");
			System.out.println("4. Cancel appointments");
			System.out.println("5. Available doctors");
			System.out.println("6. Quit");
			System.out.print("Enter your choice: ");



			// Read the user's choice
			int choice = input.nextInt();



			// Search for a patient
			if (choice == 1) {
				input.nextLine(); // Consume the newline character		    
				System.out.println("Enter the patient's ID: ");				
				long P_id = input.nextLong();
				Patient p = system.getPatient(P_id);
			   p= DBPatient.search(P_id);
				if (p != null) {
					
					System.out.println("\nPatient Information:");
					System.out.println("ID: " + p.getP_id());
					System.out.println("Name: " + p.getP_name());
					System.out.println("Address: " + p.getAddress());
					System.out.println("Phone number: " + p.getPhoneNumber());
				} else {
					System.out.println("\nPatient not found.");
				}
			


				
				// Search for an appointment
			} else if (choice == 3) {
				input.nextLine(); // Consume the newline character
				System.out.print("Enter the appointment's ID: ");
				long A_id = input.nextLong();
				Appointment a = system.getAppointment(A_id);
				a= DBAppointment.search(A_id);
				if ( a != null) {
					System.out.println("\nAppointment Information:");
					System.out.println("ID: " + a.getA_id());
					System.out.println("P_name: " + a.getP_name());
					System.out.println("D_name: " + a.getD_name());
					System.out.println("Date: " + a.getA_date());
					System.out.println("Time: " + a.getTime());
				} else 
					System.out.println("\nAppointment not found.");
				

				//break;

				// Exit the program
			}else if (choice == 2) {
							
				System.out.println("Enter A_id :");
				String A_id = sc.next();
				System.out.println("Enter patient name :");
				String patientName = sc.next();
				System.out.println("Enter your available time from 8:00 to 11:30 am:");
				String availableTime = sc.next();
				System.out.println("Enter the Date for your appointment:");
				String date =sc.next();
				System.out.println("Enter the specality from: \n Pediatrics \n Surgeon \n Cardiologist \n gynecologist \n Orthopedist \n Neurologist");
				String speciality = sc.next();
				ResultSet rs=stmt.executeQuery("insert into C_A values ('"+A_id+"','"+patientName+"','"+availableTime+"','"+date+"','"+speciality+"')");
				
                              
					if(speciality.equals("Pediatrics")) {
						System.out.println("Dr. Smith is available");
						System.out.println("Pediatrics");
					}
					else if(speciality.equalsIgnoreCase("Surgeon")) {
						System.out.println("Dr. Nivash is available");
					}
					else if(speciality.equalsIgnoreCase("Cardiologist")){
						System.out.println("Dr. Sinan is available ");

					}else if(speciality.equalsIgnoreCase("gynecologist")) {
						System.out.println("Dr. Monika is available");

					}else if(speciality.equalsIgnoreCase("Orthopedist")) {
						System.out.println("Dr. Satish is available");

					}else if(speciality.equalsIgnoreCase("Neurologist")) {
						System.out.println("Dr. Minhaj is available");

					}else {
						System.out.println("Please enter the valid option");
					}
				System.out.println("");
				System.out.println("");
				System.out.println("Your appointment created:");
				System.out.println("A_id :" +A_id);
				System.out.println("patient name :" +patientName);
				System.out.println("Appointment time :" +availableTime);
				System.out.println("Doctor specality:"+speciality);
				System.out.println("Date of appointment:"+date);
				//break;
			}

			else if (choice == 4) {
				input.nextLine(); // Consume the newline character
				System.out.print("Enter the patient's ID: ");
				long id = input.nextLong();
				 ResultSet rs=stmt.executeQuery("DELETE FROM C_A WHERE A_id='"+id+"'");
				Patient patient = system.getPatient(id);
				if (patient != null) {
					
				} else {
					System.out.println("Your Appointment is cancelled");
				}}


		else if (choice == 5) {
        // Appointment a1 =new Appointment ();
				System.out.println("Avilable doctors are : "+ Doctor.Display());
				
			}else if(choice >6){
			
				System.out.println("\nInvalid choice");
			}else if (choice==6)
			{
				System.out.println("Exiting the program... Goodbye!");
				
				break;
		}}
		
	}}