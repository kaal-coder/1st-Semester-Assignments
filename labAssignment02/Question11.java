/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q11)Write a java program that reads in investment amount, annual interest rate, and number of years, and displays the future
 *  investment value using the following formula: futureInvestmentValue=investmentAmount x(1+𝑚𝑜𝑛𝑡𝑙𝑦𝐼𝑛𝑡𝑒𝑟𝑒𝑠𝑡𝑅𝑎𝑡𝑒)𝑛𝑢𝑚𝑏𝑒𝑟𝑂𝑓𝑌𝑒𝑎𝑟𝑠∗12
For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98.
 */
package labAssignment02;
import java.util.*;

public class Question11 {

	public static void main(String[] args) {
		double ia, air, av,mir;
		int noy;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter investment  amount :");
		ia=in.nextDouble();
		System.out.print("Enter annual interest rate in percentage :");
		air=in.nextDouble();
		System.out.print("Enter number of years :");
		noy=in.nextInt();
		mir=air/1200.0;
		av=ia*Math.pow((mir+1),noy*12);
		System.out.println("Accumulated value is $"+av);
	}
}
