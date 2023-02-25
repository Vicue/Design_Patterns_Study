package D03Builder.builder;

import D03Builder.pojo.Car;

/**
 * @author zhyao
 * @date 2023/1/15 3:06
 */
public class CarBuilder implements Builder{

    private Car car = new Car();

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.setSeat(number);
    }

    @Override
    public void setEngine(String name) {
        car.setEngine(name);
    }

    @Override
    public void setTripComputer() {
        car.setTripComputer("car trip computer");
    }

    @Override
    public void setGPS() {
        car.setGPS("car GPS");
    }

    public Car getResult() {
        Car result = this.car;
        this.reset();
        return result;
    }
}
