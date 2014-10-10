import java.util.Scanner;
public class palindromecreator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 3 - Exercise 9 - Palindrome creator

String str = "";
String reversedstr = "";

System.out.println("Please enter some text: ");
str = System.console().readLine();

int position = 1;

while(position<=str.length()){
	reversedstr = reversedstr + str.charAt(str.length()-position);
	position++;
}

System.out.println(str + reversedstr);
}}

