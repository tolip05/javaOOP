package generic03;

public class Main {
    public static void main(String[] args) {
        Scale<Integer>scale = new Scale<>(1,5);
        System.out.println(scale.GetHeavier());
    }
}
