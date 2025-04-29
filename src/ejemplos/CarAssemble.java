package ejemplos;

public class CarAssemble {

    public static double productionRatePerHour(int speed){
        final int LOWEST_SPEED = 221;
        double rate = speed * LOWEST_SPEED;

        if(speed >= 5 && speed <= 8){
            rate *= 0.9;
        }else if (speed == 9) {
            rate *= 0.8;
        }else if (speed == 10){
            rate *= 0.77;
        }

        return rate;
    }

    public static int workingItemsPerMinute(int speed) {
        double operation = productionRatePerHour(speed) / 60;
        return (int) Math.floor(operation);
    }
}
