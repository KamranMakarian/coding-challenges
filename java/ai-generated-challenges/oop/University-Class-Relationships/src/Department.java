import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void listProfessors() {
        System.out.println("Professors in " + name + " Department:");
        for (Professor professor : professors) {
            System.out.println("- " + professor.getName());
        }
    }

    public void listCourses() {
        System.out.println("Courses in " + name + " Department:");
        for (Course course : courses) {
            System.out.println("- " + course.getTitle());
        }
    }
}
