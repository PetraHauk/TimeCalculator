public class TimeCalculator {

    public double calculateTime(double distance, double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be positive");
        } else {
            double time = distance / speed;
            return time;
        }
    }
}
