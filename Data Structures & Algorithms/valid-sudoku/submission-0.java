class Solution {
    public boolean isValidSudoku(char[][] board) {
       
        for(int i=0;i<9;i++)
        {
             HashSet<Character> rowset = new HashSet<>();
        HashSet<Character> colset = new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(rowset.contains(board[i][j]))
                    {
                        return false;
                    }
                    rowset.add(board[i][j]);
                }

                if(board[j][i]!='.')
                {
                    if(colset.contains(board[j][i]))
                    {
                        return false;
                    }
                    colset.add(board[j][i]);
                }
            }
        }

        
        for(int row=0;row<9;row+=3)
        {
            for(int col=0;col<9;col+=3)
            {
                HashSet<Character> box =new HashSet<>();
                for(int i=row;i<row+3;i++)
                {
                    for(int j=col;j<col+3;j++)
                    {
                        if(board[i][j]!='.')
                        {
                            if(box.contains(board[i][j]))
                            {
                                return false;
                            }
                            box.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
