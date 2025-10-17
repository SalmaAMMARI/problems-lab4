package Problem5;

public class Person {
    private static int nextId = 1;
    private int id;
    private String lastName;
    private String firstName;
    private String phone;
    private String email;

    // No-args constructor
    public Person() {
        this.id = nextId++;
        this.lastName = "";
        this.firstName = "";
        this.phone = "";
        this.email = "";
    }

    // Initialization constructor
    public Person(String firstName, String lastName, String phone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    // Accessor methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString() method
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}