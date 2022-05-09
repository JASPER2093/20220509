package pro0509;

public class Test {

    static void paint(Shape p) {
        p.draw();
    }

    public static void main(String[] args) {
        Shape ob1 = new Shape();
        Line ob2 = new Line();
        Circle ob3 = new Circle();
        Rect rect = new Rect();

        ob1.draw();
        ob2.draw();
        ob3.draw();
        rect.draw();
        rect.set(10, 20, 100, 100);
        System.out.println("----------------------");
        paint(ob1);
        paint(ob2);
        paint(ob3);
        System.out.println("----------------------");

    }

}
