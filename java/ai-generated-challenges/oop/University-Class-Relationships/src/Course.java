import java.util.ArrayList;

public class Course {
    private String title;
    private ArrayList<Student> students;

    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void listStudents() {
        System.out.println("Students in " + title + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}
