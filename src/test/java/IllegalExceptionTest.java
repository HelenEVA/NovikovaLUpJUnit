import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IllegalExceptionTest {

    @Test

    public void isDayNegativeTest(){

        ManagerPedometer mp = new ManagerPedometer();

        Assertions.assertThrows(IllegalDayException.class,()->{
            mp.add(-1,3000);
        });
    }

    @Test

    public void isDayPositiveTest(){
        ManagerPedometer mp = new ManagerPedometer();

        Assertions.assertThrows(IllegalDayException.class,() -> {
            mp.add(366,3000);
        });
    }

    @Test

    public void isStepsNegativeTest(){
        ManagerPedometer mp = new ManagerPedometer();

        Assertions.assertThrows(IllegalStepsException.class,() -> {
            mp.add(1,-3000);
        });
    }

}
