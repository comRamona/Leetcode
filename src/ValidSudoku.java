import java.util.HashSet;
import java.util.Set;

/**
 * Created by rama on 05/01/16.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set, set2;
        for (int i = 0; i < 9; i++) {
            set = new HashSet<Character>();
            set2 = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (!set.add(board[i][j]) && board[i][j] != '.') return false;
                if (!set2.add(board[j][i]) && board[j][i] != '.') return false;
            }
        }
        // checking 9 boxes
        for (int x = 0; x < 9; x += 3) {
            for (int y = 0; y < 9; y += 3) {
                set = new HashSet<Character>();
                for (int i = x; i < x + 3; i++) {
                    for (int j = y; j < y + 3; j++) {
                        if (!set.add(board[i][j]) && board[i][j] != '.') return false;
                    }
                }
            }
        }
        return true;
    }
}
