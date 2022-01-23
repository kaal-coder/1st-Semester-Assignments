/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject			:ICP (CSE 1001)
 * Problem Description	(lab assignment04,Q1)Write a java program to input a string message and display it 
 * 10 times in the following manner. Use a while loop. Let the string message be “Hello”.
 */
package labAssignment04;
import java.util.Scanner;
public class Question01 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String msg;
	System.out.println("Enter the message");
	msg=sc.next();
	int i=1;
	while(i<=10)
	{
	if(i==1)
	System.out.println(i+"st "+msg);
	else if(i==2)
	System.out.println(i+"nd "+msg);
	else if(i==3)
	System.out.println(i+"rd "+msg);
	else
	System.out.println(i+"th "+msg);
	i++;
	}}}