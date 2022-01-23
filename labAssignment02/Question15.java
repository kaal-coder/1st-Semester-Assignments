/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q15)Write a java program that takes two int values a and b from the command line and prints a random integer between a and b.
 */
package labAssignment02;
//import java.lang ; 
public class Question15 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c=(int)(Math.random()*(b-a+1))+a;
        System.out.println("c = "+c);
        
	}

}
