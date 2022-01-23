/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment03,Q7)Write a java program that takes the x – y coordinates of a point in the Cartesian plane and\
 * prints a message telling either an axis on which the point lies or the quadrant in which it is found.
 */
package labAssignment03;
import java.util.Scanner;
public class Question07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Enter x, y: ");
    double x = in.nextDouble();
    double y = in.nextDouble();
     if (x==0 && y==0)
   	{
    System.out.println("Point is origin");
   	}
    else if (x>0 && y>0)
	{
	System.out.println("1st Quadrant");
	}
	else if (x<0 && y>0)
	{
		System.out.println("2nd Quadrant");
	}
	else if (x<0 && y<0)
	{
		System.out.println("3rd Quadrant");
	}
	else if (x>0 && y<0)
	{	
     System.out.println("4th Quadrant");
	}
    else if (x==0)
     {
      System.out.println("Y-axis");
     }
    else if (y==0)
    {
    	System.out.println("Y-axis");
    }
	}
}
