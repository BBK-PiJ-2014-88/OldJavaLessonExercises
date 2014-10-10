import java.util.Scanner;
public class naivesorting
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//EXERCISE 7 Naive sorting
System.out.println("Please enter a number: ");
int num1=Integer.parseInt(System.console().readLine());

System.out.println("Please enter another number: ");
int num2=Integer.parseInt(System.console().readLine());

System.out.println("Please enter another number: ");
int num3=Integer.parseInt(System.console().readLine());

int largest = 0;
int middle = 0;
int lowest = 0;

if(num1>num2){
	if(num1>num3){
		largest = num1;
			if(num3>num2){
				middle = num3;
				lowest = num2;
				}
			else{
				middle = num2;
				lowest = num3;
				}
		}
	else{
		largest = num3;
			if(num1>num2){
				middle = num1;
				lowest = num2;
				}
			else{
				middle = num2;
				lowest = num1;
				}
		}
		}

else{
	if(num2>num3){
		largest = num2;
			if (num3>num1){
				middle = num3;
				lowest = num1;
				}
			else{
				middle = num1;
				lowest = num3;
				}
			}
	else{
		largest = num3;
			if (num1>num2){
				middle = num1;
				lowest = num2;
				}
			else{
				middle = num2;
				lowest = num1;
				}
			}
			 } 
	
			
System.out.println("Lowest: " + lowest + " Middle: " + middle + " Highest: " + largest);

   	
}}

