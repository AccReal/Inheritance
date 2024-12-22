public class Main {
    public static void main(String[] args) {
        // Создание объекта класса Animal
        Animal genericAnimal = new Animal("Generic Animal");
        genericAnimal.eat();
        genericAnimal.sleep();

        // Создание объекта класса Dog (наследника)
        Dog dog = new Dog("Buddy");
        dog.eat(); // Вызов переопределённого метода
        dog.sleep(); // Вызов метода родителя
        dog.bark(); // Вызов метода, уникального для Dog
    }
}
