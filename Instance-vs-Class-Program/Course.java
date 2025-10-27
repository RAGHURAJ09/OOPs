import java.util.*;

public class Course {
    private String courseName;
    private int duration; // in months
    private double fee;
    private static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 1200.0);
        Course c2 = new Course("Web Development", 4, 1000.0);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("Tech Academy");

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
