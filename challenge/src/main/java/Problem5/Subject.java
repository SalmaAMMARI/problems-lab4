package Problem5;

public class Subject {
    private int id;
    private String code;
    private String title;
    private Instructor instructor; // Each subject has one instructor

    // Constructors
    public Subject() {
    }

    public Subject(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public Subject(int id, String code, String title) {
        this.id = id;
        this.code = code;
        this.title = title;
    }

    public Subject(String code, String title, Instructor instructor) {
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
        // set this subject as the instructor's subject
        if (instructor != null && instructor.getSubject() != this) {
            instructor.setSubject(this);
        }
    }
    public String normalizedCode() {
        if (code == null) {
            return null;
        }
        return code.trim().toUpperCase();
    }
    public String properTitle() {
        if (title == null || title.isEmpty()) {
            return title;
        }

        String trimmedTitle = title.trim();
        if (trimmedTitle.isEmpty()) {
            return trimmedTitle;
        }

        String[] words = trimmedTitle.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                if (i > 0) {
                    result.append(" ");
                }

                result.append(words[i].substring(0, 1).toUpperCase())
                        .append(words[i].substring(1).toLowerCase());
            }
        }

        return result.toString();
    }
    public boolean isIntroCourse() {
        if (title == null && code == null) {
            return false;
        }

        boolean titleContainsIntro = title != null &&
                title.toLowerCase().contains("intro");
        boolean codeStartsWithIntro = code != null &&
                code.toUpperCase().startsWith("INTRO-");

        return titleContainsIntro || codeStartsWithIntro;
    }
    public String syllabusLine(Instructor instructor) {
        StringBuilder sb = new StringBuilder();
        sb.append(normalizedCode())
                .append(" - ")
                .append(properTitle());

        if (instructor != null) {
            sb.append(" (Instructor: ")
                    .append(instructor.getLastName() != null ? instructor.getLastName() : "")
                    .append(" ")
                    .append(instructor.getFirstName() != null ? instructor.getFirstName() : "")
                    .append(")");
        }

        return sb.toString();
    }
    // toString method
    @Override
    public String toString() {
        String instructorInfo = (instructor != null) ? instructor.getName() + " (" + instructor.getEmployeeNumber() + ")" : "No instructor assigned";
        return "Subject{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", instructor=" + instructorInfo +
                '}';
    }
}