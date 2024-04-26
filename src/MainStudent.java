/**
 * @author : chloelam
 * @Description :
 * @created : 2024-04-22, Monday
 **/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*public class MainStudent
{
    // Student class to represent individual students
        private String name;
        private int marks;

        public void Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public int getMarks() {
            return marks;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', marks=" + marks + "}";
        }
    }

    // StudentRecords class to manage a collection of Student objects
    class StudentRecords {
        private List<Student> students;

        public StudentRecords() {
            students = new ArrayList<>();
        }

        // Method to add a new student to the records


        // Method to search for students based on a specific mark
        public List<Student> searchStudentsByMarks(int targetMarks) {
            return students.stream()
                    .filter(student -> student.getMarks() == targetMarks)
                    .collect(Collectors.toList());
        }

        // Method to display all students in the records
        public void displayAllStudents() {
            for (Student student : students) {
                System.out.println(student);
            }
        }

        // Method to display students in a specific collection
        public void displayStudentCollection(List<Student> studentCollection) {
            for (Student student : studentCollection) {
                System.out.println(student);
            }
        }
    }
*/
    // Main class to demonstrate adding and searching for students
    public class Mainstudent {
        public static void main(String[] args) {
           // StudentRecords records = new StudentRecords();
StudentManager studentmanager=new StudentManager();
studentmanager.addstudent(new Student(434,"gdgdg","rerer",34));
            // Adding new students to the records

           // records.addStudent("Bob", 72);
           // records.addStudent("Chloe", 45);
            //records.addStudent("Jack", 90);
           // records.addStudent("Alma", 65);
           // records.addStudent("Maya", 30);

            // Display all students
            System.out.println("All students:");
            studentmanager.displayAllStudents();

            // Search for students with a specific mark
            int targetMarks = 72;
            System.out.println("\nStudents with " + targetMarks + " marks:");
            List<Student> foundStudents = studentmanager.searchStudentsByMarks(targetMarks);
            //studentmanager.displayStudentCollection(foundStudents);
        }
    }


