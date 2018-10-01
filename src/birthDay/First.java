package birthDay;

public class First extends Data {
    private String name;
    private String secName;
    protected First(String name, String secName, String burtDay) {
        super(burtDay);
        this.name = name;
        this.secName = secName;
    }
}
