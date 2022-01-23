/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject			:ICP (CSE 1001)
 * Problem Description	(lab assignment04,Q)
 */
package labAssignment04;
import java.util.*;
public class Question04 {
	public static void main(String[] args) {
		int a,x,i,z;
		Scanner input = new Scanner (System.in);
		System.out.println("Count From");
		 i= input.nextInt();
		System.out.println("Count upto");
		 x= input.nextInt();
		System.out.println("Count by");
		 z= input.nextInt();		
		for(a=i;a<=x;a+=z) 
		{
			System.out.print(i +" ");
	    }	}}