package lab1;
/**
 *
 * @author Giosu Stefana
 */
public class Bonus {
    public static void afisare(int[][] matrice, int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= n; j++)
                System.out.print(matrice[i][j] + " ");
            System.out.println();
        }
    }
    public static int[][] inmultire(int[][] matrice1, int[][] matrice2, int n){

        int[][] matriceResultat = new int[n+1][n+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                matriceResultat[i][j] = 0;
                for(int k = 1; k <= n; k++){
                    matriceResultat[i][j] += matrice1[i][k] * matrice2[k][j];
                }
            }
        }

        return matriceResultat;
    }
    public static int[][] matriceAdiacenta(int degree, int n){
        int[][] matrice = new int[n+1][n+1];



        return matrice;
    }

    public static void main(String[] args){
        int n = 5;
        int[][] cycleAdjMatrix = new int[n+1][n+1];

        cycleAdjMatrix[1][n] = cycleAdjMatrix[n][1] = 1;

        for(int i = 1; i < n; i++){
            cycleAdjMatrix[i][i+1] = 1;
            cycleAdjMatrix[i+1][i] = 1;
        }

        System.out.println("Matricea de adiacenta a grafului ciclic cu " + n + " noduri.");
        afisare(cycleAdjMatrix, n);

        int[][] matriceResultat = new int[n+1][n+1];
        matriceResultat = inmultire(cycleAdjMatrix, cycleAdjMatrix, n);
        System.out.println("Matricea de adiacenta la puterea " + 2 + " este: ");
        afisare(matriceResultat, n);

        for(int i = 3; i <= n; i++) {
            matriceResultat = inmultire(matriceResultat, cycleAdjMatrix, n);
            System.out.println("Matricea de adiacenta la puterea " + i + " este: ");
            afisare(matriceResultat, n);
        }
/*
        int m = 0;
        int degree = 0;
        if(args.length > 0){
            try{
                m = Integer.parseInt(args[0]);
                degree = Integer.parseInt(args[1]);
            } catch(NumberFormatException e){
                System.err.println("Argument " + args[0] + " and " + args[2] + " must be integers.");
                System.exit(1);
            }

            if( m < degree+1 || m * degree % 2 == 1) {
                System.err.println("This is not a regular graph!");
                System.exit(1);
            }
        }

//        System.out.println(m + " " + degree);
        int[][] matriceGrafRegulat = new int[m+1][m+1];*/



    }
}
