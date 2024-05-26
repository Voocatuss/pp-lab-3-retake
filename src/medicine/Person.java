package medicine;

public class Person {
    private String firsstName;
    private String lastName;
    private int age;


    public String getFirsstName() {
        return firsstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void displayInfo(){
        System.out.println("Name: " + firsstName + " " + lastName);
        System.out.println("Age: " + age);
    }
}
