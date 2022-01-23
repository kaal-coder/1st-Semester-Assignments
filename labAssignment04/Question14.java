package labAssignment04;
import java.util.*;
public class Question14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	double s=0,res=0;
	System.out.println("Enter the value of n");
	n=sc.nextInt();
	int x=0,v=1;
	while(v<=n)
	{
	x=v;
	v=v*2;
	}
	System.out.println(x);
	}
}