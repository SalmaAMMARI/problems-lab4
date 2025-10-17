package Problem5;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    private static final int max_students = 50;

    // No-args constructor
    public Major() {
        this.id = nextId++;
        this.code = "";
        this.name = "";
        this.students = new Student[max_students];
        this.studentCount = 0;
    }

    // Initialization constructor
    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[max_students];
        this.studentCount = 0;
    }



    // Getters
    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }
    public static int  getMaxStudents(){
        return max_students;
    }
    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to add a student with capacity check , it is used to link the students with its major once the student object is created with a major

    public boolean addStudent(Student student) {
        if (studentCount < max_students) {
            students[studentCount] = student;
            studentCount++;
            return true;
        } else {
            System.out.println("The majo r" + this.name + "is full.");
            return false;
        }
    }

    // toString() method
    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", studentCount=" + studentCount +
                '}';

    }
    // Method to find student by CNE
    public Student findStudentByCNE(String cne) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentID().equals(cne)) {
                return students[i];
            }
        }
        return null;
    }

    // Method to remove student by CNE
    public boolean removeStudent(String cne) {
        Student student = findStudentByCNE(cne);
        if (student != null) {
            // Find the index of the student to remove
            int indexToRemove = -1;
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getStudentID().equals(cne)) {
                    indexToRemove = i;
                    break;
                }
            }

            // Shift elements to remove the student
            if (indexToRemove != -1) {
                for (int i = indexToRemove; i < studentCount - 1; i++) {
                    students[i] = students[i + 1];
                }
                students[studentCount - 1] = null;                 studentCount--;
                return true;
            }
        }
        return false;
    }

    // Method to get occupancy rate
    public void getOccupancyRate() {
        System.out.println("Occupancy rate = "+((double) studentCount / max_students) * 100);


    }
    // Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in the computer science major is:");
        if (studentCount == 0) {
            System.out.println("No students enrolled in this major.");
        } else {
            for (int i = 0; i < studentCount; i++) {
                System.out.println((i + 1) + ".  " + students[i].getStudentID() + "  " +
                        students[i].getLastName() + " " + students[i].getFirstName());
            }
        }
    }
    // Method to get student list as formatted string using StringBuilder
    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder();

        if (studentCount == 0) {
            sb.append("No students enrolled in this major.");
        } else {
            for (int i = 0; i < studentCount; i++) {
                sb.append((i + 1))
                        .append(". ")
                        .append(students[i].getStudentID())
                        .append(" ")
                        .append(students[i].getLastName())
                        .append(" ")
                        .append(students[i].getFirstName());


                if (i < studentCount - 1) {
                    sb.append("\n");
                }
            }
        }

        return sb.toString();
    }

}