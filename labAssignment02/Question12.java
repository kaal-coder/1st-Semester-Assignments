/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q12)If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. (This is essentially the definition of the / and
 * % operators for integers.) Write a java program that asks the user how many eggs she has and then tells the user how many dozen eggs she has and how many extra eggs
 * are left over. A gross of eggs is equal to 144 eggs. Extend your program so that it will tell the user how many gross, how many dozen, and how many left over eggs
 * she has. For example, if the user says that she has 1342 eggs, and then your program would respond with. Your number of eggs is 9 gross, 3 dozen, and 10.
 */
package labAssignment02;
import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inp, g, d, l;
		System.out.print("Enter the number of eggs :");
		inp=in.nextInt();
		g=inp/144;
		inp=inp%144;
		d=inp/12;
		inp=inp%12;
		l=inp;
		System.out.print("Your number of eggs are "+g+" gross, "+d+" dozen, and "+l+".");
	}

}
