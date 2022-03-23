import java.util.HashMap;
import java.util.Map;

public class ManagerPedometer {

    protected Map<Integer, Integer> data = new HashMap<>();

    public void add(int day, int steps){

        int sumStepsDaily = data.getOrDefault(day, 0) + steps;
        data.put(day, sumStepsDaily);

    }

    public int maxSteps(){
        int max = 0;
        for (int steps : data.values()){
            if (steps > max){
                max = steps;
            }
        }
        return max;
    }

}
