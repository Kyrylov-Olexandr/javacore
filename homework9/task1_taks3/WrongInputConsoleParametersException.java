package javacore.homework9.task1_taks3;

public class WrongInputConsoleParametersException extends Exception{
    String wrongInput;

    public WrongInputConsoleParametersException(String wrongInput) {
        this.wrongInput = wrongInput;
    }

    public void setWrongInput(String wrongInput) {
        this.wrongInput = wrongInput;
    }

    @Override
    public String toString() {
        return "WrongInputConsoleParametersException{" +
                "wrongInput='" + wrongInput + '\'' +
                '}' + " Menu item " + wrongInput + " not found!";
    }
}
