/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment,Q23)Write a java program that takes three int values from the command line and
 * prints them in ascending order. Use Math.min() and Math.max().
 */
package labAssignment02;

public class Question23 {

	public static void main(String[] args) {
		int a = Integer.parseInt( args[0] );
        int b = Integer.parseInt( args[1] );
        int c = Integer.parseInt( args[2] );
        int x = Math.min(a, b);
        int min = Math.min(x,c);
        int z = Math.max(a, b);
        int max = Math.max(z, c);
        int mid = a+ b+ c- min - max;
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
        
	}

}
