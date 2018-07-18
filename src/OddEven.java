import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello. What is your name?");
		String name = scan.nextLine();
		boolean cont = true;

		do {
			System.out.println(name + ", enter a number between 1 and 100: ");

			int userInput = scan.nextInt();
			if (userInput > 0 && userInput < 101) {
				if (userInput % 2 == 0) {
					if (userInput >= 2 && userInput < 25) {
						System.out.println(name + ", your input is even and less than 25.");
					} else if (userInput <= 60) {
						System.out.println(name + ", your input is even.");
					} else if (userInput > 60) {
						System.out.println(name + ", " + userInput + " is even.");
					}
				}

				else if (userInput > 60) {
					System.out.println(name + ", your input is odd and over 60.");
				} else {
					System.out.println(name + ", your input is " + userInput + " and odd.");
				}

			} else {
				System.out.println("Sorry " + name + ", your input wasn't between 1 and 100. Please try again.");
			}

			System.out.println("Continue? (y/n): ");
			scan.nextLine();
			if (scan.nextLine().equals("n")) {
				cont = false;
				break;
			}

		} while (cont == true);
		
		System.out.println("Bye!");
		scan.close();
	}
}
