class NeedForSpeed {
    public int speed;
    private int battery=100;
    public int batteryDrain;
    private int distanceDriven;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed=speed;
        this.batteryDrain=batteryDrain;
    }

    public boolean batteryDrained() {
        return battery<batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()){
        distanceDriven+=speed;
        battery-=batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance=distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDistance=(100/car.batteryDrain)*car.speed;
        return maxDistance>=distance;
    }
}
