import java.util.Scanner;
public class linetocolumn
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 3 - Exercise 4 - Line to column

System.out.println("Please enter some text: ");
String text = System.console().readLine();
int position = 0;

while(position < text.length()){
	System.out.println(text.substring(position,position+1)); //don't understand why position+1 works for last letter
	position++;



}
}}

