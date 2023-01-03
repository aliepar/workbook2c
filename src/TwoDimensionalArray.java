public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] names ={{"Ameena", "Bobby", "Dylan"},{"Charles","Hari"," "}} ;

        for (int i=0; i<names.length; i++) {
            for (int j=0; j<names[i].length; j++) {
                System.out.print(names[i][j] +  " ");
            }
            System.out.println(" ");
        }
    }
}
