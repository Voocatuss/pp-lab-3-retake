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

        hospital.removeStaff(nurse1);
        hospital.removePatient(patient4);

        hospital.displayStaff();
        hospital.displayPatients();



    }
}