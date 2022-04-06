import java.util.Comparator;

    public class ManagerPedometerComparator implements Comparator<ManagerPedometer> {
        private int minSteps;

        @Override
        public int compare(ManagerPedometer p1, ManagerPedometer p2) {
            return p1.amountOfDays(minSteps) - p2.amountOfDays(minSteps);
        }

        public ManagerPedometerComparator(int minSteps) {
            this.minSteps = minSteps;
        }

    }

