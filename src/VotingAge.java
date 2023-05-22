import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter avoting age of the voter: = ");
		int vote_age = sc.nextInt();

		if (vote_age >= 18) {
			System.out.println("Voter is eligible to vote: =" + vote_age);
		} else if (vote_age < 18) {
			System.out.println("Voter is not eligible to vote: =" + vote_age);
		}

	}

}
