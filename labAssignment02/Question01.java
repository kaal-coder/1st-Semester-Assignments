/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q01)Write a java program that reads a Celsius degree in a double value from the
 * console, then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
 */
package labAssignment02;
import java.util.Scanner;
public class Question01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
		double celsius = sc.nextDouble();

		double fahrenheit = 9.0 / 5 * celsius + 32;

		System.out.println(celsius + " celsius in fahrenheit is " + fahrenheit); 
	
	}

}
