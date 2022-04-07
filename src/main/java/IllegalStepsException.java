public class IllegalStepsException extends RuntimeException {

    public IllegalStepsException(int steps){
        super ("Количество шагов" + steps + "некорректно");
    }
}
