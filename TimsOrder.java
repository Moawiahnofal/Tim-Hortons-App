package assignment7_000875260;

import java.util.Scanner;

/*
 @Author Moawiah Nofal - 000875260
* */
public class TimsOrder {
    private int size;
    private String name;
    static TimsProduct[] timsOrder;

    private TimsOrder(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public static TimsOrder create() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter user name: ");
        String userName = scanner.nextLine();
        System.out.println("Enter order size: ");
        int orderSize = scanner.nextInt();
        timsOrder = new TimsProduct[orderSize];
        for (int i = 0; i < timsOrder.length; i++) {
            System.out.println("Please enter the product type: 1= Donut, 2= coffee, 3= Mug, 4= hat");
            int orderType = scanner.nextInt();
            switch (orderType) {
                case 1:
                    Donut donut = Donut.create();
                    timsOrder[i] = donut;
                    break;
                case 2:
                    Coffee coffee = Coffee.create();
                    timsOrder[i] = coffee;
                    break;
                case 3:
                    Mug mug = Mug.create();
                    timsOrder[i] = mug;
                    break;
                case 4:
                    Hat hat = Hat.create();
                    timsOrder[i] = hat;
                    break;
            }
        }

        return new TimsOrder(userName, orderSize);
    }

    public Double getAmountDue() {
        double sum = 0;
        for (int i = 0; i < timsOrder.length; i++) {
            sum += timsOrder[i].getRetailPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        String output = "";
        output = "Order for: " + name + "\n";
        for (int i = 0; i < timsOrder.length; i++) {
            output += timsOrder[i].toString() + "\n";
        }
        return output;
    }
}
