import java.util.Scanner;

// Unit 2, Topic 2.1, Classes and Objects, 11/05/2021, v.0.3

public class Student {
    // these are instance variable
    private int studentID;
    private int gradeLevel;
    private double gradePointAge;
    private String studentName;

    // creating a constructor
    public Student() {
        this.studentID = 0;
        this.gradeLevel = 0;
        this.gradePointAge = 0.0;
        this.studentName = "";   
    }
    // value constructor
    public Student(int studentID, int gradeLevel, double GPA, String studentName) {
        this.studentID = studentID;
        this.studentName = gradeLevel;
        this.gradePointAge = GPA;
        this.studentName = studentName;
    }
    public Student (int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.gradeLevel = 9;
        this.gradePointAge = 4.0;
    }
public static void main(String[]args); {
   
} 

     //parameters and arguments
    public static void assignLunch(int gradeLevel) {
    String lunchPeriod;

        if (gradeLevel == 9){
            lunchPeriod = "Fourth Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }else if (gradeLevel == 10){
            lunchPeriod = "Third Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }else if (gradeLevel == 11){
            lunchPeriod = "Second Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }else {
            lunchPeriod = "First Lunch or Off-Campus Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }
 
    }    
}

