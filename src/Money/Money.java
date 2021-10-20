package Money;

class Main {
    public static void main(String[] args ) {
        Money amount1 = new Money(123, (byte) 45);
        Money amount2 = new Money(56, (byte) 39);
        System.out.println("Value 1 : " + amount1);
        System.out.println("Value 2 : " + amount2);
        System.out.println("Add : " + Money.add(amount1, amount2));
        System.out.println("Substract : " + Money.substract(amount1, amount2));
        System.out.println("Multiply : " + Money.multiply(amount1, amount2));
        System.out.println("Divide : " + Money.divide(amount1, amount2));
        System.out.println("More : " + Money.more(amount1, amount2));
        System.out.println("Less : " + Money.less(amount1, amount2));
        System.out.println("Equal : " + Money.equal(amount1, amount2));

    }

}

public class Money {
    private long money;
    private byte coins;

    public Money(long money, byte coins) {
        this.money = money;
        this.coins = coins;
    }

    public Money(double v) {
        this.money = (long) v;
        this.coins = (byte) ((v - money) * 100);
    }


    public double percentValue() {

        return money + (double) coins / 100;
    }

    public static Money add(Money val1, Money val2) {

        return new Money(val1.percentValue() + val2.percentValue());
    }

    public static Money substract(Money val1, Money val2) {
        return new Money(val1.percentValue() - val2.percentValue());
    }

    public static Money multiply(Money val1, Money val2) {
        return new Money(val1.percentValue() * val2.percentValue());
    }

    public static Money divide(Money val1, Money val2) {

        return new Money(val1.percentValue() / val2.percentValue());
    }

    public static boolean more(Money val1, Money val2) {

        return val1.percentValue() > val2.percentValue();
    }

    public static boolean less(Money val1, Money val2) {

        return val1.percentValue() < val2.percentValue();
    }

    public static boolean equal(Money val1, Money val2) {

        return val1.percentValue() == val2.percentValue();
    }


    @Override
    public String toString() {
        return
                money + "," +
                        coins;
    }
}