/* Author's name		:Kaushik Lakhani	
 * Author's Regd.No		:204102002
 * Author's Semester	:1st
 * Author's Branch		:CSIT(2041010)
 * Subject				:ICP (CSE 1001)
 * Problem Description	(lab assignment03,Q14)Write a java program that plays the popular scissor-rock-paper game.
 * (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a number
 * 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or 2 and displays a message 
 * indicating whether the user or the computer wins, loses, or draws.
 */
package labAssignment03;
import java.util.Scanner;
public class Question14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int computer = (int)(Math.random() * 3);
		System.out.print("Choose any one, scissor (0), rock (1), paper (2): ");
		int user = sc.nextInt();
		System.out.print("The computer is ");
		switch (computer) {
		case 0:System.out.println("Scissor");break;
		case 1:System.out.println("Rock");break;
		case 2:System.out.println("Paper");
		}
		System.out.print("You are ");
		switch (user) {
		case 0: System.out.print("Scissor"); break;
		case 1: System.out.print("Rock"); break;
		case 2: System.out.print("Paper ");
	}
		if  (computer == user)
			System.out.println(" too. It is a draw");
		else
		{
boolean win = (user == 0 && computer == 2) ||  (user == 1 && computer == 0) || (user == 2 && computer == 1);
			if (win)
				System.out.print(". You won");
			else
				System.out.print(". You lose");
		}
		}
	}