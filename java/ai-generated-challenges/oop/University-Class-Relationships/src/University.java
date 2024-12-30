import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void listDepartments() {
        System.out.println("Departments in " + name + ":");
        int count = 1;
        for (Department dept : departments) {
            System.out.println(count + ". " + dept.getName());
            count++;
        }
    }
}
