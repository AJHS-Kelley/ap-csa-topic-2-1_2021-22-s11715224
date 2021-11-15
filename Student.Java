import java.util.Scanner;

// Unit 2, Topic 2.1, Classes and Objects, 11/15/2021, v.0.4

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
        //hello there!...general Kenobi codestuff







        
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

    public static void assignLunchMultiple(double gradePointAge, int gradeLevel) {
        String lunchPeriod;
        // and, or, not, -- bollean operators
        //&& -- and 
        // || -- or
        //! -- not



        if (gradeLevel == 9 || gradePointAge <= 1.5){
            lunchPeriod = "Fourth Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }else if (gradeLevel == 10 && gradePointAge > 2.0){
            lunchPeriod = "Third Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }else if (gradeLevel == 11 && (gradePointAge != 0.0){
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

