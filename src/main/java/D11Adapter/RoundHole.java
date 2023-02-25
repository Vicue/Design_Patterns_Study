package D11Adapter;

/**
 * @author zhyao
 * @date 2023/2/25 16:55
 */
public class RoundHole {

    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return peg.getRadius() == radius;
    }
}
