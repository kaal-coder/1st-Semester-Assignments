/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q04)Write a java program that reads an integer between 0 and 1000 
 * and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14.
 */
package labAssignment02;
import java.util.Scanner;
public class Question04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n, x, sum=0;
		System.out.println("Enter number between 0 and 1000");
		n=sc.nextInt();
		x=n % 10;
		sum=sum + x;
		n=n / 10;
		x=n % 10;
		sum=sum + x;
		n=n / 10;
		x=n % 10;
		sum=sum + x;
		n=n / 10;
		System.out.println("The sum of the digits is " + sum);
		sc.close();
	}

}
