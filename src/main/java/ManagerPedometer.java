import java.util.HashMap;
import java.util.Map;

public class ManagerPedometer {

    private Map<Integer, Integer> data = new HashMap<>();
    private int max = 0;

    public int add(int day, int steps) {
        if (day <= 0 || steps < 0) {
            return -1;
        } else {
            int sumStepsDaily = data.getOrDefault(day, 0) + steps;
            data.put(day, sumStepsDaily);
            for (int valueSteps : data.values()) {
                if (steps > max) {
                    max = steps;
                }

            }
            System.out.println(max-steps+1);
            return max - steps + 1;

        }

    }
}
