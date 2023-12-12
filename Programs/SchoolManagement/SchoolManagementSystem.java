import java.util.*;

class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
    }

    // Admin-specific functionalities
    public void addUser(User user, List<User> userList) {
        userList.add(user);
        System.out.println(user.getName() + " added successfully.");
    }

    public void deleteUser(int userId, List<User> userList) {
        for (User user : userList) {
            if (user.getId() == userId) {
                userList.remove(user);
                System.out.println("User with ID: " + userId + " deleted successfully.");
                return;
            }
        }
        System.out.println("User with ID: " + userId + " not found.");
    }
}

class Student extends User {
    public Student(String name, int id) {
        super(name, id);
    }

    // Student-specific functionalities
    public void viewAttendance() {
        // Logic to view attendance
        System.out.println("Viewing attendance...");
    }
}

class Teacher extends User {
    public Teacher(String name, int id) {
        super(name, id);
    }

    // Teacher-specific functionalities
    public void markAttendance(Student student) {
        // Logic to mark attendance
        System.out.println("Marking attendance for " + student.getName() + "...");
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Create some users
        Admin admin = new Admin("Admin Name", 1);
        Student student = new Student("Student Name", 101);
        Teacher teacher = new Teacher("Teacher Name", 201);

        List<User> users = new ArrayList<>();
        // Admin adding users
        admin.addUser(student, users);
        admin.addUser(teacher, users);

        // Admin deleting a user
        admin.deleteUser(101, users);

        // Student checking attendance
        student.viewAttendance();

        // Teacher marking attendance for a student
        teacher.markAttendance(student);
    }
}

