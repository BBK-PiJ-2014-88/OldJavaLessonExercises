import java.util.Scanner;
public class linenumbersmodification
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 3 - Exercise 4 - Line to column Modification 2 - print words not letters 

String input = "";
System.out.println("Please enter some text: ");
input = System.console().readLine();
int position = 0;
String wordToPrint = "";


while(position < input.length()){
	if(input.substring(position,position+1).equals(" ")){
		System.out.println(wordToPrint);
		wordToPrint = "";
	}
	else{	
		wordToPrint = wordToPrint + input.substring(position,position+1); 
	}
	position++;
	
}
System.out.println(wordToPrint);
}}

