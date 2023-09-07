import java.io.*;

public class File_I_O {
    public static void main(String[] args) throws IOException {


        System.out.println("Hello world!");

        String file = "C:\\Users\\BE218\\JavaFile\\arrivingAnimals.txt";
        String outPut = "C:\\Users\\BE218\\JavaFile\\myNewFile.txt";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {

                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // create a writer
        BufferedWriter writer = new BufferedWriter( new FileWriter(outPut));

        try {
            writer.write("this is a line of animals..");
            // Write to our file with a for loop
            for (int i = 0; i<10; i++) {
                writer.write("\n i is: " + i );
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}