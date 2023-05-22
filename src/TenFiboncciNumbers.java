
public class TenFiboncciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ten odd and ten even
		System.out.println("First 10 Fibonacci Numbers: ");

		int firstNumber = 0;
		int secondNumber = 1;
		int nextNumber = firstNumber + secondNumber;
		for (int i = 1; i <= 10; i++) {
			System.out.println(firstNumber + " ");
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			nextNumber = firstNumber + secondNumber;

		}

	}

}
