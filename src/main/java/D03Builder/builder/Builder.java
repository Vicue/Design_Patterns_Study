package D03Builder.builder;

/**
 * @author zhyao
 * @date 2023/1/15 3:04
 */
public interface Builder {

    void reset();

    void setSeats(int number);

    void setEngine(String name);

    void setTripComputer();

    void setGPS();
}
