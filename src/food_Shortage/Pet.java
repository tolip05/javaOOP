package food_Shortage;


public class Pet implements BirthDay {
    private String name;
    private String birhtDay;

    protected Pet(String name, String birhtDay) {

        this.name = name;
        this.birhtDay = birhtDay;
    }

    @Override
    public String getBirthDay() {
        return this.birhtDay;
    }
}
