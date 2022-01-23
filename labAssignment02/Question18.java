/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q18)Write a java program that takes three double values x, y, and z
 * as command-line arguments and prints true if the values are strictly ascending or descending (x < y < z or x > y > z), and false otherwise.
 */
package labAssignment02;

public class Question18 {

	public static void main(String[] args) {
	double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    double z = Double.parseDouble(args[2]);
    boolean res = (((x>y)&&(y>z))||((x < y)&&(y < z)));
    System.out.println("Result = " + res);
    	
		
	}

}
