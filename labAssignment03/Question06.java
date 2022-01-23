/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment03,Q6)𝑎𝑥+𝑏𝑦=𝑒 𝑐𝑥+𝑑𝑦=𝑓 𝑥=𝑒𝑑−𝑏𝑓𝑎𝑑−𝑏𝑐 𝑦=𝑎𝑓−𝑒𝑐𝑎𝑑−𝑏𝑐
Write a java program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that “The equation has no solution.”
 */
package labAssignment03;
import java.util.Scanner;
public class Question06 {
public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a, b, c, d, e, f: ");
	        double a = sc.nextDouble();
	        double b = sc.nextDouble();
	        double c = sc.nextDouble();
	        double d = sc.nextDouble();
	        double e = sc.nextDouble();
	        double f = sc.nextDouble();
	       if((a*d - b*c) == 0)
	        {
	            System.out.println("The equation has no solution.");
	        }
	        else
	        {
	            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
	            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
	            System.out.printf("x is " +x+" and y is " + y );
	        }
	}
}