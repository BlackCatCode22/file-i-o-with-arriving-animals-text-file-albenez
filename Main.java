import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        try {
            // create a file writer and open it
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\BE218\\javafile\\myNewFile.txt"));
            writer.write("Writing to a new file this is my first line");
            writer.write("\nThis is on a new line");
            writer.write("\nThis is a string and it is my third line");

            // close the file
            writer.close();

            // tell us that our program wrote in a file
            System.out.println("program wrote to a file!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\BE218\\javafile\\myNewFile.txt"));
            String myLine = "";
            while ((myLine = reader.readLine()) != null) {
                System.out.println(myLine);
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        String path = "C:\\Users\\BE218\\javafile\\arrivingAnimals.txt";
        String myFileline = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((myFileline = reader.readLine()) != null) {
                System.out.println(myFileline);
            }


    }
}