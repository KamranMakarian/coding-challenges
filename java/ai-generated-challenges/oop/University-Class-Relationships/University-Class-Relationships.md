# Exercise: University System with Class Relationships

### Task
You’ll build a **university system** that models relationships between different entities: universities, departments, professors, courses, and students. This will involve creating classes with various relationships and implementing methods to simulate interactions.

---

## Requirements

### Class Relationships

#### **University**
- **Relationships**:
  - Aggregates multiple `Department` objects (**Aggregation**).
- **Methods**:
  - Add departments and list them.

#### **Department**
- **Relationships**:
  - Aggregates multiple `Professor` and `Course` objects.
- **Methods**:
  - Add professors and courses and list them.

#### **Course**
- **Relationships**:
  - Composes `Student` objects, as students are enrolled in specific courses (**Composition**).
- **Methods**:
  - Enroll students and list them.

#### **Professor**
- **Relationships**:
  - Has a direct association with `Department`, as professors belong to a specific department.

#### **Student**
- **Relationships**:
  - Associated with `Course`, representing students enrolled in specific courses.

---

## Classes and Their Methods

### **University**
- **Properties**:
  - `String name`: The name of the university.
  - `ArrayList<Department> departments`: List of departments.
- **Methods**:
  - `addDepartment(Department department)`: Adds a department to the university.
  - `listDepartments()`: Lists all departments in the university.

### **Department**
- **Properties**:
  - `String name`: The name of the department.
  - `ArrayList<Professor> professors`: List of professors in the department.
  - `ArrayList<Course> courses`: List of courses offered by the department.
- **Methods**:
  - `addProfessor(Professor professor)`: Adds a professor to the department.
  - `addCourse(Course course)`: Adds a course to the department.
  - `listCourses()`: Lists all courses in the department.

### **Professor**
- **Properties**:
  - `String name`: The name of the professor.
  - `Department department`: The department to which the professor belongs.
- **Constructor**:
  - `Professor(String name, Department department)`: Initializes the professor with a name and assigns them to a department.

### **Course**
- **Properties**:
  - `String title`: The title of the course.
  - `ArrayList<Student> students`: List of students enrolled in the course.
- **Methods**:
  - `enrollStudent(Student student)`: Enrolls a student in the course.
  - `listStudents()`: Lists all students in the course.

### **Student**
- **Properties**:
  - `String name`: The name of the student.

---

## In the Main Method

1. Create a `University` object with multiple `Department` objects.
2. Assign `Professor` objects to departments and add `Course` objects to departments.
3. Enroll `Student` objects in courses.
4. List:
   - Departments within the university.
   - Courses within each department.
   - Students in each course.
