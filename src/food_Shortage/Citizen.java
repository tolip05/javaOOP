package food_Shortage;

public class Citizen extends BaseResident implements BirthDay,Bayer {
private String name;
private int age;
private int food;
private String birthDay;
    public Citizen( String name, int age,String id, String bIrthDay) {
        super(id);
        this.name = name;
        this.age = age;
        this.birthDay = bIrthDay;
        this.food = 0;


    }

    @Override
    public String getBirthDay() {
        return this.birthDay;
    }

    @Override
    public void byFood() {
      this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
