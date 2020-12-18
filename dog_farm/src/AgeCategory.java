public enum AgeCategory {
    PUPPY(" eats puppy food", " is trained at the training ground"),
    ADULT(" eats adults food", " goes to work"),
    SENIOR(" eats seniors food", " stays in the aviary");

    private String food;
    private String activity;

    AgeCategory(String food, String activity) {
        this.food = food;
        this.activity = activity;
    }

    public String getFood() {
        return food;
    }

    public String getActivity() {
        return activity;
    }

}
