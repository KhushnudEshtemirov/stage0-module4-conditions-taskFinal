package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (0 < x && y > 0) {
            System.out.println("first");
        } else if (0 > x && y > 0) {
            System.out.println("second");
        } else if (0 > x && y < 0) {
            System.out.println("third");
        } else if (0 < x && y < 0) {
            System.out.println("fourth");
        } else {
            System.out.println("zero");
        }
    }
}
