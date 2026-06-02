import java.util.stream.*;

public class NQueensCheck {

    public static void main(String[] args){

        int[] board = {0,4,7,5,2,6,1,3};

        boolean valid =
            IntStream.range(0,board.length)
                     .allMatch(i ->
                         IntStream.range(i+1,board.length)
                                  .allMatch(j ->
                                      board[i] != board[j] &&
                                      Math.abs(board[i]-board[j])
                                      != Math.abs(i-j)
                                  )
                     );

        System.out.println(valid);
    }
}
