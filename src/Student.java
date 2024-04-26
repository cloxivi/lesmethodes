/**
 * @author : chloelam
 * @Description :
 * @created : 2024-04-22, Monday
 **/
public class Student
{
    int studentId;
    String lastName;
    String firstName;
    int marks;
public Student()
{

}
    public Student(int studentId, String lastName, String firstName, int marks) {
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.marks = marks;
    }

    // Getters and Setters

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString()
    {
        return "studentId=" + this.studentId + "lastName=" + this.lastName + "firstName=" + this.firstName + "marks=" + this.marks;
    }
}
