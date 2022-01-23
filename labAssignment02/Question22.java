/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q22)Write a java program that calculates the monthly payments you would have to make
 *over a given number of years to pay off a loan at a given interest rate compounded continuously, taking the number of
 *years t, the principal P, and the annual interest rate r as command-line arguments.
 * The desired value is given by the formula 𝑃𝑒𝑟𝑡. Use Math.exp ().
 */
package labAssignment02;

public class Question22 {

	public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        System.out.print(P*Math.pow(Math.E,(r*t))); 
    
		
	}

}
