package Problem5;
public class Instructor extends Person {
    private String employeeNumber;
    private Subject subject; // Each instructor teaches one subject

    // Constructors
    public Instructor() {
        super();
    }

    public Instructor(String firstname,String lastname, String phone, String email, String employeeNumber) {
        super(firstname,lastname, phone, email);
        this.employeeNumber = employeeNumber;
    }

    public Instructor(String firstname,String lastname, String phone, String email, String employeeNumber, Subject subject) {
        super(firstname,lastname, phone, email);
        this.employeeNumber = employeeNumber;
        this.subject = subject;
    }

    // Getters and Setters
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Subject getSubject() {
        return subject;
    }
    public String getName(){
        return this.getFirstName()+" "+this.getLastName();
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
        //  set this instructor as the subject's instructor
        if (subject != null && subject.getInstructor() != this) {
            subject.setInstructor(this);
        }
    }
    public String cleanEmployeeNumber() {
        if (employeeNumber == null) {
            return null;
        }

        return employeeNumber.trim().replaceAll("\\s+", "");
    }

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                cleanEmployeeNumber(), getLastName(), getFirstName());
    }

    // Instructor card u
    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor -------- -\n")
                .append("Employee #: ").append(cleanEmployeeNumber()).append("\n")
                .append("Name      : ").append(getLastName()).append(", ").append(getFirstName()).append("\n")
                .append("Email     : ").append(getEmail() != null ? getEmail() : "N/A").append("\n")
                .append("Phone     : ").append(getPhone() != null ? getPhone() : "N/A");
        return sb.toString();
    }
    public String displayName() {
        StringBuilder sb = new StringBuilder();

        if (getLastName() != null && !getLastName().isEmpty()) {
            sb.append(getLastName());
        }

        if (getFirstName() != null && !getFirstName().isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(getFirstName());
        }


        return sb.length() > 0 ? sb.toString() : "Unknown instructor";
    }

    // toString method
    @Override
    public String toString() {
        String subjectInfo = (subject != null) ? subject.getCode() + " - " + subject.getTitle() : "No subject assigned";
        return "Instructor{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", subject=" + subjectInfo +
                '}';
    }
}
