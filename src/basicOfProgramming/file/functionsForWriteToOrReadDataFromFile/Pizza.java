package basicOfProgramming.file.functionsForWriteToOrReadDataFromFile;

public class Pizza {
    String pizza;
    int quantity;
    float cost;

    public Pizza(String pizza, int quantity, float cost) {
        this.pizza = pizza;
        this.quantity = quantity;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizza='" + pizza + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}

