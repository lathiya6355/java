import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }
}

public class StudentMarks {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // list dynamic data of student

        // Scanner scanner = new Scanner(System.in);
        // List<Student> students = new ArrayList<>();

        // System.out.println("Enter number of students: ");
        // int n = scanner.nextInt();
        // scanner.nextLine();

        // for (int i = 0; i < n; i++) {
        //     System.out.println("Enter name for student " + (i + 1) + ": ");
        //     String name = scanner.nextLine();

        //     int[] marks = new int[5]; 
        //     System.out.println("Enter marks for 5 subjects for " + name + ": ");
        //     for (int j = 0; j < 5; j++) {
        //         System.out.println("Enter mark for subject " + (j + 1) + ": ");
        //         marks[j] = scanner.nextInt();
        //     }
        //     scanner.nextLine(); 

        //     Student student = new Student(name, marks);
        //     students.add(student);
        // }

        // static data of student

        List<Student> students = new ArrayList<>();

        int[][] studentData = {
            { 80, 75, 90, 85, 98 },
            { 70, 65, 80, 74, 85 },
            { 78, 89, 76, 45, 65 },
            { 78, 85, 74, 95, 88 },
            { 74, 78, 59, 78, 74 },
            { 80, 75, 90, 85, 98 },
            { 70, 65, 80, 74, 85 },
            { 78, 89, 76, 45, 65 },
            { 78, 89, 76, 45, 65 },
            { 74, 78, 59, 78, 75 },
            { 10, 20, 30, 40, 10 }
        };

        String[] studentNames = {
            "Prince", "Hiren", "Dhruvil", "Savan", "Pradip", "Mehul", "Piyush", "Darshan", "Mitesh", "rutvik", "chetan"
        };

        for (int i = 0; i < studentData.length; i++) {
            Student student = new Student(studentNames[i], studentData[i]);
            students.add(student);
        }

        int studentNumber = 1;

        for (Student student : students) {
            System.out.println("Student " + studentNumber + ": " + student.getName());
            int[] marks = student.getMarks();
            System.out.print("Marks: ");
        // maximum mark
            int maxMark = Integer.MIN_VALUE;
            int minMark = Integer.MAX_VALUE;
            for (int mark : marks) {
                System.out.print(mark + " ");
                if (mark > maxMark) {
                    maxMark = mark;
                }
                if (mark < minMark) {
                    minMark = mark;
                }
            }

            System.out.println("\nMaximum Mark: " + maxMark); // Display maximum mark for the student
            System.out.println("Mininmum Mark: " + minMark); // Display minimum mark for the student
        
            // Calculate total marks using the function
            int totalMarks = calculateTotalMarks(student);
            System.out.println("Total Marks: " + totalMarks);
            
            // grade & result
            char grade;
            if (totalMarks >= 400) {
                grade = 'A';
                System.out.println("Result: Pass");
            } else if (totalMarks >= 300) {
                grade = 'B';
                System.out.println("Result: Pass");
            } else {
                grade = 'C';
                System.out.println("Result: Fail");
            }
            System.out.println("Grade: " + grade);
            // Average of student marks
            double averageMarks = (double) totalMarks / marks.length;
            System.out.println("Average Marks: " + averageMarks);
            System.out.println("==================================================\n");
            studentNumber ++; // Increment student number for the next iteration
        }
        


        // student highest marks.
        List<Student> highestScorers = new ArrayList<>();
        int highestMarks = calculateTotalMarks(students.get(0));

        for (Student student : students) {
            int totalMarks = calculateTotalMarks(student);
            if (totalMarks > highestMarks) {
                highestMarks = totalMarks;
                highestScorers.clear();
                highestScorers.add(student);
            } else if (totalMarks == highestMarks) {
                highestScorers.add(student); 
            }
        }

        System.out.println("Count: " + highestScorers.size());
        
        for (Student highestScorer : highestScorers) {
            System.out.println("Students with the highest marks:(" + highestMarks + "):");
            System.out.println("Student: " + highestScorer.getName());
            int[] marks = highestScorer.getMarks();
            System.out.print("Marks: ");
            for (int mark : marks) {
                System.out.print(mark + " ");
            }
            System.out.println("\nTotal Marks: " + highestMarks + "\n");
            System.out.println("================================================== \n");
        }

        // count same total marks student
        Map<Integer, Integer> totalMarksCount = new HashMap<>();
        for (Student student : students) {
            int totalMarks = calculateTotalMarks(student);
            totalMarksCount.put(totalMarks, totalMarksCount.getOrDefault(totalMarks, 0) + 1);
        }

        // Display count of students with the same total marks
        System.out.println("Count Same Total Marks :- ");
        for (Map.Entry<Integer, Integer> entry : totalMarksCount.entrySet()) {
            int totalMarks = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println("Total Marks: " + totalMarks + " | Count: " + count);
            }
        }
        System.out.println("================================================== \n");
    }

    // calculate student marks
    public static int calculateTotalMarks(Student student) {
        int[] marks = student.getMarks();
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }   
}