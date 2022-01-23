/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment03,Q9)Write a java program that randomly generates an integer between 1
 * and 12 and displays the English month name January, February… December for the number 1, 2… 12,accordingly.
 */
package labAssignment03;
public class Question09 {
public static void main(String[] args) {
	int month = (int)((Math.random() * 12) + 1);
		if (month==1)
		{
			System.out.println("January");
		}
		else if (month==2)
		{
			System.out.println("February");
		}
		else if (month==3)
		{
			System.out.println("March");
		}
		else if (month==4)
		{
			System.out.println("April");
		}
		else if (month==5)
		{
			System.out.println("May");
		}	
		else if (month==6)
		{
			System.out.println("June");
		}
		else if (month==7)
		{
			System.out.println("July");
		}
		else if (month==8)
		{
			System.out.println("August");
		}
		else if (month==9)
		{
			System.out.println("September");
		}
		else if (month==10)
		{
			System.out.println("October");
		}
		else if (month==11)
		{
			System.out.println("November");
		}	
		else if (month==12)
		{
			System.out.println("December");
		}}}