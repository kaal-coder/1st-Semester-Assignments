/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject			:ICP (CSE 1001)
 * Problem Description	(lab assignment04,Q9)If we list all the natural numbers below 10 that are multiples 
 * of 3 or 5, we get 3, 5, 6 and 9.The sum of these multiples is 23. Write a java program to find the sum of
 * all the multiples of 3 or 5 below 1000.
 */
package labAssignment04;
public class Question09 {
public static void main(String[] args) {
		int i,sum=0;
		for(i=1;i<1000;i++)
		{
		if(i%3==0||i%5==0)
		sum+=i;
		}
		System.out.println("Sum of multiples of 3&5 below 1000 is= "+sum);
	}
}