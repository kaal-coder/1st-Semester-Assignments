package labAssignment05;
import java.util.*;
public class Question09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,n,f=1;
		System.out.println("Enter the value of x");
		x=sc.nextInt();
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		f=n;
		}
		double term=((Math.pow(x, n))/n);
		System.out.println(term);
		}
	}