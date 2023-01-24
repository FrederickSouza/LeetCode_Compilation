class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> container = new HashSet();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				//System.out.print(board[i][j]);
				char x = board[i][j];
				if(x != '.') {
					if(!container.add(x + " in row " + i) || 
						!container.add(x + " in col " + j) ||
						!container.add(x + " block " + (i/3) + (j/3))) {
							return false;
					}	
				}	
			}
		}
		
		return true;
    }
}