import medicine.Patient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        Patient patient3 = new Patient();
        Patient patient4 = new Patient();

        patient1.displayInfo();
        System.out.println();
        patient2.displayInfo();
        System.out.println();
        patient3.displayInfo();
        System.out.println();
        patient4.displayInfo();
        System.out.println();

        patient2.setIllness("przeziębienie");
        patient2.setRoomNumber(5);

        patient2.displayInfo();
    }
}