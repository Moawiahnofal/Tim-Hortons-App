package assignment7_000875260;

import java.util.Scanner;

/*
 @Author Moawiah Nofal - 000875260
* */
public class Coffee extends TimsProduct implements Consumable {

    private String desciption;
    private int calorieCount;

    private Coffee(String name, String desciption, double cost, double price, int calories) {
        super(name, cost, price);
        this.desciption = desciption;
        this.calorieCount = calories;
    }

    public static Coffee create() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter item description: ");
        String itemDescription = scanner.nextLine();
        System.out.println("Enter item cost: ");
        double itemCost = scanner.nextDouble();
        System.out.println("Enter item price: ");
        double itemPrice = scanner.nextDouble();
        System.out.println("Enter item calories: ");
        int itemCalories = scanner.nextInt();
        return new Coffee("Coffee", itemDescription, itemCost, itemPrice, itemCalories);
    }

    public String getDesciption() {
        return desciption;
    }

    @Override
    public int getCalorieCount() {
        return 0;
    }

    @Override
    public String getConsumptionMethod() {
        return "Drink it!";
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Coffee" + "(" +
                "desciption= " + desciption +
                " ,calorieCount= " + calorieCount +
                ")";
    }
}
