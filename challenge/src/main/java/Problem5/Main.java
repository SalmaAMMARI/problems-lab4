package Problem5;

public class Main {
    public static void main(String[] args) {

        Instructor instructor = new Instructor("salma", "ammari", "O660313328", "salma.AMMARI@um6p.ma", " XY 123 ");
        Subject subject = new Subject(" cs-101 ", "introduction to java programming");

        // Test all the methods
        System.out.println("=> Clean Employee Number: " + instructor.cleanEmployeeNumber());
        System.out.println("=> Normalized Code: " + subject.normalizedCode());
        System.out.println("=> Proper Title: " + subject.properTitle());
        System.out.println("=> Summary Line: " + instructor.summaryLine());
        System.out.println("=> Is Intro Course: " + subject.isIntroCourse());
        System.out.println("=> Instructor Card:\n" + instructor.toCard());
        System.out.println("=> Syllabus Line: " + subject.syllabusLine(instructor));
        System.out.println("=> Display Name: " + instructor.displayName());

        // Test with null values
        Instructor nullInstructor = new Instructor(null, null, null, null, null);
        System.out.println("Test with null values: " + nullInstructor.displayName());
    }
}