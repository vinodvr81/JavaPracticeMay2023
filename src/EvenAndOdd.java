
import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number to find whether it is even or odd = ");
		int number = sc.nextInt();

		if (number % 2 == 1) {
			System.out.println("the number is odd: = " + number);
		} else if (number % 2 == 0) {
			System.out.println("the number is even: = " + number);
		}

	}

}
