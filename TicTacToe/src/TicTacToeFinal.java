import java.util.Scanner;

public class TicTacToeFinal {
	
	static char[] board = new char[9];
	static char player = 'X';
	private static Scanner input;

	public static void main(String[] args) {
		board[0] = '1';
		board[1] = '2';
		board[2] = '3';
		board[3] = '4';
		board[4] = '5';
		board[5] = '6';
		board[6] = '7';
		board[7] = '8';
		board[8] = '9';
		
		printBoard(board);
		
		while(checkWinner() == false)
			userInput();
				
		checkWinner();
		if (true)
			System.out.println("Player " + player + " is the winner!");
		
	}
	
	//method to create the board
	public static void printBoard(char[] board){
		System.out.println(board[0] + "  |" + board[1] +  "  |" + board[2]);
		System.out.println("---|---|---");
		System.out.println(board[3] + "  |" + board[4] +  "  |" + board[5]);
		System.out.println("---|---|---");
		System.out.println(board[6] + "  |" + board[7] +  "  |" + board[8]);
	 }
	 
	// user input for X's and O'x. print board after each user input
	public static void userInput(){
		boolean valid = false;
		while(valid==false) {
			input = new Scanner(System.in);
			System.out.print("What spot does player " + player + " want to play?  ");
			int x = input.nextInt() - 1;
			
			//spot is occupied || place X or O
			if (board[x] != 'X' && board[x] != 'O') {
				board[x] = player;
				printBoard(board);
				valid = true;
			}
			else {
				System.out.println("This spot was already played. Please try again");
				printBoard(board);
			}
				
		}
		//switch players
		if (player == 'X')
			player = 'O';
        else
        	player = 'X';
				

	}
	 
	// check winner
	public static Boolean checkWinner() {
		boolean occupied = true;
		for(int i = 0; i < board.length; i++) {
			if (board[i] != 'O' || board[i] != 'X') {
				occupied = false;
			}
	      }
	    if(occupied)
	        return false;
	    
		return (board[0] == board[1] && board[1] == board[2] ||
				board[3] == board[4] && board[4] == board[5] ||
				board[6] == board[7] && board[7] == board[8] ||
				board[0] == board[3] && board[3] == board[6] ||
				board[1] == board[4] && board[4] == board[7] ||
				board[2] == board[5] && board[5] == board[8] ||
				board[0] == board[4] && board[4] == board[8] ||
				board[2] == board[4] && board[4] == board[6]);
		}
	}
	 
