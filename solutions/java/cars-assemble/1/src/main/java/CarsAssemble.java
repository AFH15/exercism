public class CarsAssemble {
    private static final int rate = 221;
    private static final double SUCCESS_RATE_1 = 1.00;
    private static final double SUCCESS_RATE_2 = 0.90;
    private static final double SUCCESS_RATE_3 = 0.80;
    private static final double SUCCESS_RATE_4 = 0.77;
    

    public double productionRatePerHour(int speed) {
        if (1 <= speed && speed <= 4){
            return speed * rate * SUCCESS_RATE_1;
        } 
        if (5 <= speed && speed <= 8){
            return speed * rate * SUCCESS_RATE_2;
        }
        if (speed == 9){
            return speed * rate * SUCCESS_RATE_3;
        }
        if (speed == 10){
            return speed * rate * SUCCESS_RATE_4;
        }
        return speed * rate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60; 
    }
}
