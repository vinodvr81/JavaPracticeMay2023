import java.util.Scanner;

public class ReverseDigitsFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse the digits of that number = ");
		int digits_reverse_num = sc.nextInt();
		int reverse_number = reverseDigits(digits_reverse_num);
		System.out.println("Reversed Number is: = " + reverse_number);

	}

	private static int reverseDigits(int digits_reverse_num) {
		int reversedNumber = 0;
		
		for (; digits_reverse_num != 0; digits_reverse_num /= 10) {
			int digit = digits_reverse_num % 10;
			reversedNumber = reversedNumber * 10 + digit;
			
		}
		return reversedNumber;
	}

}
