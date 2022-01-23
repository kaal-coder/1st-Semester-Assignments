/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject			:ICP (CSE 1001)
 * Problem Description	(lab assignment04,Q7)Write a java program that takes an integer N as a command-line 
 * argument, uses Math.random() to print N uniform random values between 0 and 1, and then prints their 
 * average value.
 */
package labAssignment04;
public class Question07 {
	public static void main(String[] args) {
		int n,i;
		double r,s=0,avg=0;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
		r=Math.random();
		System.out.println("Random no."+i+"="+r);
		s+=r;
		}
		System.out.println("Sum of the random numbers="+s);
		avg=s/n;
		System.out.println("average="+avg);
	}
}