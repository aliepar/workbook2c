public class Main {
    public static void main(String[] args) {
        int [][] integers = new int[2][3]; // int [row][col]
        integers[0][0] = 90;
        integers[0][1] = 75;
        integers[0][2] = 80;
        integers[1][0] = 70;
        integers[1][1] = 56;
        integers[1][2] = 75;
        for (int i=0; i<integers.length; i++) {
            for (int j=0; j<integers[i].length; j++) {
                System.out.print(integers[i][j] +  " ");
            }
            System.out.println(" ");
        }
    }
}
