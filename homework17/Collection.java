package javacore.homework17;

import java.util.NoSuchElementException;

public class Collection {
    /*

    Створити інтерфейс Iterator, в якому оголосити метод hasNext(), next(). Створити клас Collection,в якого оголосити як поле масив типу Number.
    Створити конструктор з визначеними параметрами куди передати даний масив. Створити два внутрішніх класи, які імплементуватимуть інтерфейс Iterator.
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

    private static Object[] array;

    public Collection(Number[] array) {
        Collection.array = array;
    }

    public ForwardIterator getForwardIterator () {
        return new ForwardIterator();
    }

    public BackwardIterator getBackwardIterator() {
        return new BackwardIterator();
    }

    static class ForwardIterator implements Iterator {

        int index = 0;


        @Override
        public boolean hasNext() {
            return index <= array.length;
        }

        @Override
        public Object next() throws NoSuchElementException {
            return array[index++];
        }


    }
    static class BackwardIterator implements Iterator {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Number next() {
            return null;
        }
    }

}
