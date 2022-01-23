/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q17)Write a java program that prompts the user to enter an integer and determines whether it is 
 * divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 */
package labAssignment03;
import java.util.Scanner;
public class Question17 {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter an integer:");
		  int n = sc.nextInt();
		  boolean d5 = false;
		  boolean d6 = false;
		  if (n % 5 == 0) { d5 = true;}
		  if (n % 6 == 0) {d6 = true;}
		  System.out.println("Is " +n+ " divisible by 5 and 6? " + (d5 && d6));
		  System.out.println("Is " +n+ " divisible by 5 or 6? " + (d5 || d6));
		  System.out.println("Is "+n+" divisible by 5 or 6, but not both? " + (d5 ^ d6));	 
	}

}
