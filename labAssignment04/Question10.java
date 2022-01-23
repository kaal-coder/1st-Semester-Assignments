/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject			:ICP (CSE 1001)
 * Problem Description	(lab assignment04,Q10)Write a java program to print the multiplication table of a 
 * number entered by the user.
 */
package labAssignment04;
import java.util.Scanner;
public class Question10 {
	public static void main(String[] args) {
		int i,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number whose multiplication table you want to find: ");
		int num=sc.nextInt();
		for(i=1;i<=10;i++)
		{
		r=1;
		r=num*i;
		System.out.println(num+"x"+i+"="+r);
		}
	}
}