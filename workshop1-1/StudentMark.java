
/**
 * Write a description of class StudentMark here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner; 

public class StudentMark
{

    
    public static void main(String[] args) {
        
        int numberOfStudents = 5;
        float[] marks = new float[numberOfStudents];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give marks for 5 students: ");
        
        for(int i=0; i< numberOfStudents; i++) {
            //check for valid marks - check if the input mark is between 0 and 30
            float temp = scanner.nextFloat(); 
            
            // if (temp < 0 || temp > 30) {
                // System.out.println("Invalid marks, please enter the mark again");
            // }
            
            
            marks[i] = temp;
            
            
        }
        
        
        System.out.println("Entered marks: ");
        for(int j=0; j<numberOfStudents; j++ ) {
            System.out.println(marks[j]);
        }
        
        
        //mean = sum of all marks / number of marks
        float total = 0;
        
        for (int i=0; i < numberOfStudents; i++) {
            total  = total + marks[i];
        }
        
        float mean = total / numberOfStudents;
        
        float summedDiff = 0;
        for (int i=0; i < numberOfStudents; i++) {
            summedDiff = summedDiff + (marks[i] - mean)*(marks[i] - mean); 
        }
        
        summedDiff = summedDiff / numberOfStudents;
        
        //float squareRootSummedDiff = take a power (exponent) of 0.5
        
    }
}
