/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q05)Average acceleration is defined as the change of velocity divided by the time taken
 * to make the change, as shown in the following formula:
𝑎=𝑣1−𝑣0𝑡
Write a java program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1 in
meters/second, and the time span t in seconds, and displays the average acceleration.
 */
package labAssignment02;

public class Question05 {

public static void main(String[] args) {
	int m,d;
	m=Integer.parseInt(args[0]);
	d=Integer.parseInt(args[1]);
	boolean res=(m==3&&d>=20)||(m==4&&d<=30)||(m==5&&d<=31)||(m==6&&d<=20);
	System.out.println(res);
}
}
