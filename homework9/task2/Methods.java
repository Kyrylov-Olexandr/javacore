package javacore.homework9.task2;


public class Methods {

    static void throwException(int a, int b, int result) throws Exception {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException();
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException();
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException();
        } else if (a > 0 && b > 0){
            throw new MyException();
        } else {
            System.out.println(result);
        }
    }

    static void plus(int a, int b) throws Exception {
        int result = a + b;
        throwException(a, b, result);
    }

    static void minus(int a, int b) throws Exception {
        int result = a - b;
        throwException(a, b, result);
    }

    static void devide(int a, int b) throws Exception {
        int result = a / b;
        throwException(a, b, result);
    }

    static void multiply(int a, int b) throws Exception {
        int result = a * b;
        throwException(a, b, result);
    }

    public static void main(String[] args) throws Exception {
        Thread plus = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    plus(-5,-1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread minus = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    minus(0,2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread devide = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    devide(12,0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread multiply = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    multiply(0,0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread multiply2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    multiply(12,2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        plus.run();
        minus.run();
        devide.run();
        multiply.run();
        multiply2.run();


    }



}
