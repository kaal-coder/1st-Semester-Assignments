package labAssignment05;
import java.util.*;
public class Question07 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of terms :");
         int n = sc.nextInt();
         int a = 1;
         int sum = 0;
         for (int i=1 ; i<=n ; i+=2)
         {
             sum = sum + (a*i);
             a = a * (-1);
         }
         System.out.println("Result = " + sum);
		}
}