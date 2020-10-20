package javacore.homework10.task1;

public class TooManyCharactersException extends Exception {
    static String string;

    public TooManyCharactersException(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "TooManyCharactersException{}, In '" + string + "' is too many characters";
    }
}
