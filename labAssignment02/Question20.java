/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q20)Write a java program that takes two int values m and d from the command line and
 *  prints true if day d of month m is between 3/20 and 6/20, false otherwise.
 */
package labAssignment02;

public class Question20 {

	public static void main(String[] args) {
	int m = Integer.parseInt(args[0]);
	int d = Integer.parseInt(args[1]);
    boolean result = (((m==3)&&(d>20&&d<=31))||((m==4)&&(d>=1&&d<=30))||((m==5)&&(d>=1&&d<=31))||((m==6)&&(d>=1&&d<20)));
    System.out.println("Result=" + result);
    
	}

}
