/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q16)Write a java program that prints the sum of two random integers between 1 and 6
 *  (such as you might get when rolling dice).
 */
package labAssignment02;
import java.lang.* ;
public class Question16 {

	public static void main(String[] args) {
	int SIDES = 6;
	int a = 1 + (int) (Math.random() * SIDES);
	int b = 1 + (int) (Math.random() * SIDES);
	int sum = a + b;	        
	System.out.println(sum);
		   
	}

}
	
