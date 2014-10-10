import java.util.Scanner;
public class upto1000
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Exerise 14 - Up to 1000 primes

int primecheck = 3;    //Program will check whether this number is prime or not
int divisor = 2;     //If primecheck divisable by divisor, then not prime. increase divisor by 1 each time through loop
int primeornot = 0; //1= prime 0=not prime
int total = 0; // increments by 1 each time a prime is found

System.out.println(2);

while(total<1000){
	primeornot = 0;
	divisor = 2;
	
	while(divisor < primecheck){
		if (primecheck % divisor == 0){	
			primeornot = 1;
			break;
		}else{
			divisor = divisor + 1;
		}
	}
	
	if(primeornot == 0){
		System.out.println("prime number" + total +": " + primecheck);
		total = total +1;
	}
	
	primecheck = primecheck + 1;
}
}}

