import java.util.ArrayList;
import java.util.List;

class Student {
    int r_no;
    String name;
    int mark;

    public Student(int r_no, String name, int mark) {
        this.r_no = r_no;
        this.name = name;
        this.mark = mark;
    }
    public int getR_no() {
        return r_no;
    }

    public void setR_no(int r_no) {
        this.r_no = r_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String calculateGrade() {
        if (this.mark > 400) {
            return "A";
        } else if (this.mark > 300) {
            return "B";
        } else if (this.mark > 200) {
            return "C";
        } else {
            return "D";
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Student s1 = neiw Student(1, "Prince", 467);
        Student s2 = new Student(2, "Hiren", 428);
        Student s3 = new Student(3, "Mehul", 180);
        Student s4 = new Student(4, "Chetan", 380);
        Student s5 = new Student(5, "Jaydip", 384);
        Student s6 = new Student(6, "Paras", 450);
        Student s7 = new Student(7, "Dhruvil", 221);
        Student s8 = new Student(8, "rutvik", 250);
        Student s9 = new Student(9, "Keyur", 299);
        Student s10 = new Student(10, "Raj", 299);

        List<Student> stdList = new ArrayList<>();
        stdList.add(s1);
        stdList.add(s2);
        stdList.add(s3);
        stdList.add(s4);
        stdList.add(s5);
        stdList.add(s6);
        stdList.add(s7);
        stdList.add(s8);
        stdList.add(s9);
        stdList.add(s10);

        for (Student student : stdList) {
            System.out.println("Student Roll Number: " + student.getR_no());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Marks: " + student.getMark());
            System.out.println("Grade: " + student.calculateGrade());
            System.out.println("=====================================");
        }

        int minMarks = Integer.MAX_VALUE;
        int maxMarks = Integer.MIN_VALUE;
        Student studentWithMinMarks = null;
        Student studentWithMaxMarks = null;

        for (Student student : stdList) {
            int marks = student.getMark();
            if (marks < minMarks) {
                minMarks = marks; // Update minimum marks if found
                studentWithMinMarks = student;
            }
            if (marks > maxMarks) {
                maxMarks = marks; // Update maximum marks if found
                studentWithMaxMarks = student; 
            }
        }
        System.out.println("\n\n===================Min & Max Marks=======================");
        System.out.println("Minimum Marks: " + minMarks);
        System.out.println("Maximum Marks: " + maxMarks);
        if (studentWithMinMarks != null) {
            System.out.println("\n===================Student with Minimum Marks=======================");
            System.out.println("Student ID: " + studentWithMinMarks.getR_no());
            System.out.println("Student Name: " + studentWithMinMarks.getName());
            System.out.println("Student Marks: " + studentWithMinMarks.getMark());
        }
    
        if (studentWithMaxMarks != null) {
            System.out.println("\n===================Student with Maximum Marks=======================");
            System.out.println("Student ID: " + studentWithMaxMarks.getR_no());
            System.out.println("Student Name: " + studentWithMaxMarks.getName());
            System.out.println("Student Marks: " + studentWithMaxMarks.getMark());
        }

        // same marks student count
        List<List<Student>> sameMarksStudents = new ArrayList<>();

        for (int i = 0; i < stdList.size() - 1; i++) {
            Student currentStudent = stdList.get(i);
            int currentMarks = currentStudent.getMark();
            List<Student> sameMarks = new ArrayList<>();
            sameMarks.add(currentStudent);

            for (int j = i + 1; j < stdList.size(); j++) {
                Student nextStudent = stdList.get(j);
                int nextMarks = nextStudent.getMark();
                if (currentMarks == nextMarks) {
                    sameMarks.add(nextStudent);
                }
            }

            if (sameMarks.size() > 1) {
                sameMarksStudents.add(sameMarks);
            }
        }
        System.out.println("\n\nSame mark student Count = " + sameMarksStudents.size());
        System.out.println("===================Same Marks Student Details=======================");
        for (List<Student> students : sameMarksStudents) {
            for (Student student : students) {
                System.out.println("Student ID: " + student.getR_no());
                System.out.println("Student Name: " + student.getName());
                System.out.println("Student Marks: " + student.getMark());
                System.out.println("Grade: " + student.calculateGrade());
                System.out.println("=====================================");
            }
        }
    }
}
