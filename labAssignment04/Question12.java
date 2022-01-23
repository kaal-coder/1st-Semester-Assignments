/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject			:ICP (CSE 1001)
 * Problem Description	(lab assignment04,Q12)
 */
package labAssignment04;
public class Question12 {
	public static void main(String[] args) {
		int N;
		double s=0,t=0,p=0;
		System.out.println("log N                   N      NlogN                  N2       N3           2N ");
		for(N=16;N<=2048;N=N*2)
		{
		System.out.println(Math.log(N)+"\t"+N+"\t"+N*Math.log(N)+"\t"+Math.pow(N,2)+"\t"+Math.pow(N, 3)+"\t"+Math.pow(2, N));
	}
	}
}