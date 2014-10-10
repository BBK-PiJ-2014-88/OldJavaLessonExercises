import java.util.Scanner;
public class maximising
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Exercise 8 - Maximising
int input = 0;
int highestnumber = 0;

while(input!= -1){
System.out.println("Please enter a sequence of positive numbers, input -1 to finish: "  );
input = Integer.parseInt(System.console().readLine());
	if (input>highestnumber){
		highestnumber = input;
		}

}

System.out.print("The highest number in the sequence was: " + highestnumber) ;
}}

