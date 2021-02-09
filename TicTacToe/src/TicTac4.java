
import java.util.Scanner;

public class TicTac4 {

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
	public static void showBoard()
	{
		System.out.println("Empty board");
		System.out.println(" ");
		System.out.println(" " +board[1]+ " " + "|" +" " +board[2]+ " " + "|" +"" +board[3]+ " ");
		System.out.println("......");
		System.out.println(" " +board[4]+ " " + "|" +" " +board[5]+ " " + "|" +"" +board[6]+ " ");
		System.out.println("......");
		System.out.println(" " +board[7]+ " " + "|" +" " +board[8]+ " " + "|" +"" +board[9]+ " ");
		
	}
	public static void userMove()
	{
		System.out.println("Enter the position you want to move");
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
			
			allowplayerchoose();
			showBoard();
			userMove();
		}
	}

