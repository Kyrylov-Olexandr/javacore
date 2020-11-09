package javacore.homework17;

import java.util.HashSet;
import java.util.Set;

public class Main {
    /*

    Створити інтерфейс Iterator, в якому оголосити метод hasNext(), next(). Створити клас Collection,в якого оголосити як поле масив типу Number. Створити конструктор з визначеними параметрами куди передати даний масив. Створити два внутрішніх класи, які імплементуватимуть інтерфейс Iterator.
            Мінімум:
    Перевизначити методи так щоб:
            1. Першого класу виводили значення масиву від першого до останнього.
    Зробити заміну непарних елементів на нуль і вивести на екран даний масив.
            2. Другого класу виводили від останнього до першого значення через одну цифру.
            Максимум:
            3. Створити анонімний клас який повинен : прогнати від останнього до першого елементу масиву.
    Перевірити кожен третій елемент масиву від останнього чи він непарний,
    якщо так то вивести дані елементи на консоль.
            4. Створити Локальний клас який повинен: пройтись від першого до останнього елементу масиву,
    перевірити кожен п’ятий елемент масиву, якщо він парний то відняти від нього число 100,
    і вивести на консоль ці числа.
            5.Створити статичний клас який повинен: пройтись від першого до останнього елемента масиву.
    Перевірити кожен другий елемент масив на парність, якщо він парний,
    тоді зробити з нього непарний і вивести дані елементи на консоль

     */


    public static void main(String[] args) {
        //task 1-2
        Integer[] a = {1,2,3,4,5,6,7,8,9,10,11};
        Collection collection = new Collection(a);
        Collection.ForwardIterator forwardIterator = collection.getForwardIterator();
        Collection.BackwardIterator backwardIterator = collection.getBackwardIterator();
        System.out.println(
                forwardIterator.hasNext() + "\n" +
                forwardIterator.next() + "\n" +
                backwardIterator.hasNext() + "\n" +
                backwardIterator.next() + "\n"
        );

        //task 3-5
        Collection.Anonymous anonymous = new Collection.Anonymous() {
            @Override
            void isOdd() {

                for (Object elem : Collection.array) {
                    if ((Integer) elem % 2 != 0 && (Integer) elem % 3 == 0){
                        System.out.println(elem);
                    }

                }
            }
        };
        anonymous.isOdd();
        System.out.println();

        class LocalClass {
            void isEven(){
                for(Object elem : Collection.array) {
                    if ((Integer) elem % 2 == 0 && (Integer)elem % 5 == 0) {
                        System.out.println((Integer) elem - 100);
                    }
                }
            }
        }
        new LocalClass().isEven();
        System.out.println();

        new Collection.Static().makeOdd();
    }
}
