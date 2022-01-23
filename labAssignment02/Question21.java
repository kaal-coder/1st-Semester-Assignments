/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q21)Write a java program that takes a double value t from the command line and 
 * prints the value of sin (2t) + sin (3t).
 */
package labAssignment02;

public class Question21 {

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
        double b = Math.toRadians(a);
        double c = Math.sin(2*b) + Math.sin(3*b);
        System.out.println("Result=" + c);
    
	}

}
