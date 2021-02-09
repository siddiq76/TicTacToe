

import java.util.Scanner;

public class TicTac5 {

	static char[] board = new char[10];
	private static char cross = 'X';
	private static char zero = 'O';
	private static char player;
	private static char computer;

	// creating board char array and intialising it//
	public static char[] creatingBoard() {

		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;

	}

	// allowing player to choose symbol method
	private static void allowPlayerToChoose() {
		System.out.println("Enter the symbol X or O you want to choose");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		player = input.charAt(0);

		if (player == cross) {
			player = cross;
			computer = zero;
			System.out.println("player symbol is : " + player);

		} else if (player == zero) {
			player = zero;
			computer = cross;
			System.out.println("player symbol is : " + player);

		} else {
			System.out.println("Invalid input");
		}

	}

	// displaying board and values at specific positions
	public static void showBoard() {
		System.out.println("Empty board looks like :");
		System.out.println("");
		System.out.println("   " + board[1] + "   " + "|" + "   " + board[2] + "   " + "|" + "   " + board[3] + "   ");
		System.out.println("  -------------------");
		System.out.println("   " + board[4] + "   " + "|" + "   " + board[5] + "   " + "|" + "   " + board[6] + "   ");
		System.out.println("  -------------------");
		System.out.println("   " + board[7] + "   " + "|" + "   " + board[8] + "   " + "|" + "   " + board[9] + "   ");
	}
	
	// taking position from player where he wants to put his input
	//UC5 is also satisfied in this
	public static void userMove()
	{
		System.out.println("Enter the empty position(between 1-9) where you wants to make the move ");
		Scanner sc = new Scanner(System.in);
		int position = sc.nextInt();
		if(position>=1 && position <=9)
		{
		if(board[position]==' ')
		{
			board[position] = player;
			showBoard();
		}
		else
		{
			System.out.println("Invalid move, position is not empty");
		}
		}
		else
		{
			System.out.println("You entered a invalid position");

		}
	

	}

	public static void main(String args[]) {

		System.out.println("Welcome to tic tac board");
		board = creatingBoard();
		allowPlayerToChoose();
		showBoard();
		userMove();
		// userMove();

	}
}

