public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private static final int SPEED = 20;
    private int distanceTravelled = 0;
    
    @Override
    public void drive() {
        distanceTravelled += SPEED;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
