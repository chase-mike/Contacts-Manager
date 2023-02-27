package src;
public class contacts {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    public contacts(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    public String getInfo() {
        return this.firstName + " " + this.lastName + " | " + this.phoneNumber;
    }
}
