import medicine.Doctor;
import medicine.Hospital;
import medicine.Nurse;
import medicine.Patient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        Patient patient3 = new Patient();
        Patient patient4 = new Patient();

        Doctor doctor1 = new Doctor();

        Nurse nurse1 = new Nurse();

        patient2.setIllness("przeziębienie");
        patient2.setRoomNumber(5);
        doctor1.setSpecialization("Kardiolog");

        hospital.addStaff(nurse1);
        hospital.addStaff(doctor1);
        hospital.addPatients(patient1);
        hospital.addPatients(patient2);
        hospital.addPatients(patient3);
        hospital.addPatients(patient4);


        nurse1.displayInfo();
        nurse1.performDuty();
        System.out.println();

        hospital.displayStaff();
        hospital.displayPatients();

        Patient patient5 = new Patient();
        Patient patient6 = new Patient();

        hospital.addPatients(patient5);
        hospital.addPatients(patient6);

        Doctor doctor2 = new Doctor();
        Nurse nurse2 = new Nurse();
        Nurse nurse3 = new Nurse();
        Nurse nurse4 = new Nurse();

        hospital.addStaff(doctor2);
        hospital.addStaff(nurse2);
        hospital.addStaff(nurse3);
        hospital.addStaff(nurse4);

        hospital.removeStaff(nurse3);
        hospital.removePatient(patient5);

        hospital.displayStaff();
        hospital.displayPatients();



    }
}