import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterUnitTest {


    @Test
    public void testCounterIncreases() {
        Counter counter = new Counter();
        counter.increment();
        assertEquals(1, counter.getCount());
    }
}
