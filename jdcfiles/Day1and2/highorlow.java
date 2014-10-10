import java.util.Scanner;
public class highorlow
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Exercise 10 - You say high, i said low...

String result = "Yes";
int entryup = 0;
int entrydown = 0;
int compare = 0;
int compare2 = 0;
int x=0;



System.out.println("Please enter a number: ");
int input = Integer.parseInt(System.console().readLine());
if(input==-1){
System.out.print("No numbers were entered");
x=1;
}

if(x==0){
System.out.println("Please enter another number: ");
compare = Integer.parseInt(System.console().readLine());
	if(compare == input+1){
		entryup = 1;
		}
	else if(compare == input-1){
		entrydown = 1;
		}
	else{result = "No";
	entryup=1;
	}
	
}



if(entryup==1){
while(true){
	compare2 = Integer.parseInt(System.console().readLine());
	if(compare2==-1){
		break;
		}
	else if(compare2!=compare +1){
		result = "No";
		}
	compare = compare2;
}
}

else if(entrydown==1){
while(true){
	compare2 = Integer.parseInt(System.console().readLine());
	if(compare2==-1){
		break;
		}
	else if(compare2!=compare -1){
		result = "No";
		}
	compare = compare2;
}


}


if (x==0){
System.out.println(result);
}
}}

