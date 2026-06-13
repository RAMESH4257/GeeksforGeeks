class Solution {

    boolean isSafe(int row, int col, ArrayList<Integer> board) {

        for(int r = 0; r < row; r++) {

            int c = board.get(r);

            if(c == col)
                return false;

            if(Math.abs(r - row) == Math.abs(c - col))
                return false;
        }

        return true;
    }

    void func(int row, int n,
              ArrayList<Integer> board,
              ArrayList<ArrayList<Integer>> ans) {

        if(row == n) {

            ArrayList<Integer> temp = new ArrayList<>();

            for(int x : board)
                temp.add(x + 1); // 1-based indexing

            ans.add(temp);
            return;
        }

        for(int col = 0; col < n; col++) {

            if(isSafe(row, col, board)) {

                board.set(row, col);

                func(row + 1, n, board, ans);

                board.set(row, -1);
            }
        }
    }

    public ArrayList<ArrayList<Integer>> nQueen(int n) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> board = new ArrayList<>();

        for(int i = 0; i < n; i++)
            board.add(-1);

        func(0, n, board, ans);

        return ans;
    }
}