/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment03,Q5)The two roots of a quadratic equation 𝑎𝑥2+𝑏𝑥 +𝑐=0 can be obtained using the following formula:
𝑟1=−𝑏+√𝑏2−4𝑎𝑐2𝑎 and 𝑟2=−𝑏−√𝑏2−4𝑎𝑐2𝑎
b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. 
If it is zero, the equation has one root. If it is negative, the equation has no real roots.
 */
package labAssignment03;
import java.util.Scanner;
public class Question05 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double a,b,c,d,r1=0,r2=0;
	System.out.println("Enter a, b and c");
	a=sc.nextDouble();
	b=sc.nextDouble();
	c=sc.nextDouble();
	if(a==0)
	{
	System.out.println("not a quadratic equation");
	} else
	{
	d=b*b-4*a*c;
	if(d==0)
	{
	r1=r2=-b/(2*a);
	System.out.println("root1=root2= "+r1);
	} else if(d>=0)
	{
	r1=-b+Math.sqrt(d)/(2*a);
	r2=-b-Math.sqrt(d)/(2*a);
	System.out.println("root1= "+r1+" root2 = "+r2);
	} else
	{
	System.out.println("roots are imaginary");
	}

	}

}
}