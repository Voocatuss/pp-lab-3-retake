package medicine;

public abstract class MedicalStuff extends Person {

    private static String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public static void setSpecialization(String specialization) {
        MedicalStuff.specialization = specialization;
    }

    abstract void performDuty();

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + getSpecialization());
    }
}
