/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q07)Write a java program to exchange the values of two variables of integer type A
and B using third temporary variable C.
 */
package labAssignment01;

public class Question07 {

	public static void main(String[] args) {
		int A= 10;
		int B=100;    
		System.out.println("The values of numbers before swapping are a=" + A + " and b=" + B );
		int C=A;
		A=B;
		B=C;
		System.out.println("The values of A and B after swaping are A="+A+" B="+B);
	}

}
