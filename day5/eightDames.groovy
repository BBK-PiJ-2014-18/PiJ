class ChessBoard {
	boolean[][] queenBoard = new boolean[8][8];
	int totalQueens = 0;

	boolean[][] placeQueen (int x, int y) {
		queenBoard[x][y] = true;
		totalQueens++;
		return queenBoard;
	}

	boolean[][] removeQueen (int x, int y) {
		queenBoard[x][y] = false;
		totalQueens --;
		return queenBoard;		
	}

	void printBoard() {
		System.out.println("trying to print");
		int i, j;
		for (i = 0; i <=7; i++) {
			for (j = 0; j <= 7; j++) {
				if(queenBoard[i][j]) {
					System.out.print("X ");
				} else {
					System.out.print("- ");
				}		
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Total queens is: " + totalQueens);
		System.out.println();
		
	}	


}
	
test = new ChessBoard();
test.printBoard();
test.placeQueen(3,3);
test.placeQueen(4,4);
test.placeQueen(5,5);
test.printBoard();
test.removeQueen(4,4);
test.printBoard();
