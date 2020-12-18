import java.util.List;

public class DogFarmDay {

    public static void liveADay(List<Dog> dogs, ServiceStaff serviceStaff, Veterinarian veterinarian, List<Aviary> aviaries){

        serviceStaff.feedDogs(dogs);

        veterinarian.examineDogs(dogs);

        serviceStaff.cleanAviaries(aviaries);

        serviceStaff.keepDogsBusy(dogs);

        serviceStaff.feedDogs(dogs);
    }

}
