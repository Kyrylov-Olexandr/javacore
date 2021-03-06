package javacore.homework17;


public class Collection {
    static class Anonymous{
        void isOdd(){}
    }

    static class Static {
        void makeOdd() {
            for (Object elem : Collection.array) {
                int index = 0;
                if ((Integer) elem % 2 == 0) {
                    System.out.println((Integer)elem+1);
                }
                index+=2;
            }
        }
    }
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

    public static Object[] array;

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
        public Object next(){
            return array[++index];
        }


    }

    static class BackwardIterator implements Iterator {

        int index = array.length - 1;
        @Override
        public boolean hasNext() {
            return index <= array.length && index < 0;
        }

        @Override
        public Object next() {
            return array[index -= 2];
        }
    }



}
