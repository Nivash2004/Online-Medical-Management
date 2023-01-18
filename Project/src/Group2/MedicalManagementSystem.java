package Group2;

import java.util.*;

 

public class MedicalManagementSystem {

 

  // A map to store patient information, with the patient's ID as the key and
  // the Patient object as the value
  private Map<Long, Patient> patients;

 

  // A map to store doctor information, with the doctor's ID as the key and
  // the Doctor object as the value
  private Map<Long, Doctor> doctors;

 

  // A map to store appointment information, with the appointment ID as the key
  // and the Appointment object as the value
  private Map<Long, Appointment> appointments;

 

  // Constructor to initialize the maps
  public MedicalManagementSystem() {
    patients = new HashMap<>();
    doctors = new HashMap<>();
    appointments = new HashMap<>();
  }

 

  // Method to add a patient to the system
  public void addPatient(Patient patient) {
    patients.put(patient.getP_id(), patient);
  }

 

  // Method to add a doctor to the system
  public void addDoctor(Doctor doctor) {
    doctors.put(doctor.getD_id(), doctor);
  }

 

  // Method to schedule an appointment
  public void scheduleAppointment(Appointment appointment) {
    appointments.put(appointment.getA_id(), appointment);
  }

 

  // Method to retrieve a patient's information
  public Patient getPatient(long id) {
    return patients.get(id);
  }

 

  // Method to retrieve a doctor's information
  public Doctor getDoctor(long id) {
    return doctors.get(id);
  }

 

  // Method to retrieve an appointment
  public Appointment getAppointment(long id) {
    return appointments.get(id);
  }

 

  // Method to cancel an appointment
  public void cancelAppointment(String appointmentId) {
    appointments.remove(appointmentId);
  }

 

  // Method to update a patient's information
  public void updatePatient(Patient patient) {
    patients.put(patient.getP_id(), patient);
  }

 

  // Method to update a doctor's information
  public void updateDoctor(Doctor doctor) {
    doctors.put(doctor.getD_id(), doctor);
  }

}