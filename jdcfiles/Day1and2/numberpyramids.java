import java.util.Scanner;
public class numberpyramids
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Exercise 12 -Number pyramids
int x = 0;
String s = "";
while (x<7){
	x=x+1;
	s = "";
	while(s.length()<x){
		s=s + Integer.toString(x);
		}
	System.out.println(s);
	}
}}

