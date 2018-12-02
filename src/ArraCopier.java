public class ArraCopier {
    public static void main(String[] args) {
        int[] arrSource={7, 4, 5, 1, 4, 1, 4};
        double[] arrTarget= new double[arrSource.length];
        System.out.print("arrSource: [");
        for (int i = 0; i <arrSource.length ; i++) {
            System.out.println(arrSource[i] + "  ");
        }
        System.out.println("]");
        int count =0;
        while (count< arrSource.length){
            arrTarget[count]=arrSource[count];
            System.out.println(arrTarget[count++] + "");
        }
        System.out.println("/]");
    }
}

