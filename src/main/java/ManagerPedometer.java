import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class ManagerPedometer implements Comparable<ManagerPedometer> {

    private Map<Integer, Integer> data = new HashMap<>();
    private int max = 0;

    public int add(int day, int steps) {

        if (day <= 0 || day > 365) {
            throw new IllegalDayException(day);
        } else if (steps >= 0){
            int sumStepsDaily = data.getOrDefault(day, 0) + steps;
            data.put(day, sumStepsDaily);
            if (sumStepsDaily > max) {
                    max = sumStepsDaily;
                }
            return max + 1 - steps;

            }
            else {
                throw new IllegalStepsException(steps);
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

    public void printAllByCriteria(Predicate<Integer> predicate) {
        for (int day : data.keySet()) {
            if (predicate.test(data.get(day))) {
                System.out.println("День " + day + " шагов " + data.get(day));
            }
        }
    }


}