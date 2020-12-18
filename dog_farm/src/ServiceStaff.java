import java.util.List;

public class ServiceStaff {

    public void feedDogs(List<Dog> dogs){
        System.out.println("STAFF FEED DOGS");
        for(Dog dog : dogs){
            dog.setFed(true);
            System.out.println(dog.getName() + dog.getAgeCategory().getFood());
        }
    }

    public void cleanAviaries(List<Aviary> aviaries){
        System.out.println("STAFF CLEAN AVIARIES");
        for(Aviary aviary : aviaries){
            aviary.setCleaned(true);
            System.out.println(aviary.getName() + " is cleaned");
        }
    }

    public void keepDogsBusy(List<Dog> dogs){
        System.out.println("STAFF KEEP DOGS BUSY");
        for(Dog dog : dogs){
            System.out.println(dog.getName() + dog.getAgeCategory().getActivity());
            if(dog.getAgeCategory().equals(AgeCategory.PUPPY)){
                dog.setTrained(true);
            }
            dog.setFed(false);
        }
    }

}
