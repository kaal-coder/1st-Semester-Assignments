/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q18)Write a java program which displays an appropriate name for a person, using
 * a combination of nested ifs andcompound conditions. Ask the user for a gender, first name, last name and age. If the 
 * person is female and 20 or over, ask if she is married. If so, display "Mrs." in front of her name. If not, display 
 * "Ms." in front of her name. If the female is under 20, display her first and last name. If the person is male and 
 * 20 or over, display "Mr." in front of his name. Otherwise, display his first and last name. Note that asking a person
 * if they are married should only be done if they are female and 20 or older, which means you will have a single if and
 *  else nested inside one of your if statements. Also, did you know that with an if statements (or else), the curly 
 *  braces are optional when there is only one statement inside?
 */
package labAssignment03;
import java.util.Scanner;
public class Question18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender (M or F): ");
        char g = sc.nextLine().charAt(0);
        System.out.println("First name :");
        String f = sc.nextLine();
        System.out.println("Last name :");
        String l = sc.nextLine();
        System.out.println("Age :");
        int a = sc.nextInt();
        if (g=='F')
        {
            if (a>=20)
            {System.out.println("Are you married (Y or N):");
                sc.nextLine();
                char m = sc.nextLine().charAt(0);
                if (m=='Y')
                {       System.out.println("Then I shall call you Mrs. " + f + " " + l);
                }
                else
                {System.out.println("Then I shall call you Ms. " + f + " " + l);
                }
            }
            else
            {
                System.out.println("Then I shall call you Ms. " + f + " " + l);
            }
        }
        else
        {
            if (a>=20)
            {
                System.out.println("Then I shall call you Mr. " + f + " " + l);
            }
            else
            {
                System.out.println("Then I shall call you " + f + " " + l);
            }
        }
	}
}
