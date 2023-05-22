import java.util.Scanner;

public class DigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: = ");
		int dig_num = sc.nextInt();

		int res_sum_digits = calDigitOfNumber(dig_num);
		System.out.println("Sum of digits of a number: = " + dig_num + " is:" + res_sum_digits);

	}

	private static int calDigitOfNumber(int dig_num) {
		if (dig_num == 0) {
			return 0;
		}
		if (dig_num < 0) {
			dig_num = Math.abs(dig_num);
		}
		int res = 0;
		for (; dig_num != 0; dig_num /= 10) {
			int digit = dig_num % 10;
			res += digit;

		}
		return res;
	}
}