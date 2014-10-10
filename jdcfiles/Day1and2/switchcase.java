import java.util.Scanner;
public class switchcase
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println ("Please choose an option:" );
System.out.println ("For ¡¯Checking you balance¡¯, please enter 1" );
System.out.println ("For ¡¯Purchases¡¯, please enter 2");
System.out.println ("For ¡¯Refunds¡¯, please enter 3");
System.out.println ("For ¡¯Queries about the warranty¡¯, please enter 4");
System.out.println ("For ¡¯Returning faulty goods¡¯, please enter 5");
System.out.println ("For any other query, please enter 0");
String s = System.console().readLine();
Integer choice = Integer.parseInt(s);
switch (choice) {
case 1:
System.out.print("check balance");
break;
case 2:
System.out.print("purchases");
break;
case 3:
System.out.print("process refunds");
break;
case 4:
System.out.print("check queries");
break;
case 5:
System.out.print("return faulty goods");
break;
default:
System.out.print("talk to operator");
break;
}
}}

