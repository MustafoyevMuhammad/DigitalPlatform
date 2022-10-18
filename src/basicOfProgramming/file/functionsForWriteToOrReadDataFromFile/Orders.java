package basicOfProgramming.file.functionsForWriteToOrReadDataFromFile;

import java.util.List;

public class Orders {
    String name;
    String address;
    List<Pizza> list;
    float sum = 0;

    public Orders(String name, String address, List<Pizza> list, float sum) {
        this.name = name;
        this.address = address;
        this.list = list;
        this.sum = sum;
    }

    public Orders() {

    }

    public float paid(){

        float sum = 0;
        for (Pizza pizza : list) {
            sum += pizza.cost * pizza.quantity;
        }
        return sum;
    }
    public boolean isPaid(){
        return sum <= paid();
    }
}
