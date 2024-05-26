package medicine;

public class Nurse extends MedicalStuff{


    @Override
    public void performDuty() {
        System.out.println("Nurse " + getFirsstName() + " " + getLastName() + " is assisting patients");
    }
}
