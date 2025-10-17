package Problem5;

public class Student extends Person {
    private String studentID;
    private Major major;

    // Initialization constructor with major
    public Student(String firstName, String lastName, String phone, String email, String studentID, Major major) {
        super(firstName, lastName, phone, email);
        this.studentID = studentID;

        // Check if the major has not exceeded the max allowed students
        if (major != null && major.getStudentCount() < Major. getMaxStudents()) {
            this.major = major;
            major.addStudent(this);

        } else if (major != null) {
            System.out.println("Major " + major.getName() + " is full. Student created without major.");
            this.major = null;
        } else {
            this.major = null;
        }
    }



    // constructor: creates computer science students directly in computer science major
    public Student(String firstName, String lastName, String phone, String email, String studentID) {
        this(firstName, lastName, phone, email, studentID, new Major("23", "Computer Science"));
    }


    // Getters
    public String getStudentID() {
        return studentID;
    }

    public Major getMajor() {
        return major;
    }

    // Setters
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setMajor(Major major) {
        this.major = major;
    }


    public String getFullNameFormatted() {
        return String.format("%s, %s",
                getLastName().toUpperCase(),
                getFirstName());
    }
    // toString() method
    @Override
    public String toString() {
        String majorInfo = (major != null) ? major.getName() : "No Major";
        return "Student{" +
                "id=" + getId() +
                ", lastName='" + getLastName() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", studentID='" + studentID + '\'' +
                ", major=" + majorInfo +
                '}';
    }
}