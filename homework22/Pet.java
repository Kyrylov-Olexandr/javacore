package javacore.homework22;
//Використовуючи функціональні інтерфейси та лямбда вирази.
//1.Написати клас абстрактний Pet , в якому описати абстрактний метод voice(). Створити класи Cow, Cat, Dog ,
// які наслідуються від Pet. Перевизначити в них метод voice(), так, щоб викликаючи його в методі main,
// на консоль виводилось : “Я кіт- Мяууу-Мяууу”, “Я пес-Гаууу-Гаууу”, “Я корова- Мууу-Мууу”.
//2. Напишіть програму , яка моделюватиме кидок монети?
//3. Виведіть найменше і найбільше число типу float і double в експоненціальній формі?
//4. Створіть клас із двома перевантаженими конструкторами . Використовуючи ключове слово
//this, викличте один конструктор в іншому?
//5. Створіть клас з іменем Amphibia, створіть клас Frog, який унаслідується від Amphibia. Створіть в класі
// Amphibia методи : (їсти, спати , плавати, гуляти), які виводитимуть будь-який текст на консоль. Створіть
// в мейн методі екземпляр класу Frog, приведіть його до типу Amphibia , і викличте до об’єкту Frog всі методи класу Amphibia.
import java.lang.annotation.Target;
import java.util.function.*;
@FunctionalInterface
interface Pet {
     void voice();
}

class Cow implements Pet{

    @Override
    public void voice() {

    }
}
class Cat implements Pet {

    @Override
    public void voice() {
        System.out.println("Я кіт- Мяууу-Мяууу");
    }
}
class Dog implements Pet {

    @Override
    public void voice() {
        System.out.println("Я пес-Гаууу-Гаууу");
    }
}

