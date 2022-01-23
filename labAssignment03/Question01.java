/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment03,Q1)Write a java program to input the height of the person and check if the 
 * height of the person is greater than or equal to 6 feet then print the message “The person is tall”.
 */
package labAssignment03;
import java.util.Scanner;
public class Question01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h;
		System.out.println("Enter the height of the person");
		h=sc.nextInt();
		if(h>=6)
		System.out.println("The person is tall");
		}
	}