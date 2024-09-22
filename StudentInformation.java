package student.information;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInformation extends Student {

    ArrayList<Student> students = new ArrayList<Student>();
    Scanner in = new Scanner(System.in);


    public StudentInformation() {
        super();
    }

    Student SS = new Student();

    public void addStudentDetails() {
        System.out.print("#Enter First name : ");
        String firstName1 = in.next();
        System.out.print("#Enter Last name : ");
        String lastName1 = in.next();
        System.out.print("#Enter Roll Number : ");
        int rollNumber1 = in.nextInt();
        boolean f=false;
        do{
        for (int i = 0; i < students.size(); i++) {
        if(rollNumber1==SS.rollNumber){
            System.out.print("** This roll number exist ,Try again! :");
            rollNumber1 = in.nextInt();
            f=true;
        }else{
            f=false;
        }
        }
        
            }while(f==true);
        System.out.print("#Enter CGPA : ");
        double cgpa1 = in.nextDouble();
        System.out.println("#Enter the courses ID , to exit add 0 : ");
        int x = in.nextInt();
        int i = 0;
        ArrayList<Integer> cour = new ArrayList<>();
        while (x != 0) {

            cour.add(x);
            x = in.nextInt();
            i++;
        }
        SS = new Student(firstName1, lastName1, rollNumber1, cgpa1, cour);
        students.add(SS);
    }

    public void findStudentByRollNumber() {
        boolean flag = true;
        while (flag == true) {
            System.out.print("##Enter Roll Number :");
            int search = in.nextInt();
            for (int i = 0; i < students.size(); i++) {
                if (search == students.get(i).rollNumber) {
                    System.out.println("\n** Student details :");
                    System.out.println(students.get(i));
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println("** This roll number is not exist **");
                System.out.println("#Try again ?(y/n)");
                String m = in.next();
                if (m.equalsIgnoreCase("y")) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
    }

    public void findStudentsByFirstName() {
        boolean flag = true;
        while (flag == true) {
            System.out.print("#Enter first name : ");
            String searsh = in.next();
            for (int i = 0; i < students.size(); i++) {
                if (searsh.equalsIgnoreCase(students.get(i).firstName)) {
                    System.out.println("\n** Student details :");
                    System.out.println(students.get(i));
                    flag = false;
                }
            }

            if (flag == true) {
                System.out.println("** This first name is not exist **");
                System.out.println("#Try again ?(y/n)");
                String m = in.next();
                if (m.equalsIgnoreCase("y")) {
                    flag = true;
                } else {
                    flag = false;
                }
            }

        }
    }

    public void findStudentsByCourseId() {
        boolean flag = true;
        while (flag == true) {
            System.out.print("##Enter course id : ");
            int searsh = in.nextInt();
            for (int i = 0; i < students.size(); i++) {
                for (int k = 0; k < students.get(i).courses.size(); k++) {
                    if (searsh == students.get(i).courses.get(k)) {
                        System.out.println("** Student details :");
                        System.out.println(students.get(i));
                        flag = false;
                    }
                }
            }
            if (flag == true) {
                System.out.println("** This course id is not exist **");
                System.out.println("#Try again ?(y/n)");
                String m = in.next();
                if (m.equalsIgnoreCase("y")) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
    }

    public void countStudents() {
        System.out.println("Number of student in system = " + students.size() + " you can have a max of 50 students you can have " + (50 - students.size()) + " more students ");
    }

    public void deleteStudent() {
        System.out.println("##Enter the roll number :");
        int delete = in.nextInt();
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            if (delete == students.get(i).rollNumber) {
                students.remove(i);
                System.out.println("** Student have this roll number " + delete + " , removed **");
                count++;
            } else {
                count++;
            }
        }
        if (count == students.size()) {
            System.out.println("** This roll number is not exist **");
        }

    }

    public void updateStudentDetails() {
        boolean flag = true;
        while (flag == true) {
            System.out.print("##Enter Roll Number :");
            int search = in.nextInt();
            for (int i = 0; i < students.size(); i++) {
                if (search == students.get(i).rollNumber) {
                    System.out.println("** Student details :");
                    System.out.println(students.get(i));
                    System.out.println("#What are you want update?");
                    System.out.print("1. First name"
                            + "\n2. Last name"
                            + "\n3. Roll number"
                            + "\n4. CGPA"
                            + "\n5. Course id"
                            + "\n0. exit"
                            + "\n# Enter your choice :");
                    int x = in.nextInt();
                    int index = 0;
                    for (int k = 0; k < students.size(); k++) {
                        if (x == students.get(k).rollNumber) {
                            index = k;
                        }
                    }
                    while (x != 0) {
                        switch (x) {
                            case 1:
                                System.out.print("#new First :");
                                students.get(index).firstName = in.next();
                                break;

                            case 2:
                                System.out.print("#new last name :");
                                students.get(index).lastName = in.next();
                                break;

                            case 3:
                                System.out.print("#new roll number :");
                                students.get(index).rollNumber = in.nextInt();
                                break;

                            case 4:
                                System.out.print("#new CGPA :");
                                students.get(index).cgpa = in.nextDouble();
                                break;

                            case 5:
                                System.out.println("#new courses id, 0 to end");
                                int k = in.nextInt();
                                students.get(i).courses.clear();
                                while (k != 0) {
                                    students.get(i).courses.add(k);
                                    k = in.nextInt();
                                }
                                break;

                            case 0:
                                break;
                            default:
                                System.out.println("#Try again.");
                        }
                        System.out.println("\n-------------------------------------\n");
                        System.out.println("#What are you want update?");
                    System.out.print("1. First name"
                            + "\n2. Last name"
                            + "\n3. Roll number"
                            + "\n4. CGPA"
                            + "\n5. Course id"
                            + "\n0. exit"
                            + "\n# Enter your choice :");
                        x = in.nextInt();
                    }
                    System.out.println("\n** New Student details :");
                    System.out.println(students.get(i));
                    flag = false;
                }

            }

            if (flag == true) {
                System.out.println("** This roll number is not exist **");
                System.out.println("#Try again ?(y/n)");
                String m = in.next();
                if (m.equalsIgnoreCase("y")) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }

    }
}
