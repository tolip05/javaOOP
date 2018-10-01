package aaaaaa;

public enum First {
    TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6);

    private int value;

    First(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
