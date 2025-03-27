package schoolSystem;

public class Parent extends Person{
    private String email;
    private String idNumber;
    private String phoneNumber;
    private Pupil [] pupils;

    public Parent(String dob, String gender, String lastName, String firstName, String middleName, String email, String idNumber, String phoneNumber) {
        this.email = email;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }
}
