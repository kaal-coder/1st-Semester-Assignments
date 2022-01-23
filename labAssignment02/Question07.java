/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q07)Write a java program that prompts the user to enter the side of a hexagon and displays its area. The formula for computing the area of a hexagon is
𝐴𝑟𝑒𝑎=3√32𝑥2
where s is the length of a side.
 */
package labAssignment02;
import java.util.Scanner;
public class Question07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the side:");
		  double s = input.nextDouble();
		  double area = (3 * Math.sqrt(3) / 2) * Math.pow(s, 2);
		  System.out.print("The area of the hexagon is " + area);
		 
	}
}