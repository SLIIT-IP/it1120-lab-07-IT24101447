import java.util.Scanner;

public class IT24101447Lab7Q1A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declaring variables

        double average;
        String grade;

        // Input marks for the four subjects

        System.out.print("Enter Subject Mark 1: ");
        int mark1 = sc.nextInt();
        
        System.out.print("Enter Subject Mark 2: ");
        int mark2 = sc.nextInt();
        
        System.out.print("Enter Subject Mark 3: ");
        int mark3 = sc.nextInt();
        
        System.out.print("Enter Subject Mark 4: ");
        int mark4 = sc.nextInt();
        
        // Calculate the average

        average = (mark1 + mark2 + mark3 + mark4) / 4.0;
        
        // Determine the grade based on average

        if (average >= 75 && average <= 100) 
           {
            grade = "Distinction";
        } 

        else if (average >= 50 && average < 75) 
        {
            grade = "Credit";
        } 

        else 
         {
            grade = "Fail";
        }

        // Output the average and the overall grade

        System.out.println("Average is: " + average);
        System.out.println("Overall Grade is: " +grade);}
}