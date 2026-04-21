import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        int slot = getUserSlot();

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        if (isValidMove(board, row, col)) {
            board[row][col] = 'X';
        } else {
            System.out.println("Invalid move! Try again.");
        }

        printBoard(board);
    }

    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

    static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
    static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}