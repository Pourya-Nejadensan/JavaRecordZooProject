public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(1, "Buddy", "Dog", 3);
        Animal cat = new Animal(2, "Whiskers", "Cat", 2);
        Animal parrot = new Animal(3, "Polly", "Parrot", 4);
        Animal rabbit = new Animal(4, "Thumper", "Rabbit", 1);
        Animal turtle = new Animal(5, "Shelly", "Turtle", 10);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(parrot);
        System.out.println(rabbit);
        System.out.println(turtle);

        System.out.println(dog.equals(cat));
        System.out.println(dog.equals(parrot));
        System.out.println(dog.equals(rabbit));
        System.out.println(dog.equals(turtle));
    }
}
