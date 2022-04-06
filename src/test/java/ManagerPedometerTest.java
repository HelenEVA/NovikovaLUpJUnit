import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashMap;
import java.util.Map;

public class ManagerPedometerTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"ManagerPedometer.csv"})

    public void getHowManySteps (int day, int steps, int expected) {

        ManagerPedometer mp = new ManagerPedometer();
        mp.add(1, 72);
        mp.add(2, 68);

        int actual = mp.add(day, steps);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void getCompareTo(){
        ManagerPedometer mp1 = new ManagerPedometer();
        ManagerPedometer mp2 = new ManagerPedometer();

        mp1.add(1, 42);
        mp1.add(2,68);


        mp2.add(1,98);
        mp2.add(2,100);

        int expected = -88;
        int actual = mp1.compareTo(mp2);
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void getComparatorTest(){

        ManagerPedometer mp1 = new ManagerPedometer();
        ManagerPedometer mp2 = new ManagerPedometer();

        mp1.add(1, 42);
        mp1.add(2,68);
        mp1.add(-2,7);
        mp1.add(3,7);
        mp1.add(4,-34);


        mp2.add(1,98);
        mp2.add(2,100);
        mp2.add(3,75);
        mp2.add(4,77);
        mp2.add(4,-77);


        ManagerPedometerComparator comparator = new ManagerPedometerComparator(50);

        int expected = -3;
        int actual = comparator.compare(mp1, mp2);

        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void shouldStepsMore10000(){

        ManagerPedometer mp = new ManagerPedometer();
        int minSteps = 10000;

        mp.add(1, 11000);
        mp.add(2,9068);
        mp.add(3,100);

        Map<Integer, Boolean> expected = new HashMap<>();

        expected.put(1,true);

        Map<Integer, Boolean> actual = mp.printAllDaysByCriteria(step -> step > minSteps);
        for (int steps : actual.keySet()) {
            System.out.println("День " + steps + " " + actual.get(steps));
        }

        Assertions.assertEquals(expected,actual);

    }

    @Test

    public void shouldSumStepsOf2day(){

        ManagerPedometer mp = new ManagerPedometer();
        int minSteps = 10000;

        mp.add(1, 1000);
        mp.add(2,9000);
        mp.add(2,3000);
        mp.add(3,900);

        Map<Integer, Boolean> expected = new HashMap<>();

        expected.put(2,true);

        Map<Integer, Boolean> actual = mp.printAllDaysByCriteria(step -> step > minSteps);
        for (int steps : actual.keySet()) {
            System.out.println("День " + steps + " " + actual.get(steps));
        }

        Assertions.assertEquals(expected,actual);

    }

    @Test

    public void shouldSteps(){

        ManagerPedometer mp = new ManagerPedometer();
        int minSteps = 10000;

        mp.add(1, 11000);
        mp.add(2,9000);
        mp.add(2,3000);
        mp.add(3,90000);

        Map<Integer, Boolean> expected = new HashMap<>();

        expected.put(1,true);
        expected.put(2,true);
        expected.put(3,true);

        Map<Integer, Boolean> actual = mp.printAllDaysByCriteria(step -> step > minSteps);
        for (int steps : actual.keySet()) {
            System.out.println("День " + steps + " " + actual.get(steps));
        }

        Assertions.assertEquals(expected,actual);

    }

}