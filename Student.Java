import java.util.Scanner;

// Unit 2, Topic 2.1, Classes and Objects, 11/18/2021, v.0.9

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
        this.gradeLevel = gradeLevel;
        this.gradePointAge = GPA;
        this.studentName = studentName;
    }
    public Student (int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.gradeLevel = 9;
        this.gradePointAge = 4.0;
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
        }else if (gradeLevel == 11 && (gradePointAge != 0.0)) {
            lunchPeriod = "Second Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }else {
            lunchPeriod = "First Lunch or Off-Campus Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }
    }


    public static void mathPractice() {
        int x;
        int y;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please print out an integer.\n");
        x = myScanner.nextInt();
        System.out.println("please print out an integer.\n");
        y = myScanner.nextInt();
        System.out.println(Math.min(x, y));

        int lowest;
        lowest = Math.min(x,y);
        System.out.println(lowest);

        System.out.println("we will use Math.pow() to calculate. \n");
        System.out.println(Math.pow(x, y));

        double exponents;
        exponents = Math.pow(x, y);
        System.out.println(exponents);

        System.out.println("next we'll use Math.randon().\n");
        System.out.println(Math.random());

        double percentage;
        percentage = (Math.random() * 100);
        System.out.print("there is a ");
        System.out.print(percentage);
        System.out.println("% chance of rain today");


    }

    public static double getGPA() {
        int grade0, grade1, grade2;

        grade0 = 24;
        grade1 = 42;
        grade2 = 5;

        double fakeGPA;
        fakeGPA = (grade0 + grade1 + grade2) / 3;

        return fakeGPA;

    }
    public static void main(String[] args) {
      

        double realGPA;
        realGPA = -1.0;
        System.out.println(realGPA);
        realGPA = getGPA();
        System.out.println(realGPA);



    }


}

