/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q17)Write a java program that takes three positive integers as
 * command-line arguments and prints true if any one of them is greater than or equal to the sum of the other two and
 * false otherwise.
 */
package labAssignment02;

public class Question17 {

	public static void main(String[] args) {
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		boolean res=((a+b)>=c)||((b+c)>=a)||((a+c)>=b);
		System.out.println(res);
	}

}
