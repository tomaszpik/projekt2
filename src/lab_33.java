public class lab_33 {
    public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            int year = 2018;
            for (int j = 1; j < DayCounter.countDays(i,year)+1; j++) {
                System.out.println(j+ "/"+ i + "/" + 2018 + "\n");
            }

        }
    }
}
