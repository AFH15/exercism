
class BirdWatcher {
    private final int[] birdsPerDay;
    private int today;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = new int[] {0,2,5,3,7,8,4};
        return lastWeek;
    }

    public int getToday() {
        today = birdsPerDay.length - 1;
        return birdsPerDay[today];
    }

    public void incrementTodaysCount() {
        today = birdsPerDay.length - 1;
        birdsPerDay[today]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] == 0){
                return true;
            } 
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int days = numberOfDays;
        int total = 0;
        if (numberOfDays > birdsPerDay.length){
            days = birdsPerDay.length;
        }
        for (int i  = 0; i < days; i++){
                total += birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int totalBusyDays = 0;
        
        for (int i = 0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] >= 5){
                totalBusyDays++;
            }
        }
        return totalBusyDays;
    }
}
