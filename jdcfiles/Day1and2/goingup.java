import java.util.Scanner;
public class goingup
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Exercise 9 - Going up
int compare = 0;
String result = "Yes";


System.out.println("Please enter a number: ");
int input = Integer.parseInt(System.console().readLine());
if(input==-1){
System.out.print("No numbers were entered");
}



while(true){
compare = Integer.parseInt(System.console().readLine());
if (compare==-1){
break;
}
else if(compare!= input+1){
result = "No";
}

input = compare;

 
}



System.out.println(result);
}}

