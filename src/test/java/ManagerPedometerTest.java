import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ManagerPedometerTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"pedometer.csv"})

    public void getHowManySteps(int day, int steps, int expected) {

        ManagerPedometer mp = new ManagerPedometer();
        mp.add(1, 72);
        mp.add(2,68);

        int actual = mp.add(day, steps);

        Assertions.assertEquals(expected, actual);

    }


}
