package Point;

public class ColorPoint extends Point {

    private String color;
    public ColorPoint(int x, int y, String color) {
        super(x,y);
        this.color = color;
    }
    public void setPoint(int x, int y) {
        super.move(x, y);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void show() {
        System.out.println(color + "색으로 " + "(" + getX() + "," + getY() + ")");
    }
}

