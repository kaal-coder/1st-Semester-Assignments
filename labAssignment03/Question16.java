/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q16)A University conducts a 100 mark exam for its student and grades them as follows. Assigns a grade
 * based on the value of the marks. Write a java program to print the grade according to the mark secured by the student.
 * Mark Range  Letter Grade
              
   >=90             O

>=80 AND <90        A

>=70 AND <80        B

>=60 AND <70        C

>=50 AND <60        D

>=40 AND <50        E

<40                 F

 */
package labAssignment03;
import java.util.Scanner;
public class Question16 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter the marks secured by the student out of 100");
    int m = sc.nextInt();
    int n = m/10;
    switch(n){
    case 10 :
    case 9 :System.out.println("Grade is O.");break;
    case 8 :System.out.println("Grade is A.");break;
    case 7 :System.out.println("Grade is B.");break;
    case 6 :System.out.println("Grade is C.");break;
    case 5 :System.out.println("Grade is D.");break;
    case 4 :System.out.println("Grade is E.");break;
    default :System.out.println("Grade if F.");
    }
	}
}