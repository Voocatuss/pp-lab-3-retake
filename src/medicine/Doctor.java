package medicine;

public class Doctor extends MedicalStuff {


    @Override
    public void performDuty() {
        System.out.println("Doctor " + getFirsstName() + " " + getLastName() + " is diagnosis patients");
    }

}
