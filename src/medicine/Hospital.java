package medicine;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    static List<Patient> patients = new ArrayList<Patient>();
    static List<MedicalStuff> staff = new ArrayList<MedicalStuff>();

    public void addPatients(Patient patient){
        this.patients.add(patient);
    }

    public void addStaff(MedicalStuff staff){
       this.staff.add(staff);
    }

    public void removePatient(Patient patient){
        this.patients.remove(patient);
    }

    public void removeStaff(MedicalStuff staff){
        this.staff.remove(staff);
    }

    public void displayPatients(){
        for(int i=0; i<patients.size(); i++){
            patients.get(i).displayInfo();
            System.out.println();
        }
        System.out.println();
    }

    public void displayStaff(){
        for(int i=0; i<staff.size(); i++){
            staff.get(i).displayInfo();
            System.out.println(" ");
        }
        System.out.println();
    }

}
