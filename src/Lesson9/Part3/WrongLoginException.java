package Lesson9.Part3;

//Исключение для неправильно введенного логина
public class WrongLoginException extends Exception{

    public WrongLoginException() {

    }

    public WrongLoginException(String message) {
        super(message);
    }

}
