/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q19)Enter the basic salary of an employee of an organization through the command prompt.
 * His dearness allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic salary.
 * Write a java program to calculate his gross salary.
 */
package labAssignment02;
import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         System.out.println("Input basic salary:");
         double bs = sc.nextDouble();
         double da = 0.4*bs;
         double hra = 0.2*bs;
         double gross = bs + da + hra;
         System.out.println("Gross salary of the employee is :"+ gross);
     
	
		
	}

}
