package student.information;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StudentInformation si = new StudentInformation();
            int choice;
        do{
            TaskList();
            choice=in.nextInt();
         switch (choice){
            case 1:
                si.addStudentDetails();
                break;
            case 2:
                si.findStudentByRollNumber();
                break;
            case 3:
                si.findStudentsByFirstName();
                break;
            case 4:
                si.findStudentsByCourseId();
                break;
            case 5:
                si.countStudents();
                break;
            case 6:
                si.deleteStudent();
                break;
            case 7:
                si.updateStudentDetails();
                break;
            case 8:
                System.out.println("** Log out **");
                System.exit(0);
                break;
             default:
                 System.out.println("** This choice is not exist **");
         }
            System.out.println("\n#########################################\n");
        }while (true);
    }

    public static void TaskList() {
        System.out.print("#The Task that you want to perform \n" +
                "1. Add the Student Details \n" +
                "2. Find the Student Details by Roll Number \n" +
                "3. Find the Student Details by First Name \n" +
                "4. Find the Student Details by Course Id \n" +
                "5. Find the Total number of Students \n" +
                "6. Delete the Students Details by Roll Number \n" +
                "7. Update the Students Details by Roll Number \n" +
                "8. TO Exit \n\n" +
                "## Enter your choice : ");
    }
}