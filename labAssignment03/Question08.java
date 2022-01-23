/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment03,Q8)If the ages of Rahul, Ayush and Ajay are input through the keyboard,
 * write a java program to determine the elder among them
 */
package labAssignment03;
import java.util.Scanner;
public class Question08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Enter age of Rahul, Ayush, Ajay: ");
    double Rahul = in.nextDouble();
    double Ayush = in.nextDouble();
    double Ajay = in.nextDouble();
    if (Rahul>Ayush && Rahul>Ajay)
    {
    	System.out.println("Rahul is elder among  the three.");
    }
    else if (Ayush>Rahul && Ayush>Ajay)
    {
    	System.out.println("Ayush is elder among  the three.");
    }
    else if (Ajay>Rahul && Ayush<Ajay)
    {
    	System.out.println("Ajay is elder among  the three.");
    }		
	}
}