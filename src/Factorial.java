import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number that you want to find a factorial: = ");
		int fact_num = sc.nextInt();
		long factorial = calFactorial(fact_num);
		System.out.println("Factorial of the number: " + fact_num + " is: =" + factorial);

	}

	private static long calFactorial(int fact_num) {
		int res = 1;
		for (int i = 1; i <= fact_num; i++) {
			res *= i;
		}
		return res;
	}
}
