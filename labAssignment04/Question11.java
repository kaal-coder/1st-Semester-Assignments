/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject			:ICP (CSE 1001)
 * Problem Description	(lab assignment04,Q11)`Write a java program to find the difference between the sum 
 * of the squares of the first one hundred natural numbers and the square of the sum.
 */
package labAssignment04;
public class Question11 {
	public static void main(String[] args) {
		int i,sum1=0,sum2=0,diff=0,s=0;
		for(i=1;i<=10;i++)
		{
		sum1+=i*i;
		sum2+=i;
		}
		s=sum2*sum2;
		diff=s-sum1;
		System.out.println("The sum of squares of the integers= "+sum1);
		System.out.println("The square of the sum of the integers= "+s);
		System.out.println("The difference of sum1 and sum2 is= "+diff);
	}
}