public class Main {

    /*Exercise: University System with Class Relationships
Task:
You’ll build a university system that models relationships between different entities: universities, departments, professors, courses, and students. This will involve creating classes with various relationships and implementing methods to simulate interactions.

Requirements
Class Relationships:

University:

Aggregates multiple Department objects (aggregation).
Contains methods to add departments and list them.
Department:

Aggregates multiple Professor and Course objects.
Contains methods to add professors and courses and list them.
Course:

Composes Student objects, as students are enrolled in specific courses.
Contains methods to enroll students and list them.
Professor:

Has a direct association with Department, as professors can belong to one department.
Student:

Associated with Course, representing students enrolled in specific courses.
Classes and Their Methods:

University:

Properties:
String name: the name of the university.
ArrayList<Department> departments: list of departments.
Methods:
addDepartment(Department department): adds a department to the university.
listDepartments(): lists all departments in the university.
Department:

Properties:
String name: the name of the department.
ArrayList<Professor> professors: list of professors in the department.
ArrayList<Course> courses: list of courses offered by the department.
Methods:
addProfessor(Professor professor): adds a professor to the department.
addCourse(Course course): adds a course to the department.
listCourses(): lists all courses in the department.
Professor:

Properties:
String name: the name of the professor.
Department department: the department to which the professor belongs.
Constructor:
Professor(String name, Department department): initializes the professor with a name and assigns them to a department.
Course:

Properties:
String title: the title of the course.
ArrayList<Student> students: list of students enrolled in the course.
Methods:
enrollStudent(Student student): enrolls a student in the course.
listStudents(): lists all students in the course.
Student:

Properties:
String name: the name of the student.
In the main method:

Create a University object with multiple Department objects.
Assign Professor objects to departments and add Course objects to departments.
Enroll Student objects in courses.
List departments within the university, courses within each department, and students in each course.*/

    public static void main(String[] args) {

        // Create university
        University techUniversity = new University("Tech University");

        // Create departments
        Department computerScience = new Department("Computer Science");
        Department mathematics = new Department("Mathematics");

        // Add departments to university
        techUniversity.addDepartment(computerScience);
        techUniversity.addDepartment(mathematics);

        // Create professors
        Professor alice = new Professor("Dr. Alice", computerScience);
        Professor bob = new Professor("Dr. Bob", computerScience);

        // Add professors to department
        computerScience.addProfessor(alice);
        computerScience.addProfessor(bob);

        // Create courses
        Course dataStructure = new Course("Data Structure");
        Course algorithms = new Course("Algorithms");

        // Add courses to department
        computerScience.addCourse(dataStructure);
        computerScience.addCourse(algorithms);

        // Create students
        Student johnDoe = new Student("John Doe");
        Student janeSmith = new Student("Jane Smith");

        // Enroll students in courses
        dataStructure.enrollStudent(johnDoe);
        dataStructure.enrollStudent(janeSmith);
        algorithms.enrollStudent(janeSmith);

        // Display university information
        System.out.println("University: " + techUniversity.getName());
        System.out.println("\nDepartments:");
        techUniversity.listDepartments();

        // List professors and courses in Computer Science
        System.out.println("\nProfessors in Computer Science Department:");
        computerScience.listProfessors();
        System.out.println("\nCourses in Computer Science Department:");
        computerScience.listCourses();

        // List students in each course
        System.out.println();
        dataStructure.listStudents();
        algorithms.listStudents();
    }
}