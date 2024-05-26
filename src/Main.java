import medicine.Doctor;
import medicine.Patient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        Patient patient3 = new Patient();
        Patient patient4 = new Patient();
        Doctor doctor1 = new Doctor();

        doctor1.set

        patient2.displayInfo();
        System.out.println();


        patient2.setIllness("przeziębienie");
        patient2.setRoomNumber(5);

        patient2.displayInfo();
        System.out.println();

        doctor1.performDuty();
        System.out.println(doctor1.getSpecialization());

        doctor1.setSpecialization("Kardiolog");

        System.out.println(doctor1.getSpecialization());

    }
}