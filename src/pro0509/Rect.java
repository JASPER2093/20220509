package pro0509;

public class Rect extends Shape {
    int x1, x2, y1, y2;

    public void draw() {
        System.out.println("Rect");
    }

    public void set(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        System.out.println("사각형 좌표 출력");
        System.out.println("(" + x1 + "," + y1 + ")");
        System.out.println("(" + x2 + "," + y2 + ")");
    }

}
