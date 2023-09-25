
public class DZ2 {

    public interface iSpeedCalculation {
        public double calculateAllowedSpeed(Vehicle vehicle);
    }

    public class CarSpeedCalculation implements iSpeedCalculation {

        @Override
        public double calculateAllowedSpeed(Vehicle vehicle) {
            return vehicle.getMaxSpeed() * 0.8;
        }
    }

    public class BusSpeedCalculation implements iSpeedCalculation {

        @Override
        public double calculateAllowedSpeed(DZ2.Vehicle vehicle) {
            return vehicle.getMaxSpeed() * 0.6;
        }
    }

    public class Vehicle {
        int maxSpeed;
        String type;

        public Vehicle(int maxSpeed, String type) {
            this.maxSpeed = maxSpeed;
            this.type = type;
        }

        public int getMaxSpeed() {
            return this.maxSpeed;
        }

        public String getType() {
            return this.type;
        }
    }
}