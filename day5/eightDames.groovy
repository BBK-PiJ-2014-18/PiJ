boolean[][] placeEight (int x, int y) {
	boolean[][] result;
	result = new boolean[8][8];
	result[x][y] = true;
	return result;
}

void printBoard(boolean[][] chessBoard) {
	int i, j;
	for (i = 0; i <=7; i++) {
		for (j = 0; j <= 7; j++) {
			if(chessBoard[i][j]) {
				System.out.print("X");
			} else {
				System.out.print(".");
			}		
		}
		System.out.println();
	}	
}	
	
	
boolean[][] chessBoard;
chessBoard = new boolean[8][8];
chessBoard = placeEight(3,3);
printBoard(chessBoard);
