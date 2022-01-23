package labAssignment02;
import java.util.Scanner;
public class Question02 {

	public static void main(String[] args) { 
    double π= 22/7;
    double r=Double.parseDouble(args[0]);
    double h=Double.parseDouble(args[1]);
    double  volume=((22*r*r*h)/7);
    double area=(r * r * π);
    System.out.println("area of cylinder is: " + area);
    System.out.println("volume of Cylinder is: " +volume);
}}