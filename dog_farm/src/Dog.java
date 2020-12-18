public class Dog {

    private final String name;
    private int age;
    private boolean isHealthy;
    private boolean isFed;
    private boolean isTrained;

    public Dog(String name, int age, boolean isHealthy) {
        this.name = name;
        this.age = age;
        this.isHealthy = isHealthy;
    }

    public AgeCategory getAgeCategory(){
        switch (this.age){
            case 0:
                return AgeCategory.PUPPY;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return AgeCategory.ADULT;
            default:
                return AgeCategory.SENIOR;
        }
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public boolean isFed() {
        return isFed;
    }

    public void setFed(boolean fed) {
        isFed = fed;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

}
