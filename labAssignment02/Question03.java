/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q03)Write a java program that reads a number in feet, converts it to meters, and
 * displays the result. One foot is 0.305 meter.
 */
package labAssignment02;
import java.util.Scanner;
public class Question03 {

public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double METERS_PER_FOOT = 0.305;
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		double meters = feet * METERS_PER_FOOT;
	System.out.println(feet + " feet is " + meters + " meters");
	
	}

}
