package Lesson9.Part3;

import java.util.Scanner;

public class HomeWorkPart3 {

    private static String login;
    private static String password;
    private static String confirmPassword;

    public HomeWorkPart3() {

    }

    //Метод определения корректности введенного логина и пароля
    public static boolean myMethod(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean isRight = true;
        if(isRight) {
            if (login.length() > 20 || login.contains(" ")) {
                isRight = false;
                throw new WrongLoginException("Логин не должен содержать пробелов и более 20 символов.");
            }
            if (password.length() > 20 || password.contains(" ") || checkIntPassword(password)) {
                isRight = false;
                throw new WrongPasswordException("Пароль должен быть меньше 20 символов, " +
                        "не должен содержать пробелом и должен \n" +
                        "содержать хотя бы одну цифру");
            }
            if (!(confirmPassword.equals(password))) {
                isRight = false;
                throw new WrongPasswordException("Пароли должны быть равны.");
            }
        }
        System.out.println(isRight ? "Логин и пароль введены верно" : "");
        return isRight;
    }

    //Метод проверки наличия цифры в строке
    public static boolean checkIntPassword(String password) {
        boolean isInt = true;
        for (int i = 0; i < 10; i++) {
            int j = password.indexOf(""+i);
            if (j>=0) {
                isInt=false;
                break;
            }
        }
        return isInt;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
