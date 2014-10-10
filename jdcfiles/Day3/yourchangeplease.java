import java.util.Scanner;
public class yourchangeplease
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 3 Exercise 3 - Your change, please
//Takes in purchase cost and amount paid. Outputs change to be given in notes and coins.
//program having trouble for small pence. 

double purchaseCost = 0;
double amountPaid = 0;

System.out.println("Please enter the cost of purchase: ");
purchaseCost = Double.parseDouble(System.console().readLine());
System.out.println("Please enter the amount paid by you: ");
amountPaid = Double.parseDouble(System.console().readLine());

double change = (amountPaid - purchaseCost)+0.001;
System.out.println("Change: " + change);

int fiftyPoundNotes = 0;
int twentyPoundNotes = 0;
int tenPoundNotes = 0;
int fivePoundNotes = 0;
int twoPoundCoin = 0;
int onePoundCoin = 0;
int fiftyPenceCoin = 0;
int twentyPenceCoin = 0;
int tenPenceCoin = 0;
int fivePenceCoin = 0;
int twoPenceCoin = 0;
int onePenceCoin = 0;

while(Math.abs(change-0.01)> 10E-3){
	if(change - 50 >=0){
		change = change - 50;
		fiftyPoundNotes++;
	}
	else if(change - 20>=0){
		change = change - 20;
		twentyPoundNotes++;
	}
	else if(change - 10>=0){
		change = change - 10;	
		tenPoundNotes++;
	}
	else if(change - 5>=0){
		change = change - 5;	
		fivePoundNotes++;
	}
	else if(change - 2>=0){
		change = change -2;
		twoPoundCoin++;
	}
	else if(change - 1>=0){
		change = change -1;
		onePoundCoin++;
	}
	else if(change - 0.5>=0){
		change = change -0.5;
		fiftyPenceCoin++;
	}
	else if(change - 0.2>=0){
			twentyPenceCoin++;
	}
	else if(change - 0.1>=0){
		change = change - 0.2;
		tenPenceCoin++;
	}
	else if(change - 0.05>=0){
		change = change - 0.05;
		fivePenceCoin++;
	}
	else if(change - 0.02>=0){
		change = change - 0.02;
			twoPenceCoin++;
	}
	else if(change - 0.01>=0){
		change = change - 0.01;
		onePenceCoin++;
	}
	System.out.println("Current change: " + change);
}

System.out.println("fiftyPoundNotes: " + fiftyPoundNotes);
System.out.println("twentyPoundNotes: " + twentyPoundNotes);
System.out.println("tenPoundNotes: " + tenPoundNotes);
System.out.println("fivePoundNotes: " + fivePoundNotes); 
System.out.println("twoPoundCoin: " + twoPoundCoin);
System.out.println("onePoundCoin: " + onePoundCoin);
System.out.println("fiftyPenceCoin: " + fiftyPenceCoin); 
System.out.println("twentyPenceCoin: " + twentyPenceCoin); 
System.out.println("tenPenceCoin: " + tenPenceCoin); 
System.out.println("fivePenceCoin: " + fivePenceCoin);
System.out.println("twoPenceCoin: " + twoPenceCoin); 
System.out.println("onePenceCoin: " + onePenceCoin);

}}

