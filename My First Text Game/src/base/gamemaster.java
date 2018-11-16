package base;

import java.util.Scanner;

public class gamemaster {
	
	static Scanner input = new Scanner(System.in);
	
	static void hitEnter() {
		System.out.println("Hit [Enter] to continue.");
		input.nextLine();
	}
	
	static void greetings() {
		System.out.println("Hello there, my name is Jack, your friendly gamemaster, and welcome to the game!");
		hitEnter();
	}
	
	static void rules() {
		System.out.println("\nNow, the objective of the game is simple:");
		System.out.println("\nWhen the game starts, I will be posting a number up here."
				+ "\nWhat you need to do is to type out the number then hit Enter."
				+ "\nIf you get it correct you get 1 point, get it wrong, and you get 0, nada, nothing.");
		System.out.println("\nYour score will be calculated on how many numbers you enter correctly, "
				+ "along with the time it took to complete it.");
		hitEnter();
	}
	
	static String name() {
		String name;
		System.out.println("Now, can you tell me your name?");
		System.out.println("Type your name below, then hit [Enter].");
		name = input.nextLine();
		System.out.println("Fantastic, hello there " + name + ".");
		return name;
	}

	public static int playAgain() {
		int yesNo;
		do {
			System.out.println("\nDo you want to play again?");
			System.out.println("Type '1' for yes or '2' for No.");
			yesNo = input.nextInt();
			input.nextLine();
			if (yesNo != 1 && yesNo != 2) {
				System.out.println("Invalid number try again!");
			}
		} while (yesNo != 1 && yesNo != 2);
		if (yesNo == 2) {
			System.out.println("Thank you and goodbye!");
		}
		return yesNo;
	}
}
