package assignment7_000875260;

/*
 @Author Moawiah Nofal - 000875260
* */
public abstract class TimsProduct implements Commodity {
    private String name;
    private double cost;
    private double price;

    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getProductionCost() {
        return cost;
    }

    @Override
    public double getRetailPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TimsProduct" + "(" +
                "name= " + name +
                " ,cost= " + cost +
                " ,price= " + price +
                ")";
    }
}
