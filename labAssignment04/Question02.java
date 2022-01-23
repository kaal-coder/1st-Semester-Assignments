/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject			:ICP (CSE 1001)
 * Problem Description	(lab assignment04,Q2)Rewrite the above java program in such a way that takes the 
 * number of lines to print as a command-line argument. You may assume that the argument is less than 1000.
 */
package labAssignment04;
public class Question02 {
	public static void main(String[] args) {
		int i=1,n;
		n=Integer.parseInt(args[0]);
		while(i<=n)
		{
		if(i%10==1&&i%100!=11)
		System.out.println(i+"st Hello");
		else if(i%10==2&&i%100!=12)
		System.out.println(i+"nd Hello");
		else if(i%10==3&&i%100!=13)
		System.out.println(i+"rd Hello");
		else
		System.out.println(i+"th Hello");
		i++;
		}
}}