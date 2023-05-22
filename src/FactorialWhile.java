import java.util.Scanner;

public class FactorialWhile{

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
		int i = 1; 
		while (i <= fact_num) {
			res *= i;
			i++;
		}
		return res;
	}
}
