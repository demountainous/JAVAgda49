package podstawy.klasy_zadania;

import static java.lang.Math.PI;

public class Circle {
    private final int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double getArea(){
        return PI*r*r;
    }

    public double getPerimeter(){
        return 2*PI*r;
    }

}
