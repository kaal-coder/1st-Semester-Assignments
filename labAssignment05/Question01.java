package labAssignment05;
import java.util.*;
public class Question01 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n,i;
			System.out.println("Enter the value of n:");
			n=sc.nextInt();
			for(i=0;i<=n;i++)
			{
			float r=(float) Math.pow(2,i);
			System.out.println("2^"+i+"="+r);
			}
	}
}