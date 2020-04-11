import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

		printBoard(board);
		int player = 0;
		boolean  gameEnded = false;
		int validMove = 0;


         while(!gameEnded) {
			 System.out.print("Player " + (player+1) + " enter row number:");
			 int row = reader.nextInt();
			 System.out.print("Player " + (player+1) + " enter column number:");
			 int col = reader.nextInt();
			 if (isValid(row,col) && board[row - 1][col - 1] == ' ' ) {
			 	validMove++;
				 board[row - 1][col - 1] = (player == 1 ? 'X' : 'O');
				 printBoard(board);
				 player = ++player % 2;
				 gameEnded = validMove == 9 ||
						 checkBoard(board,  row-1, col-1);
			 }
			 else {
				 System.out.println("Coordinates are wrong");
			 }






		 }



		reader.close();
	}

	private static boolean checkBoard(char[][] board, int row, int col) {

		char symbol = board[row][col];
		boolean win = true;

		for (int i = 0; i < 3; i++){
			if (board[row][i] != symbol) {
				win = false;
				break;
			}








		}
		if (win)
			return true;
		win = true;


		for (int i=0; i<3; i++){
			if (board[col][i] != symbol){
				win =false;
				break;
			}
		}

		if(win)
			return true;
		win = true;

		if (row==col){
			win = true;
			for (int i = 0; i < 3; i++){
				if(board[i][i] != symbol){
					win = false;
					break;
				}
			}
			if (win)
				return true;
		}
		if(row + col ==2){
			win = true;
			for (int i = 0;i<3;i++){
				if(board[2-i][i] != symbol){
					win=false;
					break;


				}
			}
			if (win)
				return true;
		}



		return false;







	}

	private static boolean isValid(int row, int col) {
		boolean valid = true;
		if (col < 1 || row > 3)
			return false;
		if (col < 1 || row > 3)
			return false;


		return true;
	}

	public static void printBoard(char[][] board) {
		System.out.println("    1   2   3");
		System.out.println("   -----------");
		for (int row = 0; row < 3; ++row) {
			System.out.print(row + 1 + " ");
			for (int col = 0; col < 3; ++col) {
				System.out.print("|");
				System.out.print(" " + board[row][col] + " ");
				if (col == 2)
					System.out.print("|");

			}
			System.out.println();
			System.out.println("   -----------");

		}

	}

}