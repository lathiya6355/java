package Programs.AttendanceSystem;

import java.util.*;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
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

class Attendance {
    private Map<Student, List<Boolean>> attendanceRecords;

    public Attendance() {
        this.attendanceRecords = new HashMap<>();
    }

    public void addStudent(Student student) {
        attendanceRecords.put(student, new ArrayList<>());
    }

    public void markAttendance(Student student, boolean isPresent) {
        if (attendanceRecords.containsKey(student)) {
            attendanceRecords.get(student).add(isPresent);
            System.out.println(student.getName() + " attendance marked: " + (isPresent ? "Present" : "Absent"));
        } else {
            System.out.println("Student not found!");
        }
    }

    public void viewAttendance(Student student) {
        if (attendanceRecords.containsKey(student)) {
            List<Boolean> records = attendanceRecords.get(student);
            System.out.println("Attendance records for " + student.getName() + ": " + records);
        } else {
            System.out.println("Student not found!");
        }
    }
}

public class AttendanceSystem1 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        Attendance attendance = new Attendance();
        attendance.addStudent(student1);
        attendance.addStudent(student2);

        // Marking attendance
        attendance.markAttendance(student1, true);
        attendance.markAttendance(student2, false);
        attendance.markAttendance(student1, false); // Marking again

        // Viewing attendance
        attendance.viewAttendance(student1);
        attendance.viewAttendance(new Student("Charlie", 3)); // Non-existing student
    }
}

