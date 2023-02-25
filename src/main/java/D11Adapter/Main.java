package D11Adapter;

import java.util.HashMap;

/**
 * @author zhyao
 * @date 2023/1/16 4:11
 */
public class Main {
    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        System.out.println("is fits? :" + hole.fits(peg));

        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);
        // 这里无法编译
        // System.out.println("is fits? :" + hole.fits(small_sqpeg));

        SquarePegAdapter smallAdapter = new SquarePegAdapter(small_sqpeg);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(large_sqpeg);

        System.out.println("Adapter: " + smallAdapter.getRadius());
        System.out.println("Adapter: " + largeAdapter.getRadius());


    }
}
