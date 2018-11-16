package base;

import java.util.Random;
import java.util.Scanner;

public class game {
	
	//Player info//
	private String name;
	private int highScore;

	private long startTime;
	private long endTime;
	private long timeTaken;
	private int randomNumber;
	private int inputNumber;
	private int score;
	private long timeScore;
	private int questionsCorrect;
	
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	
	public game(String name) {
		this.name = name;
	}
	
	public long getStartTime() {
		return startTime;
	}

	private void setStartTime() {
		this.startTime = System.currentTimeMillis();
	}

	public long getEndTime() {
		return endTime;
	}

	private void setEndTime() {
		this.endTime = System.currentTimeMillis();
	}

	public int getScore() {
		return score;
	}

	static void start() {
		System.out.println("\nReady to start?");
		gamemaster.hitEnter();
		System.out.println("Game has started!");
	}

	public void running() {
		score = 0;
		questionsCorrect = 0;
		setStartTime();
		for (int i = 0; i < 10; i++) {
			randomNumber = rand.nextInt(9999) + 1;
			System.out.println(randomNumber);
			inputNumber = input.nextInt();
			input.nextLine();
			if (inputNumber == randomNumber) {
				System.out.println("Correct!");
				questionsCorrect++;
			}
			else {
				System.out.println("Wrong!");
			}
		}
		setEndTime();
	}
	public void calculateScore() {
		score = questionsCorrect;
		timeTaken = (endTime - startTime)/1000;
		timeScore = (int)timeTaken;
		timeScore = 200/timeScore;
		score += timeScore;
	}
	
	void gameFinish() {
		System.out.println("\nWell done " + name + "! You finished the game, here are your results:");
		System.out.println("\nNumber of questions correct: " + questionsCorrect);
		System.out.println("Time taken: " + timeTaken + " seconds");
		System.out.println("Score from time: " + timeScore);
		System.out.println("Your final score: " + score);
		highScore(score);
	}

	private void highScore(int highScore) {
		if (this.highScore < highScore) {
			System.out.println("Congratulations! You've got a new highscore :)");
			this.highScore = highScore;
		}
		else if (this.highScore >= highScore) {
			System.out.println("Sorry, you didn't manage to beat your high score :(");
		}
	}
}
