package D04Prototype.conponent;

/**
 * @author zhyao
 * @date 2023/1/16 3:18
 */
public class Circle extends Shape{

    private int radius;

    public Circle() {

    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", X=" + X +
                ", Y=" + Y +
                ", color='" + color + '\'' + 
                '}';
    }
}
