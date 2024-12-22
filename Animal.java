// Родительский класс
public class Animal {
    protected String name;

    // Конструктор
    public Animal(String name) {
        this.name = name;
    }

    // Метод для описания животного
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
