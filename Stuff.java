public class Point {
    

    private int value;

    public Point(int value) {
        this.value = value;

    }
    public void printAddAmount(int amt) {
        int value = amt;
        value+= 5;
        System.out.println(value);
    }

    public void printAmountMystery(int value) {
        int mystery = value+6;
        System.out.println(mystery);

    }
    public int getValue() {
        return value;
    }
}
