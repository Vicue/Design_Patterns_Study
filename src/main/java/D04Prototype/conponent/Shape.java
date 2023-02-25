package D04Prototype.conponent;

/**
 * @author zhyao
 * @date 2023/1/16 3:15
 */
public abstract class Shape {
    protected int X;
    protected int Y;
    protected String color;

    public Shape() {

    }

    public Shape(Shape source) {
        this();
        this.X = source.X;
        this.Y = source.Y;
        this.color = source.color;
    }

    @Override
    public abstract Shape clone();

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "X=" + X +
                ", Y=" + Y +
                ", color='" + color + '\'' +
                '}';
    }
}
