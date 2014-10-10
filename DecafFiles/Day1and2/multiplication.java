import java.util.Scanner;
public class multiplication
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//exercise 5 - multiplication 
System.out.println("Please enter a number: ");
int num1 = Integer.parseInt(System.console().readLine());
System.out.println("And please enter another number: ");
int num2 = Integer.parseInt(System.console().readLine());
int total = 0;
while(num1>0){
	total = total + num2;
	num1 = num1 -1;
	}
System.out.print("The total is: " + total);
}}

