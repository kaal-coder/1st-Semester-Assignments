/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q15)Write a java program that prompts the user to enter a point (x, y) and checks whether the point 
 * is within the circle centered at (0, 0) with radius 10. For example, (4, 5) is inside the circle and
 * (9, 9) is outside the circle,
(Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 The formula for computing the distance is √(𝑥2−𝑥1)2+(𝑦2−𝑦1)2 .Test your program to cover all cases.)
 */
package labAssignment03;
import java.util.Scanner;
public class Question15 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a point with two coordinates: ");
double x = input.nextDouble();
double y = input.nextDouble();
boolean withinCircle =	(Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);
System.out.println("Point (" + x + ", "+ y + ") is " + ((withinCircle) ? "in " : "not in ") + "the circle"); 
}
}