import java.util.List;

public record Owner(
        String name,
        int age,
        String address,
        List<Animal> animalList
) {
}
