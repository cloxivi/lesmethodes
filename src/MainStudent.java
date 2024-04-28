mport java.util.List;

/**
 * @author : chloelam
 * @Description :
 * @created : 2024-04-22, Monday
 **/

    // Main class to demonstrate adding and searching for students
public class Mainstudent {
        public static void main(String[] args) {
StudentManager studentmanager=new StudentManager();
studentmanager.addstudent(new Student(434,"gdgdg","rerer",84));
studentmanager.addstudent(new Student(44,"gdgdg","ooer",39));
studentmanager.addstudent(new Student(4,"gutgdg","rerhhr",39));
studentmanager.addstudent(new Student(444,"gdhfhg","reruu",79));


            // Display all students
            System.out.println("All students:");
            studentmanager.displayAllStudents();
            // ajouter les autres methodes

        }
    }


