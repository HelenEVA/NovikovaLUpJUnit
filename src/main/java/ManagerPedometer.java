import java.util.HashMap;
import java.util.Map;

public class ManagerPedometer implements Comparable<ManagerPedometer> {
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
            //System.out.println(max-sumStepsDaily+1);
            return max - sumStepsDaily + 1;

        }

    }

    public int sum() {
        int sum = 0;
        for (int steps : data.keySet()) {
            sum += data.get(steps);
        }
        //System.out.println(sum);
        return sum;

    }

    public int amountOfDays(int minSteps) {
        int amount = 0;
        for (int steps : data.values()) {
            if (steps > minSteps) {
                amount++;
            }
        }
        //System.out.println(amount);
        return amount;
    }

    @Override
    public int compareTo(ManagerPedometer managerPedometer) {
        return sum() - managerPedometer.sum();
    }


}
