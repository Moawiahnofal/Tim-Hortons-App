package assignment7_000875260;

/*
 @Author Moawiah Nofal - 000875260
* */
public class TestClass {
    public static void main(String[] args) {
        TimsOrder t = TimsOrder.create();
        System.out.println(t);
        System.out.printf("Total Price: $%.2f\n", t.getAmountDue());
    }
}
