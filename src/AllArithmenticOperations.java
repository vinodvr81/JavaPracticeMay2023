
public class AllArithmenticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte var_byte = 11;
		short var_short = 30;
		int var_int = 300;
		long var_long = 40L;
		float varFloat = 342.354f;
		double varDouble = 463.757357345;
		char varChar = 'A';

		// Artimetic ops

		int sum = var_byte + var_short;
		int diff = var_int - var_short;
		long prod = var_int * var_long;
		double qot = varDouble / varFloat;
		int int_rem = var_int % var_byte;

		System.out.println("Before increment : = " + var_int);
		System.out.println("Before deccrement : = " + var_short);

		int var_increment = var_int++;
		int var_decrement = var_short--;

		System.out.println("After increment : = " + var_int);
		System.out.println("After deccrement : = " + var_short);
		System.out.println("sum :  =" + sum);
		System.out.println("difference is : = " + diff);
		System.out.println("produt is : = " + prod);
		System.out.println("quotient is : = " + qot);
		System.out.println("charcter var is: = " + varChar);
		System.out.println("reminder is: = " + int_rem);

	}

}
