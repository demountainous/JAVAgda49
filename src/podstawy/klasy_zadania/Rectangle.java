package podstawy.klasy_zadania;

public class Rectangle {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getArea(){
        return a*b;
    }

    public int getPerimeter(){
        return 2*b + 2*a;
    }
}
