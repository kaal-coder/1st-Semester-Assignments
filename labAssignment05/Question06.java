package labAssignment05;
import java.util.*;
public class Question06 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        double n = sc.nextDouble();
        double b = 0;
        System.out.println("Enter the terms one by one:");
        for (int i=1; i<=n ; i++)
        {
            double a = sc.nextDouble();
            b = b + (1/a);
        }
        double hm = (n)/(b);
        System.out.println("Harmonic mean =" + hm);
		}
	}