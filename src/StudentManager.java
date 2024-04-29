/**
 * @author : chloelam
 * @Description : formative2
 * @created : 2024-04-22, Monday
 **/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManager
{
    private ArrayList<Student> students=new ArrayList<>();
    // method to add new student
    public void addstudent (Student student)
    {
     students.add(student);
    }
    // method to search for students with specific marks --- Assez lourd alors que tu n'avais pas besoin de toutes ces tournures !!
    /*public List<Student> searchStudentsByMarks(List<Student> students, int marks)
    {
        return students.stream()
                .filter(student -> student.getMarks() == marks)
                .collect(Collectors.toList());
    }*/
    // method to display all students - Pas besoin de passer les paramètres car tu vas manipuler la même liste
    public  void displayAllStudents()
    {
        for (Student student:students) {
            System.out.println(student);
        }
    }
    // sorting function to sort students based on marks
    public void sortStudentsByMarks()
    {
        Collections.sort(students, Comparator.comparingInt(Student::getMarks));
    }
    // method to search for students with marks above a specified threshold
    public static List<Student> searchStudentsAboveThreshold(List<Student> students, int threshold)
    {
        return students.stream()
                .filter(student -> student.getMarks() > threshold)
                .collect(Collectors.toList());
    }
    // Array list based on different mark ranges
    public static List<List<Student>> categorizeStudentsByMarkRanges(List<Student> students, int[][] ranges)
    {
        List<List<Student>> categorizedStudents = new ArrayList<>();

        // Create a sublist for each specified range
        for (int[] range : ranges) {
            int min = range[0];
            int max = range[1];
            List<Student> studentsInRange = students.stream()
                    .filter(student -> student.getMarks() >= min && student.getMarks() <= max)
                    .collect(Collectors.toList());
            categorizedStudents.add(studentsInRange);
        }

        return categorizedStudents;
    }



}
