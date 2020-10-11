package Coin;

public class Main {
    public static void main(String[] args) {
        int coin = (int) ( Math.random() * 2 );
        String result = coin == 1 ? "Орел" : "Решка";
        System.out.println(result);

    }
}
