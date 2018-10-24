import java.util.Scanner;

public class TicTacToeFinal {
	
	static char[][] board = new char[3][3];
	static char player = 'X';

	public static void main(String[] args) {
		board[0][0] = '1';
		board[1][0] = '2';
		board[2][0] = '3';
		board[0][1] = '4';
		board[1][1] = '5';
		board[2][1] = '6';
		board[0][2] = '7';
		board[1][2] = '8';
		board[2][2] = '9';
		
		printBoard(board);
		userInput();
		
		//switch players
		if (player == 'O')
			player = 'X';
        else
        	player = 'O';

		
	}
	
	//method to create the board
	public static void printBoard(char[][] board){
		System.out.println(board[0][0] + "  |" + board[1][0] +  "  |" + board[2][0]);
		System.out.println("---|---|---");
		System.out.println(board[0][1] + "  |" + board[1][1] +  "  |" + board[2][1]);
		System.out.println("---|---|---");
		System.out.println(board[0][2] + "  |" + board[1][2] +  "  |" + board[2][2]);
	 }
	 
	// user input for X's and O'x. print your board after each user input
	public static void userInput(){
		Scanner input = new Scanner(System.in);
		System.out.print("What spot player  " + player + "want to play?  ");
		int x = input.nextInt();
		
		//spot is occupied
		while (board[x][y] == 'X' || board[x][y] == 'O')
			System.out.println("This spot was already played. Please try again");
		
		//place the X or O
		board[x][y] = player;
		printBoard(board);
	}
	 
	// checkWinner() method.
	
	
}
	 
