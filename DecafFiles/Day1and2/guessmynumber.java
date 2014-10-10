import java.util.Scanner;
public class guessmynumber
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Exercise 15 Guess my number

double numberToGuess = Math.abs(1000 * Math.random());
int numberOfGuesses = 0;
int guess = 0;
int correct= Math.round(numberToGuess);

System.out.println("Try to guess my number!");


while(true){
	numberOfGuesses = numberOfGuesses +1;
	System.out.println("Please tell me a number: ");
	guess = Integer.parseInt(System.console().readLine());
	if(guess==correct){
		System.out.println("Correct!");
		System.out.println("You needed " + numberOfGuesses + " guesses");
		break;
	}else if(guess > correct){
		System.out.println("No! My number is lower.");
	}else if(guess < correct){
		System.out.println("No! My number is higher.");
	}			
}
}}

