package basicprogram.java;
import java.util.Scanner;
public class KilometerIntoMile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double kilometers;
System.out.println("Please enter kilometers: ");
Scanner in = new Scanner(System.in);
kilometers = in.nextDouble();
double miles = kilometers/1.6;
System.out.println(miles+"Miles");
	}

}
