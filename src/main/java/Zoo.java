import java.util.List;

public record Zoo(
        List<Animal> animalList
) {
    public int calcAllAnimalsFoodRequirement() {
        int sum = 0;
        for (Animal animal : animalList) {
         sum += animal.species().food();
        }
        return sum;
    }
}
