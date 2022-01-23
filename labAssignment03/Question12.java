/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment03,Q12)Write a java program that prompts the user to enter three 
 * integers and display the integers in non-decreasing order.
 */
package labAssignment03;
import java.util.Scanner;
public class Question12 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max=Math.max(a,Math.max(b,c));
		int min=Math.min(a,Math.min(b,c));
		int median=(a+b+c)-max-min;
		System.out.println(min + " " + median + " " + max);
		sc.close();
	}
}