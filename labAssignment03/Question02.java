/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment03,Q2)Write a java program to input the mark of a student and check if the student mark is greater than or equal to 40, then it generates the following message.
“Congratulation! You have passed the exam.”
Otherwise the output message is
“Sorry! You have failed the exam.”
 */
package labAssignment03;
import java.util.*;
public class Question02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mark;
		System.out.println("Enter the mark of the student");
		mark=sc.nextInt();
		if(mark>=40)
		System.out.println("Congratulations! You have passed the exam");
		else
		System.out.println("sorry! you have failed the exam");
		}
		}