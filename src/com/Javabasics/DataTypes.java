package com.Javabasics;
import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter int :");
	        int num1 = scanner.nextInt();
	        System.out.println("Number is:"+num1);

	        System.out.println("Enter long :");
	        long num2 = scanner.nextLong();
	        System.out.println("Number is :"+num2);

	        System.out.println("Enter byte :");
	        byte num3 = scanner.nextByte();
	        System.out.println("Number is:"+num3);

	        System.out.println("Enter short:");
	        short num4 = scanner.nextShort();
	        System.out.println("Number is:"+num4);

	        System.out.println("Enter float:");
	        float f1 = scanner.nextFloat();
	        System.out.println("Number is:"+f1);

	        System.out.println("Enter double:");
	        double d1 = scanner.nextDouble();
	        System.out.println("Number is :"+d1);

	        System.out.println("Enter char:");
	        char c1 = scanner.next().charAt(0);
	        System.out.println("Character is:"+c1);

	        System.out.println("Enter string:");
	        String s1 = scanner.next();
	        System.out.println("String is :"+s1);


	}

}
