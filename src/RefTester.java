import java.awt.*;

public class RefTester {
    public static void main(String[] args) {
        Point pt1, pt2;

        pt1 = new Point(100,100);  //przyp[isywanie referencji do zmiennej pt1
        pt2 = pt1; //przypisywanie referencji pt1 do pt2

        pt1.x =200;
        pt1.y =200;
        System.out.println("Punkt 1:" + pt1.x+ ", " + pt1.y);
        System.out.println("Punkt 2:" + pt2.x+ ", " + pt2.y);

    }
}
