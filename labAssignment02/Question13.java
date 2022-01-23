/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q13)Write a java program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and
 * days for the minutes. For simplicity, assume a year has 365 days.
 */
package labAssignment02;
import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Mins :");
		long m, d, y;
		m=in.nextLong();
		d=m/60;
		d=d/24;
		y=d/365;
		d=d%365;
		System.out.println(m+" minutes is approximately "+y+" years and "+d+" days");
	}

}
