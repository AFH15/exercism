class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private static final int SPEED = 10;
    private int distanceTravelled = 0;
    private int numberOfVictories  = 0;
    
    @Override
    public void drive() {
        distanceTravelled += SPEED;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar prc){
        return Integer.compare(prc.numberOfVictories, this.numberOfVictories);
    }
}
