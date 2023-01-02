package com.Javabasics;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int percentage;
		System.out.println("Enter percentage of student:");
		Scanner scanner = new Scanner(System.in);

		percentage=  scanner.nextInt();

		if(percentage>=70 && percentage<=100)
		{
			System.out.println("FCD");
		}

		else if(percentage>=60 && percentage<70)
		{
			System.out.println("First class");
		}

		else if(percentage>=50 && percentage<60)
		{
			System.out.println("Second class");
		}

		else if(percentage>=35 && percentage<50)
		{
			System.out.println("Just Pass");
		}

		else if(percentage>100 || percentage<=0 )
		{
			System.out.println("Invalid Input");
		}

		else
		{
		System.out.println("Fail");	
		}

		
	}

}
