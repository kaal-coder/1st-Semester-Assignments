/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject			:ICP (CSE 1001)
 * Problem Description	(lab assignment04,Q8)Write a java program to print the following output using loop.
1
121
1213121
121312141213121
1213121412131215121312141213121
 */
package labAssignment04;
public class Question08 {
	public static void main(String[] args) {
		int i;
		String p="";
		for(i=1;i<=5;i++)
		{
		p+=i+p;
		System.out.println(p);
		}
	}
}