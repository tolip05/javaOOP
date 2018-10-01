package border_control;

public class Robot extends BaseResident implements BirthDay{
private String model;
private String birhtDay;
    protected Robot(String model, String id, String birhtDay) {
        super(id);
        this.model = model;
        this.birhtDay = birhtDay;
    }

    @Override
    public String getBirthDay() {
        return this.birhtDay;
    }
}
