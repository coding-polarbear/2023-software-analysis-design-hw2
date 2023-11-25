package problem3;

import problem2.CompanyName;
import problem2.door.Door;
import problem2.roof.Roof;
import problem2.wheel.Wheel;

import java.util.ArrayList;
import java.util.List;

/**
 * ==============BEGIN==============
 * Complete the below code that requires your implementation
 * If necessary, you can make your own methods or classes so that the corresponding tests are passed
 */
public class Car {
    private List<Door> doors;
    private List<Wheel> wheels;
    private List<Roof> roofs;
    private Color color;
    private CompanyName companyName;

    public Car() {
        this.doors = new ArrayList<>();
        this.wheels = new ArrayList<>();
        this.roofs = new ArrayList<>();
        this.color = Color.BLACK;
    }

    public int numWheels() {
        return wheels.size();
    }

    public int numDoors() {
        return doors.size();
    }

    public int numRoofs() {
        return roofs.size();
    }

    public Color getColor() {
        return color;
    }

    public void addDoor(Door door) {
        doors.add(door);
    }

    public void addWheel(Wheel wheel) {
        wheels.add(wheel);
    }

    public void setRoof(Roof roof) {
        if(roofs.isEmpty()) {
            roofs.add(roof);
        } else {
            roofs.set(0, roof);
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public Roof getRoof() {
        return roofs.get(0);
    }
}
/**
 * ===============END===============
 */
