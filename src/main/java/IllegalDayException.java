public class IllegalDayException extends RuntimeException{

    public IllegalDayException(int day){

        super("День" + day + "введен некорректно");
    }
}
