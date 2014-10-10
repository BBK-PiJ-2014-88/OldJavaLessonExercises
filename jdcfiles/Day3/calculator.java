import java.util.Scanner;
public class calculator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 3 Exercise 1 - Calculator 
double first = 0;
double second = 0;
int operatorChosen = 0;

System.out.println("Please enter a number: ");
first = Double.parseDouble(System.console().readLine());
System.out.println("Please enter a second number: ");
second = Double.parseDouble(System.console().readLine());

System.out.println("Please insert the number corresponding to the operation you would like to use");
System.out.println("Addition = 1");
System.out.println("Subtraction = 2");
System.out.println("Multiplication = 3");
System.out.println("Division = 4");

operatorChosen=Integer.parseInt(System.console().readLine());

switch(operatorChosen){
case 1:
	System.out.println(first + second);
	break;
case 2:
	System.out.println(first - second);
	break;
case 3:
	System.out.println(first*second);
	break;
case 4:
	System.out.println(first/second);
	break;
default:
	System.out.println("That is not a valid operator");
	break;
}
	
}}

