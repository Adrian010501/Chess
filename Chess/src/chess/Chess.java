package chess;

public class Chess {
	
	static boolean color; // 0 is black, 1 is white
	static char[][] board; // lower case is black, capital is white
	
	public static void playGame() {
		initializeBoard();
		color = true;
		printBoard();
		while(true) {}
	}
	
	private static void initializeBoard() {
		board = new char[8][8];
		board[0][0] = 'r';
		board[1][0] = 'k';
		board[2][0] = 'b';
		board[3][0] = 'k';
		board[4][0] = 'q';
		board[5][0] = 'b';
		board[6][0] = 'k';
		board[7][0] = 'r';
		for(int i = 0; i < 8; i++) {
			board[i][1] = 'p';
		}
		board[0][7] = 'R';
		board[1][7] = 'K';
		board[2][7] = 'B';
		board[3][7] = 'K';
		board[4][7] = 'Q';
		board[5][7] = 'B';
		board[6][7] = 'K';
		board[7][7] = 'R';
		for(int i = 0; i < 8; i++) {
			board[i][6] = 'P';
		}
	}
	
	public static void move() {
		//call getmove
		//call validate move
		
	}
	
	public static void printBoard() {
		//Print board 
	}
	
	public static void checkMate() {
		//Check for mate
	}

}
