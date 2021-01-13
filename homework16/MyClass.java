package javacore.homework16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class MyClass {
    private String str;
    public MyClass(String str) {
    }

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException {
        MyClass myClass = new MyClass("Hello world");
        Field field = myClass.getClass().getDeclaredField("str");
        Constructor constructor = myClass.getClass().getConstructor(field.getType());
        field.set(field, "Hello big world");
    }
}

