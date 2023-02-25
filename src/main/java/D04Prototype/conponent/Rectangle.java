package D04Prototype.conponent;

/**
 * @author zhyao
 * @date 2023/1/16 3:18
 */
public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle() {

    }



    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", X=" + X +
                ", Y=" + Y +
                ", color='" + color + '\'' +
                '}';
    }
}
