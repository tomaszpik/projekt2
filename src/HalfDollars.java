public class HalfDollars {

    private static int[][][] arr3D;

    public static void main(String[] args) {
int[] denver = {1_700_000, 4_6000_000, 2_100_000};
        int[] philadelphia = {1_800_000, 5_0000_000, 1_000_000};
        int[] total=new int[denver.length];
        int sum = 0;

        for (int i = 0; i < denver.length; i++) {
            total[i] = denver[i] + philadelphia[i];
            System.out.print("Produkcja w " + (2012 + i) + "roku");
            System.out.format("%,d%n", total[i]);
            sum = total[i];

        }



    }
}
