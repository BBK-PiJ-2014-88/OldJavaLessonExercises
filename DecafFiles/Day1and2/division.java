import java.util.Scanner;
public class division
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Exercise 6 Division
int total = 0;

System.out.println("Please enter a number: ");
int numoriginal = Integer.parseInt(System.console().readLine());
int numA = numoriginal;

System.out.println("Please enter another number: ");
int numB = Integer.parseInt(System.console().readLine());

while(numA>=numB){
	numA = numA-numB;
	total = total+1;
	}
System.out.println(numoriginal + " divided by " + numB + " is " + total + " remainder: " + numA);


}}

