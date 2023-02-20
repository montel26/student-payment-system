import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher sam = new Teacher(1, "Sam", 5000);
        Teacher malinda = new Teacher(2, "Malinda", 9000);
        Teacher vusi = new Teacher(3, "Vusi", 6000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(sam);
        teacherList.add(malinda);
        teacherList.add(vusi);

        Student jeff = new Student(1, "jeff", 40);
        Student chris = new Student(2, "chris", 70);
        Student jose = new Student(3, "Jose", 50);

        List<Student> studentList = new ArrayList<>();
        studentList.add(jeff);
        studentList.add(jose);
        studentList.add(chris);

        School abc = new School(teacherList, studentList);
        jeff.payFees(60000);
        jose.payFees(50000);
        Teacher mina = new Teacher(6, "Mina", 9000);
        abc.addTeacher(mina);
        System.out.println("school has earned R." + abc.getTotalMoneyEarned());
   
   System.out.println(" --------- School's Pay Salary ------");
   sam.receiveSalary(sam.getSalary());
   System.out.println(
    "School has spent for salary to " + sam.getName() + " and now has R: " + abc.getTotalMoneyEarned());
    vusi.receiveSalary(vusi.getSalary());
    System.out.println(
     "School has spent for salary to " + vusi.getName() + " and now has R: " + abc.getTotalMoneyEarned());
     mina.receiveSalary(mina.getSalary());

     System.out.println(
     "School has spent for salary to " + mina.getName() + " and now has R: " + abc.getTotalMoneyEarned());
    System.out.println(chris);
    System.out.println(jose);
    System.out.println(vusi);
  
    }
           
}
