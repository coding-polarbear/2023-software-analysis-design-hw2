package problem3;

import problem2.factory.CarPartsFactory;

/**
 * ==============BEGIN==============
 * Complete the below code that requires your implementation
 * If necessary, you can make your own methods or classes so that the corresponding tests are passed
 */
public class CarBuilder implements Builder{
    private Car car;
    private CarPartsFactory factory;

    public CarBuilder(CarPartsFactory factory) {
        this.factory = factory;
        this.car = new Car();
        car.setCompanyName(factory.getCompanyName());
    }

    @Override
    public Builder addDoors(int numDoors) {
        for(int i = 0; i < numDoors; i++) {
            car.addDoor(factory.createDoor());
        }
        return this;
    }

    @Override
    public Builder addWheels(int numWheels) {
        for(int i = 0; i < numWheels; i++) {
            car.addWheel(factory.createWheel());
        }
        return this;
    }

    @Override
    public Builder setRoof() {
        car.setRoof(factory.createRoof());
        return this;
    }

    @Override
    public Builder setColor(Color color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Car getCar() {
        return car;
    }

    @Override
    public void reset() {
        this.car = new Car();
    }
}
/**
 * ===============END===============
 */
