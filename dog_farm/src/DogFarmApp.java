import java.util.ArrayList;
import java.util.List;

public class DogFarmApp {
    public static void main(String[] args) {
        ServiceStaff serviceStaff = new ServiceStaff();
        Veterinarian veterinarian = new Veterinarian();

        List<Aviary> aviaries = new ArrayList<>();
        aviaries.add(new Aviary("aviary 1"));
        aviaries.add(new Aviary("aviary 2"));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Sparky", 3, true));
        dogs.add(new Dog("Bob", 1, true));
        dogs.add(new Dog("Snezhok", 0, true));
        dogs.add(new Dog("Chuck", 9, false));
        dogs.add(new Dog("Lana", 4, true));

        DogFarmDay.liveADay(dogs, serviceStaff, veterinarian, aviaries);
    }

}
