import java.util.Scanner;
public class optimusprime
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Exercise 17 Optimus Prime - outputs the closest prime number to the integer entered by user (outputs both if there are 2 at equal distance)

System.out.println("Please enter a number: ");
int input = Integer.parseInt(System.console().readLine());

//first check if the input is a prime

int position = 2;
boolean isPrime = true;
while(position<input){
	if(input%position==0){
		System.out.println(input + " is not a prime number.");
		isPrime = false;
		break;
	}
	else{
		position++;
	}
}

if(isPrime==true){
	System.out.println(input + " is a prime number.");
}

// next find the nearest prime number above the input

int divisorUp = 2;
int distanceUp = 0;
int nearestPrimeAbove = 0;
int inputUp = input;
boolean upPrimeFound = false;
boolean isNotPrime = false;

while(upPrimeFound = false){
	divisorUp = 2;
	inputUp = inputUp +1;
	isNotPrime = false;
		while(divisorUp<inputUp){
			if(inputUp%divisorUp==0){
				isNotPrime = true;
				break;
			}
			else{
				divisorUp++;
			}
		}
	if(isNotPrime==false){
		upPrimeFound = true;
		nearestPrimeAbove = inputUp;
		distanceUp = inputUp - input;
		break;
	}

}


int divisorDown = 2;
int distanceDown = 0;
int nearestPrimeBelow = 0;
int inputDown = input;
boolean downPrimeFound = false;
boolean downIsPrime = false;

while(downPrimeFound = false){
	divisorDown = 2;
	inputDown = inputDown -1;
	downIsPrime = false;
		while(divisorDown<inputDown){
			if(inputDown%divisorDown==0){
				downIsPrime = true;
				break;
			}
			else{
				divisorDown++;
			}
		}
	if(downIsPrime==false){
		downPrimeFound = true;
		nearestPrimeBelow = inputDown;
		distanceDown = input - inputDown;
		break;
	}

}

if(distanceDown==distanceUp){
	System.out.println("The nearest prime numbers to: " + input + "are: " + inputUp + " and " + inputDown); 
}

else if(distanceUp<distanceDown){
	System.out.println("The nearest prime number to: " + input + "is: " + inputUp);
}

else if(distanceDown<distanceUp){
	System.out.println("The nearest prime number to: " + input + "is: " + inputDown);
}
	
}}

