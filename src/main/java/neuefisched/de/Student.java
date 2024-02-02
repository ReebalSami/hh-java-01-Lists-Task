package neuefisched.de;

import java.util.ArrayList;
import java.util.List;

public class Student {
private String firstName;
private String lastName;
private int studentID;
private List<Course> courses = new ArrayList<>();

    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentID=" + studentID +
                '}';
    }


}
