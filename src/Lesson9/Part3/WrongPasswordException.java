package Lesson9.Part3;

//Исключение для неправильно введенного пароля
public class WrongPasswordException extends Exception{

    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
