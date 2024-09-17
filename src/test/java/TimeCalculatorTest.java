import org.junit.Test;

import static org.junit.Assert.*;

public class TimeCalculatorTest {

    @Test
    public void testCalculateTime() {
        TimeCalculator timeCalculator = new TimeCalculator();
        double distance = 100;
        double speed = 10;
        double time = timeCalculator.calculateTime(distance, speed);
        assertEquals(10, time, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateTimeWithNegativeSpeed() {
        TimeCalculator timeCalculator = new TimeCalculator();
        double distance = 100;
        double speed = -10;
        timeCalculator.calculateTime(distance, speed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateTimeWithZeroSpeed() {
        TimeCalculator timeCalculator = new TimeCalculator();
        double distance = 100;
        double speed = 0;
        timeCalculator.calculateTime(distance, speed);
    }

    @Test
    public void testCalculateTimeWithBigNumbers() {
        TimeCalculator timeCalculator = new TimeCalculator();
        double distance = 1000000000;
        double speed = 100000000;
        double time = timeCalculator.calculateTime(distance, speed);
        assertEquals(10, time, 0.001);
    }
}
