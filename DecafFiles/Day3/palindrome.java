import java.util.Scanner;
public class palindrome
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 3 - Exercise 8 - Palindrome

String str = "";
String checker = "";

System.out.println("Please enter some text: ");
str = System.console().readLine();

int position = 1;

while(position<=str.length()){
	checker = checker + str.charAt(str.length()-position);
	position++;
}

if(str.equals(checker)){
	System.out.println(str + " is a palindrome.");
}
else{
	System.out.println(str + " is not a palindrome.");
}
}}

