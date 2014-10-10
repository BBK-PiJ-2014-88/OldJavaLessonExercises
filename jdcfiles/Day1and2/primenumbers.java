import java.util.Scanner;
public class primenumbers
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//exercise 4 - prime numbers
System.out.println("Please enter a number: ");
int max = Integer.parseInt(System.console().readLine());
int test = 2;
int result = 1;
while (test<max){
	if (max%test==0){
		System.out.println(max + " is not a prime number");
		result = 0;
		break;
		}
	else{
		test = test + 1;
		}
	}
	
if (result==1){
	System.out.println(max + " is a prime number");
	}
}}

