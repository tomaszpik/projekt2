import java.awt.*;

public class PointSetter {

    public static void main(String[] args) {
        Point Location = new Point (4,13);

        System.out.printf("Położenie początkowe ");

        System.out.printf("X równe " + Location.x);
        System.out.printf("Z równe " + Location.y);

        System.out.printf("Przejscie do (7,9) " );
        Location.x = 7;
        Location.y = 6 ;


        System.out.printf("Położenie końcowe ");
        show(Location);
    }

    static void show(Point point){

    }


}
