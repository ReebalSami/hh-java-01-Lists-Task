package neuefisched.de;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Ingo", "Becker", 568));
        students.add(new Student("Ugur", "Kartal", 222));
        students.add(new Student("Aaron", "Becher", 486));
        students.add(new Student("Reebal", "Sami", 784));

        School school = new School();
        school.addStudent(students.get(0));
        school.addStudent(students.get(1));
        school.addStudent(students.get(2));
        school.addStudent(students.get(3));

        school.allStudent();

        System.out.println(school.getSchool());

        System.out.println(school.findStudent(222));
        System.out.println(school.findStudent(777));
    }
}