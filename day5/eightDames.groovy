// bit confused about why used "this." in some places and not others, 
// but works in groovy anyway!  (And...Recursion part not really to do with that aspect).

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
		System.out.println();
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

	boolean validPlacement(int x, int y) {
		// check row and column	
		for (int j = 0; j <= 7; j++) {
			if(this.queenBoard[x][j] == true) {	
				return false;
			}
			if(this.queenBoard[j][y] == true) {
				return false;
			}
		}
		// check diagonals
		for (int j = 0; j <= 7; j++) {
			if (x-j >= 0 && y-j >= 0) {
				if(this.queenBoard[x-j][y-j] == true) {
					return false;
				}	
			}	
			if (x+j <= 7 && y-j >= 0) {
				if(this.queenBoard[x+j][y-j] == true) {
					return false;
				}	
			}	
			if (x-j >= 0 && y+j <= 7) {
				if(this.queenBoard[x-j][y+j] == true) {
					return false;
				}	
			}	
			if (x+j <= 7 && y+j <= 7) {
				if(this.queenBoard[x+j][y+j] == true) {
					return false;
				}	
			}	
		}
		return true;
	}


	boolean playQueens(int countQueens) {
		
		if(countQueens == 8) {
			return true;
		} else {
		
			for (int i=0; i <=7; i++) {
				for (int j=0; j<=7; j++) {
				
					if(validPlacement(i,j)) {
							placeQueen(i,j);			
						if(playQueens(this.countQueens)) {
							return true;
						} else {
							removeQueen(i,j);
						}				
					}		

				}
			}			
		}
		return false;
	}	
}

test = new ChessBoard();
test.playQueens(1);
test.printBoard();



