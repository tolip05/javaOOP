package birthDay;

public abstract class Data implements BurthDay{
    private String burtDay;

    protected Data(String burtDay) {
        this.burtDay = burtDay;
    }

    @Override
    public String getBirthDay() {
        return this.burtDay;
    }
}
