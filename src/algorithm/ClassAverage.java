package algorithm;

import java.util.Scanner;

public class ClassAverage {
	public static void main(String[] arg) 
	{
			
	//create Scanner to obtain input from command window
	Scanner input = new Scanner(System.in);
	
	//initialization phase
	int total = 0;
	int gradeCounter = 1;
	
	// processing phase uses counter-controlled repetition
	while  (gradeCounter<= 10) // loop 10 times
	{
		System.out.print("Enter grade: ");  // prompt
		int grade = input.nextInt();
		total = total + grade; // add grade to total
		gradeCounter = gradeCounter + 1; // increment counter by 1
	}
	
	// termination phase
	int average = total / 10; // integer division yoelds integer result
	
	// display total and average and average of grades
	System.out.printf("%nTotal of all 10 grades is %d%n", total);
	System.out.printf("Class average is %d%n", average);
 }
	
}// end class classAverage
