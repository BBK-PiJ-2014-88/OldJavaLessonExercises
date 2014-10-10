import java.util.Scanner;
public class countingletters
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 3 Exercise 5 - Counting Letters

String str = "";
String letter = "";
int position = 0;
int counter = 0;

System.out.println("Please enter some text: ");
str = System.console().readLine();
System.out.println("Please enter a letter: ");
letter = System.console().readLine();

while(position<str.length()){
	if(str.substring(position,position+1).equals(letter)){
		counter++;
	}
	position++;
		
}

System.out.println("The number of "+ letter + "  in your text was: " + counter );
}}

