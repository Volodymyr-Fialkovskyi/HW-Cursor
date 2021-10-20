package TestCircleSquare;

public class TestCircleSquare {
    public static void main(String[] args) {

        CircleSquare circle = new CircleSquare();
        System.out.println("Square = " + circle.getRadius());
    }
}

class CircleSquare {
    private double radius;

    public CircleSquare() {

        radius = 3.45;
    }

    public double getRadius() {
        double pi = 3.14;
        return (Math.pow(pi, 2 * radius));
    }
}
