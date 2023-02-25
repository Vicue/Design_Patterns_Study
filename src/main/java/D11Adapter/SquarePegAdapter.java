package D11Adapter;

/**
 * @author zhyao
 * @date 2023/2/25 16:59
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;


    public SquarePegAdapter(SquarePeg peg) {
        super(-1);
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
