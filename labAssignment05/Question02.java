package labAssignment05;
import java.util.*;
public class Question02 {
public static void main(String[] args) {
Scanner sc= new Scanner (System.in);
int i,n,c=0;
System.out.println("Enter the number of students whose mark you want to enter");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
System.out.println("Enter the mark one by one");
int num=sc.nextInt();
if ( num >=40)
c++;
}
System.out.println("The number of students who passed are "+c);
}
}