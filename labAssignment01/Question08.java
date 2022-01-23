/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q)
 */
package labAssignment01;

public class Question08 {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		System.out.println("Values Exchanging");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}
}