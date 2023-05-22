
public class TenEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ten odd and ten even

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.println("the first ten odd numbers are : =" + i);
			}
		}
		System.out.println("------------------------------------------------------------------------------");
		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) {
				System.out.println("the first ten even numbers are : =" + i);
			}

		}

	}

}
