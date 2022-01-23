/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject			:ICP (CSE 1001)
 * Problem Description	(lab assignment04,Q)
 */
package labAssignment04;
public class Question06 {
	public static void main(String[] args) {
		int i,ctr=0;
		for(i=1000;i<=2000;i++)
		{
		System.out.print(i+" ");
		ctr++;
		if(ctr%5==0)
		System.out.println();
		}
	}
}