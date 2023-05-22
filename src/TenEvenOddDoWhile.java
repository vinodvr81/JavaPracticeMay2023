
public class TenEvenOddDoWhile{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ten odd and ten even
		int i = 1; 
		do {
			if (i % 2 == 1) {
				System.out.println("the first ten odd numbers are : =" + i);
			}
			i++;
		}while (i <= 20);
		
		System.out.println("------------------------------------------------------------------------------");
		int j = 1;
		do { 

			if (j % 2 == 0) {
				System.out.println("the first ten even numbers are : =" + j);
			}
			j++;

		}while( j <= 20);

	}

}
