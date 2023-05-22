import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first no:");
		int fir = sc.nextInt();
		System.out.print("enter seconf no:");
		int sec = sc.nextInt();
		System.out.println("Sum is:" + (fir + sec));
		System.out.println();

	}

}
