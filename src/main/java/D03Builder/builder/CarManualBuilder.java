package D03Builder.builder;

import D03Builder.pojo.Manual;

/**
 * @author zhyao
 * @date 2023/1/15 3:10
 */
public class CarManualBuilder implements Builder{

    private Manual manual = new Manual();

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        manual.setSeat(number);
    }

    @Override
    public void setEngine(String name) {
        manual.setEngine(name);
    }

    @Override
    public void setTripComputer() {
        manual.setTripComputer("Manual trip computer");
    }

    @Override
    public void setGPS() {
        manual.setGPS("Manual GPS");
    }

    public Manual getResult() {
        Manual result = this.manual;
        this.reset();
        return result;
    }
}
