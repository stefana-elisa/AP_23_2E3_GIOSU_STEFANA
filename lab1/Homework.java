package lab1;
/**
 *
 * @author Giosu Stefana
 */
public class Homework {
    public static void main(String[] args){
        long startTime = System.nanoTime();
        int n = 0;

        if(args.length > 0){
            try{
                n = Integer.parseInt(args[0]);
            } catch(NumberFormatException e){
                System.err.println("Argument " + args[0] + " must be an integer.");
                System.exit(1);
            }
        }

        int[][] latinSquare = new int[n][n];

        for(int i = 0; i < n; i++)
            latinSquare[0][i] = i+1;

        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++)
                latinSquare[i][j] = latinSquare[i-1][j-1];

            latinSquare[i][0] = latinSquare[i-1][n-1];
        }

        long endTime = System.nanoTime();

        if(n < 100) {
            String rand = "";
            for (int i = 0; i < n; i++) {
                System.out.print("Linia " + i + ": ");
                for (int j = 0; j < n; j++) {
                    rand = rand + String.valueOf(latinSquare[i][j]);
                }
                System.out.println(rand);
                rand = "";
            }

            String col = "";
            for (int i = 0; i < n; i++) {
                System.out.print("Coloana " + i + ": ");
                for (int j = 0; j < n; j++) {
                    col = col + String.valueOf(latinSquare[j][i]);
                }
                System.out.println(col);
                col = "";
            }
        }
        else{
            System.out.println("Took "+(endTime - startTime) + " ns");
        }
    }
}
