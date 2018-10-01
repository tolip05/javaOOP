package border_control;

public class Citizen extends BaseResident implements BirthDay {
private String name;
private int age;
private String birthDay;
    public Citizen( String name, int age, String id,String bIrthDay) {
        super(id);
        this.name = name;
        this.age = age;
        this.birthDay = bIrthDay;
    }

    @Override
    public String getBirthDay() {
        return this.birthDay;
    }
}
