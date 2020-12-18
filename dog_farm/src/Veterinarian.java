import java.util.List;

public class Veterinarian {

    public void examineDogs(List<Dog> dogs){
        System.out.println("DOGS EXAMINATION BY VET");
        for(Dog dog : dogs) {
            System.out.println(dog.getName() + " is examined by vet");
            if (!dog.isHealthy()) {
                cureDog(dog);
            }
        }
    }

    private void cureDog(Dog dog){
        dog.setHealthy(true);
        System.out.println(dog.getName() + " is cured by vet");
    }
}
