package labAssignment05;
import java.util.Scanner;
public class Question16 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int rev=0;
	while(n>0)
	{
	int rem=n%10;
	rev=(rev*10)+rem;
	n/=10;
	}
	System.out.println("Reverse is = "+rev);
	}
}