import java.util.Scanner;

public class Numberheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: = ");
		int number_value = sc.nextInt();

		if (number_value > 0) {
			System.out.println("entered number is positive: =" + number_value);
		} else if (number_value < 0) {
			System.out.println("entered number is negative: =" + number_value);
		} else {
			System.out.println("entered number is zero: =" + number_value);
		}

	}

}
