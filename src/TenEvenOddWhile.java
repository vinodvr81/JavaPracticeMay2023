
public class TenEvenOddWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ten odd and ten even
		int i = 1;
		while (i <= 20) {
			if (i % 2 == 1) {
				System.out.println("the first ten odd numbers are : =" + i);
			}
			i++;
		}
		System.out.println("------------------------------------------------------------------------------");
		int j = 1;
		while ( j <= 20) {

			if (j % 2 == 0) {
				System.out.println("the first ten even numbers are : =" + j);
			}
			j++;

		}

	}

}
