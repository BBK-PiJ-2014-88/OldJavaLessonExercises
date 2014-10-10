import java.util.Scanner;
public class text2number
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 3 - Exercise 11 - Text2number

String str = "";
String output = "";
System.out.println("Please enter some text: ");
str = System.console().readLine();
int position = 0;

while(position< str.length()-1){
	if(str.charAt(position).equals(",")||str.charAt(position).equals(".")){	
		position++;
	}
	else{
		output = output+ str.charAt(position);
		position++;
		System.out.println(output);
	}
}
}}

