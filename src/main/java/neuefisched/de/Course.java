package neuefisched.de;

public class Course {
    private String name;
    private String instructor;
    private int roomNumber;

    public Course(String name, String instructor, int roomNumber) {
        this.name = name;
        this.instructor = instructor;
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
