
import java.util.Scanner;

public class TicTac2 {

	static  char[] board = new char[10];
	private static char ex = 'X';
	private static char zero = '0';
	private static char player;
	private static char computer;
	 
	public static char[]  creatingBoard() {


		for (int i = 1; i < board.length; i++) {
		board[i] = ' ';
		}
		return board;
		}
	public static void allowplayerchoose()
	{
		System.out.println("which symbol you want to choose X or 0");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		player = input.charAt(0);
		
		if(player == ex)
		{
			player = ex;
			computer = zero;
			System.out.println("player symbol is : " + player);

		}
		else if(player == zero)
		{
			player = zero;
			computer =ex;
			System.out.println("player symbol is : " + player);
        }
		else
		{
			System.out.println("Invalid");
		}
	}
		
		public static void main(String args[]) {

			System.out.println("Welcome to tic tac board");
			board = creatingBoard();
			
			allowplayerchoose();
		}
	}
