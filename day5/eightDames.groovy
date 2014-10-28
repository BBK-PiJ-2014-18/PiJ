class ChessBoard {
	boolean[][] queenBoard = new boolean[8][8];
	int countQueens = 0;

	boolean[][] placeQueen (int x, int y) {
		queenBoard[x][y] = true;
		countQueens++;
		return queenBoard;
	}

	boolean[][] removeQueen (int x, int y) {
		queenBoard[x][y] = false;
		countQueens --;
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
		System.out.println("Total queens is: " + countQueens);
		System.out.println();
	}	

	boolean vaildPlacement(int x, int y) {
		return true;
	}

	boolean play(int countQueens) {
		
		if(countQueens == 8) {
			return true;
		}
		
		for (i=0; i <=7; i++) {
		
			for (j=0; j<=7; j++) {
				
				if(validPlacement(i,j)) {
					placeQueen(i,j);			
				
					if(play(countQueens)) {
						return true;
					} else {
						removeQueen(i,j);
					}				
				}		
			}
		}
		
	}	
		
		
		
}
test = new ChessBoard();
test.printBoard();




/* testing placing, removing, counting and printing board	
test = new ChessBoard();
test.printBoard();
test.placeQueen(3,3);
test.placeQueen(4,4);
test.placeQueen(5,5);
test.printBoard();
test.removeQueen(4,4);
test.printBoard();
*/