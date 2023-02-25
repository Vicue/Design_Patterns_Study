package D03Builder;

import D03Builder.builder.Builder;

/**
 * @author zhyao
 * @date 2023/1/15 3:14
 */
public class Director {

    public void makeSUV(Builder builder) {

    }

    public void makeSportsCar(Builder builder) {
        builder.setSeats(4);
        builder.setEngine("Sports Engine");
        builder.setTripComputer();
        builder.setGPS();
    }
}
