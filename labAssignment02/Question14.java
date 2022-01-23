/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q14)Write a java program that takes two positive integers as command-line arguments and prints true if either evenly
 * divides the other.
 */
package labAssignment02;

public class Question14 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean res = (a%b==0 || b%a==0);
        System.out.println("result = " + res);
	}

}
