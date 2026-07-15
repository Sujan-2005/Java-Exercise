public class JedliksToyCar {
    int meters=0;
    int percentage=100;
    public static JedliksToyCar buy() {
       return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+meters+" meters";
    }

    public String batteryDisplay() {
        if(percentage==0) return "Battery empty";
        else return "Battery at "+percentage+"%";
    }
      ;
    public void drive() {
        if(percentage>0){
        meters+=20;
        percentage--;
        }
    }
}
