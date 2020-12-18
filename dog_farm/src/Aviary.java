public class Aviary {

    private String name;
    private boolean isCleaned;

    public Aviary(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCleaned() {
        return isCleaned;
    }

    public void setCleaned(boolean cleaned) {
        isCleaned = cleaned;
    }
}
