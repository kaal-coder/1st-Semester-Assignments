package labAssignment04;
import java.util.*;
public class Question13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,r=0,s=0;
		System.out.println("Enter the number");
		n=sc.nextInt();
		int n1=n;
		while(n>0)
		{
		r=n%10;
		s+=r;
		n/=10;
		System.out.println(r+" ");
		}if(s%9==0)
		System.out.println(n1+" is divisible by 9");
		else
		System.out.println(n1+" is not divisible by 9");
	}
}