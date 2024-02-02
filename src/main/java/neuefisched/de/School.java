package neuefisched.de;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> school = new ArrayList<>();


    public void addStudent(Student student) {
        school.add(student);

    }

    public List<Student> getSchool() {
        return school;
    }

    public Student findStudent(int studentID) {


        for (int i = 0; i < school.size(); i++) {
            if (school.get(i).getStudentID() == studentID) {
                return school.get(i);
            }

        }
        return null;
    }

    public void allCoursesOfStudent(int studentID){
        System.out.println(findStudent(studentID).getCourses());
    }

    public void allStudent() {
        for (Student student : school) {
            System.out.println(student);
        }
    }

    public void removeStudent(Student student){
        school.remove(student);
    }
}

