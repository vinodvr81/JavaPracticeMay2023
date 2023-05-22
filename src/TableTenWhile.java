
public class TableTenWhile{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 10;
		System.out.println("table of "+number+ "is:");
		int i = 1;
		while (i<=number) {
			int res = number*i;
			System.out.println(number + " x " + i + " = " + res);
			i++;
		}

	}

}
