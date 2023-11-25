package problem4;

import problem2.factory.CarPartsFactory;
import problem3.Builder;
import problem3.Car;

/**
 * ==============BEGIN==============
 * Complete the below code that requires your implementation
 * If necessary, you can make your own methods or classes so that the corresponding tests are passed
 */
public class CheckingBuilderProxyDecorator extends BaseBuilderProxyDecorator {
    public CheckingBuilderProxyDecorator(Builder builder) {
        super(builder);
    }

    public CheckingBuilderProxyDecorator(CarPartsFactory factory) {
        super(factory);
    }

    @Override
    public Car getCar() {
        Car car = super.getCar();
        int doorSize = car.numDoors();
        int wheelSize = car.numWheels();
        int roofSize = car.numRoofs();
        boolean doorValid = doorSize < 4 || doorSize > 6;
        boolean wheelValid = wheelSize < 2 || wheelSize > 10 || wheelSize % 2 == 1;
        boolean roofValid = roofSize == 1;

        if(doorValid || wheelValid || !roofValid) {
            return null;
        } else {
            return car;
        }
    }
}
/**
 * ===============END===============
 */
