import java.util.Scanner;

public class TicTacToe {
	
	static char[] board = new char [9];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		printBoard(board);
	}
	
	//create a method that prints the board
	
	public static char[] printBoard(char[] board) {
		System.out.println("  1 | 2 | 3 ");
		System.out.println("  __|___|___");
		System.out.println("  4 | 5 | 6 ");
		System.out.println("  __|___|___");
		System.out.println("  7 | 8 | 9 ");
	return board;
	}

}
