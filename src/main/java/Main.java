import java.util.List;

public class Main {
    public static void main(String[] args) {
        Species dogs = new Species("dog", 1000);
        Species cats = new Species("cat", 200);
        Species rabbits = new Species("rabbit", 150);
        Species parrots = new Species("parrot", 400);
        Species turtles = new Species("turtle", 600);


        Animal dog = new Animal(1, "Buddy", dogs, 3);
        Animal dog2 = new Animal(6, "Buddy", dogs, 3);

        Animal cat = new Animal(2, "Whiskers", cats, 2);
        Animal parrot = new Animal(3, "Polly", parrots, 4);
        Animal rabbit = new Animal(4, "Thumper", rabbits, 1);
        Animal turtle = new Animal(5, "Shelly", turtles, 10);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(parrot);
        System.out.println(rabbit);
        System.out.println(turtle);

        System.out.println(dog.equals(cat));
        System.out.println(dog.equals(parrot));
        System.out.println(dog.equals(rabbit));
        System.out.println(dog.equals(turtle));

        System.out.println(dog.equals(dog2));

        System.out.println(dog.name().equals(dog2.name()));

        // Nesting ------------------------------------------------------------------

        Owner pourya = new Owner("Pourya", 33, "123 Main St", List.of(dog, cat));
        Owner eva = new Owner("Eva", 15, "456 Elm St", List.of(parrot));
        Owner rinae = new Owner("Charlie", 14, "789 Oak St", List.of(rabbit, turtle));

        System.out.println(pourya);
        System.out.println(eva);
        System.out.println(rinae);
    }
}
