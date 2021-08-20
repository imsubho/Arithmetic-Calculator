package calculator;

import java.util.Scanner;

public class calc {

   public static void main(String[] args) {

      double n1=0.0, n2=0.0;
      char operator='\0';

    
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      n1 = scan.nextDouble();
      n2 = scan.nextDouble();

     
      System.out.println("Available Operators"
		+ "are::  (+ - * / % )");
      System.out.print("Enter operator: ");
      operator = scan.next().charAt(0);

      
      switch(operator) {

         case '+':
            System.out.println("Result = "+ (n1+n2));
		break;

	 case '-':
	    System.out.println("Result = "+ (n1-n2));
		break;

	 case '*':
	    System.out.println("Result = "+ (n1*n2));
		break;

	 case '/':
	    System.out.println("Result = "+ (n1/n2));
		break;

	 case '%':
	    System.out.println("Result = "+ (n1%n2));
		break;

	 default:
	    System.out.println("Invalid operator");
      } 
      scan.close();

   } 
}