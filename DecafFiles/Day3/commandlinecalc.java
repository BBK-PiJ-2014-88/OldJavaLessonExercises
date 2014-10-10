import java.util.Scanner;
public class commandlinecalc
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 3 Exercise 2 - Command-line calculator 

double num1 = 0;
double num2 = 0;
String operator = "";
String input = "";
int position = 0;

System.out.println("Please enter a mathematical operation with 2 operands: ");
input = System.console().readLine();

while(position < input.length() - 1){
	if(input.substring(position,position+1).equals("+") || 
	   input.substring(position,position+1).equals("-") || 
	   input.substring(position,position+1).equals("/") || 
	   input.substring(position,position+1).equals("*")) {
		operator = input.substring(position,position+1);
		break;
	}
	else {
		position++;
	}
}

if (position == input.length() - 1) {
	System.out.println("Input was not correct. Please start over again.");
} else {
	String operand1 = input.substring(0,position);
	System.out.println("First operand is " + operand1);
	num1 = Double.parseDouble(operand1);
	String operand2 = input.substring(position+1,input.length());
	System.out.println("Second operand is " + operand2);
	num2 = Double.parseDouble(operand2);
	if(operator.equals("+")){
		System.out.println(num1 + num2);
	}
	else if(operator.equals("-")){
		System.out.println(num1 - num2);
	}
	else if(operator.equals("*")){
		System.out.println(num1*num2);
	}
	else if(operator.equals("/")) {
		System.out.println(num1/num2);
	}
}
}}

