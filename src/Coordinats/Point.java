package Coordinats;

public class Point {
    double coordinateX;
    double coordinateY;

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public static void findPoint(Point inputPoint) {

        if ((inputPoint.coordinateX < 7 && inputPoint.coordinateX > -1) &&
                (inputPoint.coordinateY < 9 && inputPoint.coordinateY > 1)) {
            System.out.println("point in Circle");
        }
        else if ((inputPoint.coordinateX > 7 || inputPoint.coordinateX < -1) ||
                (inputPoint.coordinateY > 9 || inputPoint.coordinateY < 1 )){
            System.out.println("point out Circle");
        }
        else {
            System.out.println("point on Circle");
        }

    }
}
