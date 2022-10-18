package basicOfProgramming.file.functionsForWriteToOrReadDataFromFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

public class Enqueue {
    Queue<Orders>waitingList;
    FileWriter courierlist;
    public Enqueue() throws IOException {
        waitingList = new ArrayDeque<>();
        courierlist = new FileWriter("CouriorList");
    }
    public void push(Orders orders){
        if(new Orders().isPaid())
            waitingList.add(orders);
        else
            System.out.println("please pay to your orders");
    }
    public void pop() throws IOException {
         courierlist.write(waitingList.poll().toString());
    }
}
