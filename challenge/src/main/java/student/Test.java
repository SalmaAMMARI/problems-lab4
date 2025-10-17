package student;

public class Test {
    public static void main(String[] args) {


        Major computerScience = new Major("23", "Computer Science");
        Major electricalEngineering = new Major("45", "Electrical Engineering");
        Major business = new Major("12", "Business Management");

        Student student1=new Student("Amal", "SAFI", "0612345678", "amal.safi@email.com", "22885676", computerScience);
        Student student2=new Student("Samir", "ALAMI", "0623456789", "samir.alami@email.com", "23585976", computerScience);
        new Student("Fatima", "ZAHRA", "0634567890", "fatima.zahra@email.com", "23123456",computerScience );

        new Student("salma", "AMMARI", "0645678901", "karim.benjelloun@email.com", "22345678", electricalEngineering);
        new Student("Leila", "AMMARI", "0656789012", "leila.moussa@email.com", "23456789", electricalEngineering);


        new Student("Youssef", "YOUSSEF", "0667890123", "youssef.elfilali@email.com", "24567890", business);


        computerScience.displayStudents();

        // Test getFullNameFormatted()
        System.out.println("=== Testing getFullNameFormatted() ===");
        System.out.println(student1.getFullNameFormatted());
        System.out.println(student2.getFullNameFormatted());

        // Test findStudentByCNE()
        System.out.println("\n=== Testing findStudentByCNE() ===");
        Student foundStudent = computerScience.findStudentByCNE("23585976");
        if (foundStudent != null) {
            System.out.println("Found: " + foundStudent.getFullNameFormatted());
        } else {
            System.out.println("Student not found");
        }

        // Test removeStudent()
        System.out.println("\n=== Testing removeStudent() ===");
        boolean removed = computerScience.removeStudent("23123456");
        System.out.println("Student removed: " + removed);

        // Display students after removal
        computerScience.displayStudents();

        // Test getOccupancyRate() and displayOccupancyInfo()
        System.out.println("\n=== Testing Occupancy Rate ===");
        computerScience.getOccupancyRate();

        //Test getStudentListAsString()
        System.out.println("\n=== getStudentListAsString()===");
        System.out.println("Computer science Students;");
        System.out.println(computerScience.getStudentListAsString());
        System.out.println("Electrical Engineering Students;");
        System.out.println(electricalEngineering.getStudentListAsString());

        System.out.println("Business Engineering Students;");
        System.out.println(business.getStudentListAsString());


    }
}

