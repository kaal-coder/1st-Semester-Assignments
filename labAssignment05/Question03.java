package labAssignment05;
public class Question03 {
	public static void main(String[] args) {
		 for(int i=100;i<=1000; i++) {
		        if(i % 5==0 && i % 6==0) 
		            System.out.print(i +" ");
		        if(i!=100 && (i - 100) % 300 == 0)
		            System.out.println();
		    }
	}
}