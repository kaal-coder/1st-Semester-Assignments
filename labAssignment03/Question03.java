/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment03,Q3)Input an integer through the keyboard.
 *  Write a java program to find out whether it is an odd number or even number.
 */
package labAssignment03;
import java.util.*;
public class Question03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		if(n%2==0)
		System.out.println("Even number");
		else
		System.out.println("Odd number");
		}
		}