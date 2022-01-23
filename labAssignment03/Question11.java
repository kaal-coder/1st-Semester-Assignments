/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment03,Q11)The body mass index (BMI) is commonly used by health and 
 * nutrition professionals to estimate human body fat in populations. It is computed by taking the
 *  individual's weight (mass) in kilograms and dividing it by the square of their height in meters. i.e.
𝑀𝑒𝑡𝑟𝑖𝑐:𝐵𝑀𝐼=𝑊𝑒𝑖𝑔ℎ𝑡 (𝑘𝑔)(𝐻𝑒𝑖𝑔ℎ𝑡(𝑚))2
*/
package labAssignment03;
import java.util.Scanner;
public class Question11 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight of a person in kg and height in meter");
		double wt=sc.nextDouble();
		double ht=sc.nextDouble();
		double BMI=wt/(ht*ht);
		System.out.println("BMI= "+BMI);
		if(BMI<18.5) {
		System.out.println("Under weight");
		}
		else if(BMI>=18.5 && BMI<25) {
		System.out.println("Normal weight");
		}
		else if(BMI>=25 && BMI<30) {
		System.out.println("Over weight");
		}
		else {
		System.out.println("obese");
		}
		}	
}