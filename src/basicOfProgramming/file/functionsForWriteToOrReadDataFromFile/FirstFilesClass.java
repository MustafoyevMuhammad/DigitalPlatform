package basicOfProgramming.file.functionsForWriteToOrReadDataFromFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FirstFilesClass {
    public static void main(String[] args) throws IOException {
        FileWriter newFilew = new FileWriter("MyInformation.txt");
        newFilew.write(564);
        newFilew.write("My name is Muhammad Mustafoyev");
        newFilew.close();


        FileReader myFiler = new FileReader("MyInformation.txt");
        Scanner sc= new Scanner(myFiler);
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
        myFiler.close();
        char[] characters = new char[100];
        myFiler = new FileReader("MyInformation.txt");
        myFiler.read(characters);
        System.out.println(characters);
        myFiler.close();
    }
}
