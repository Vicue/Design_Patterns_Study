package D03Builder;

import D03Builder.builder.CarBuilder;
import D03Builder.pojo.Car;

/**
 * 建造者模式
 * @author zhyao
 * @date 2023/1/15 2:56
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.makeSportsCar(builder);
        Car car = builder.getResult();
        System.out.println(car);

    }
}
