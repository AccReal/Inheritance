// Класс-наследник
public class Dog extends Animal {
    // Конструктор класса-наследника
    public Dog(String name) {
        super(name); // Вызов конструктора родительского класса
    }

    // Метод, уникальный для класса Dog
    public void bark() {
        System.out.println(name + " is barking.");
    }

    // Переопределение метода родительского класса
    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }
}
