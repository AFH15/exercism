class NeedForSpeed {
    private static final int NITRO_SPEED = 50;
    private static final int NITRO_BATTERY_DRAIN = 4;
    private int speed;
    private int batteryDrain;
    private int metersDriven = 0;
    private int batteryPercentage = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if ((batteryPercentage - batteryDrain) < 0){
            return true;
        } else {
            return false;
        }
    }

    public int distanceDriven() {
        return metersDriven;
    }

    public void drive() {
        if ((batteryPercentage - batteryDrain) >= 0){
            metersDriven += speed;
            batteryPercentage -= batteryDrain;
        } else {
            
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(NITRO_SPEED, NITRO_BATTERY_DRAIN);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained()){
            car.drive();
        }
        if (car.distanceDriven() < this.distance){
            return false;
        } else {
            return true;
        }
    }
}
