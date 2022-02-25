package labAssignment05;
import java.util.Scanner;
public class Question15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an amount (e.g., 100): ");
		double amount = sc.nextDouble();
		System.out.print("Enter the annual interest rate (e.g., 5): ");
		double roi = sc.nextDouble();
		System.out.print("Enter the number of months (e.g., 6): ");
		int months = sc.nextInt();
		double monthlyIntRate = roi / 1200;
		double compoundValue = 0; 
		for (int m = 1; m <= months; m++) {
			compoundValue = (amount + compoundValue) * (1 + monthlyIntRate);
		}
		System.out.println("Amount in savings account after " +months + " months : " + compoundValue);
	}
	}