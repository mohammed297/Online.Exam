package student.information;

import java.util.ArrayList;
class Student {
    String firstName;
    String lastName;
    int rollNumber;
    double cgpa;
    ArrayList<Integer> courses=new ArrayList<>();

    public Student() {

    }
    public Student(String firstName, String lastName, int rollNumber, double cgpa,ArrayList<Integer> course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
        this.courses=course;
    }
    public String toString(){
        return "First name = "+firstName+"\nLast name = "+lastName+"\nRoll Number = "+rollNumber+"\nCGPA = "+cgpa+"\nCourses = "+courses;
    }



}