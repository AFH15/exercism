import java.util.List;
import java.util.Collections;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        List<ProductionRemoteControlCar> toBeSorted = cars;
        Collections.sort(toBeSorted);
        return toBeSorted;
    }
}
