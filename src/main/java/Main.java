public class Main {
    public static void main(String[] args) {

        ManagerPedometer mp1 = new ManagerPedometer();
        ManagerPedometer mp2 = new ManagerPedometer();

        mp1.add(1, 42);
        mp1.add(2,68);


        mp2.add(1,98);
        mp2.add(2,100);


        mp1.compareTo(mp2);

        ManagerPedometerComparator comparator = new ManagerPedometerComparator(50);
        comparator.compare(mp1, mp2);
    }
}
