/* `Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q13)Using string ruler, print the following
 * 1
1 2 1
1 2 1 3 1 2 1
1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
 * 
 */
package labAssignment01;

public class Question13 {

	public static void main(String[] args) {
    String ruler1 = "1";
    String ruler2 = "2";
    String ruler3 = "3";
    String ruler4 = "4";
    System.out.println(ruler1);
    System.out.println(ruler1 +  " "  + ruler2 + " "  + ruler1);
    System.out.println(ruler1 +  " "  + ruler2 + " "  + ruler1 + " " + ruler3 + " " + ruler1 +  " "  + ruler2 + " "  + ruler1);
    System.out.println(ruler1 +  " "  + ruler2 + " "  + ruler1 + " " + ruler3 + " " + ruler1 +  " "  + ruler2 + " "  + ruler1 + " " + ruler4 + " " + ruler1 +  " "  + ruler2 + " "  + ruler1 + " " + ruler3 + " " + ruler1 +  " "  + ruler2 + " "  + ruler1);
	}

}
