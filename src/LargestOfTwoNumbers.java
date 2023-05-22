import java.util.Scanner;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: = ");
		int first = sc.nextInt();

		System.out.println("Enter second number: = ");
		int second = sc.nextInt();

		if (first > second) {
			System.out.println("the largest number is : =" + first);
		} else if (first < second) {
			System.out.println("the largest number is : =" + second);
		} else {
			System.out.println(
					"both numbers are equal" + " first number is: = " + first + "second number is: =" + second);
		}

	}

}
