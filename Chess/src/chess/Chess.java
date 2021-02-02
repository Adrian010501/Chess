package chess;
//Jacob is in town
public class Chess {
	public static void playGame() {
		//Create board
		//Starting method
	}
	public static void move() {
		//call getmove
		//call validate move
		
	}
	public static void printBoard() {
		for(int i = 0; i < 8; i++) {//Traversing vertically(rows)
			for(int j = 0; j < 8;) {//Traversing horizontally(columns)
				System.out.print("|" + board[i][j]);//Print data at i , j
				if(j == 7)
					System.out.print("|");//Print ending "|" in last column
			}
			System.out.print("\n");//New row
		}
	}
	public static void checkMate() {
		//Check for mate
	}
	

}
