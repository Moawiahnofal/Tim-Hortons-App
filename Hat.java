package assignment7_000875260;

import javafx.scene.paint.Color;
import java.util.Scanner;
/*
 @Author Moawiah Nofal - 000875260
* */
public class Hat extends TimsProduct {

    private Color color;

    private Hat(String name, Color color, double cost, double price) {
        super(name, cost, price);
        this.color = color;
    }

    public static Hat create() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter item color: ");
        String itemColor = scanner.nextLine();
        Color color = Color.RED;
        switch (itemColor.toLowerCase()) {
            case "red":
                color = Color.RED;
            case "blue":
                color = Color.BLUE;
            case "black":
                color = Color.BLACK;
        }
        System.out.println("Enter item cost: ");
        double itemCost = scanner.nextDouble();
        System.out.println("Enter item price: ");
        double itemPrice = scanner.nextDouble();
        return new Hat("Hat", color, itemCost, itemPrice);
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Hat" + "(" +
                "color= " + color.toString() +
                ")";
    }
}
