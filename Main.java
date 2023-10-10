import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;

// Main.java
// Driver class for the Zoo program
// dH
// 9/26/23

// updated Oct 5, 2023


public class Main {

    // Creating the genUniqueID method
    private static String genUniqueID(String theSpecies, int numOfSpecies) {
        String prefix = "";
        int suffix = numOfSpecies + 1;


        if (theSpecies.contains("hyena")) {
            prefix = "Hy";
        }

        return prefix + Integer.valueOf(suffix);

    }


    public static void main(String[] args) {

        System.out.println("\n welcome to my zoo program!! \n ");

        int myCounter = 1;

        // Load all species classes with name.
        // Call the static methods to create a lists of names.
        Lion.inputLionNames();
        Tiger.inputTigerNames();
        Bear.inputBearNames();
        Hyena.inputHyenaNames();



        // Open a csv file using the split() method on a string object
        String path = "C:\\Users\\BE218\\javaStuff\\arrivingAnimals.txt";
        String myFileLine = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((myFileLine = reader.readLine()) != null) {
                String[] myArray = myFileLine.split(",");
                // the input data from arrivingAnimals looks like this
                // 4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia

                // create a String array named myArrayOfAnimalData
                String[] myArrayOfAnimalData = myFileLine.split(",");

                //create an other String array named
                String[] myArrayOfAgeGenderSpecies = myArrayOfAnimalData[0].split(" ");

                // output the age, gender and species
                System.out.println("\n age in years: " + myArrayOfAgeGenderSpecies[0]);
                System.out.println("\n text for age in years (should be 'year') " + myArrayOfAgeGenderSpecies[1]);
                System.out.println("\n text for age in years (should be old) " + myArrayOfAgeGenderSpecies[2]);
                System.out.println("\n gender is " + myArrayOfAgeGenderSpecies[3]);
                System.out.println("\n species is " + myArrayOfAgeGenderSpecies[4]);

                // code up the brithDate() method

                // gets today's date
                // Create a Calendar instance and set it to the current date
                Calendar calendar = Calendar.getInstance();
                Date today = calendar.getTime();

                LocalDate currentDate = LocalDate.now();
                int year = currentDate.getYear();

                System.out.println("current year: " + year);

                int animalsYearsOfBrithDate = year - Integer.parseInt(myArrayOfAgeGenderSpecies[0]);

                // split the next group of words by a space
                String[] myArrayOfBirthSeason = myArrayOfAnimalData[1].split(" ");

                String brithSeason = myArrayOfBirthSeason[2];
                System.out.println();

                String myAnimalBD= "";

                if (brithSeason.contains("spring")) {
                    myAnimalBD = "Mar 31, " + animalsYearsOfBrithDate;
                }

                System.out.println(" Animal birth date is: " + myAnimalBD + "\n\n");

                // Subtract 4 years from the calendar
                calendar.add(Calendar.YEAR, - Integer.parseInt(myArrayOfAgeGenderSpecies[0]));

                // Get the updated date from the calendar
                Date yearsAgo = calendar.getTime();

                // Print the updated date
                System.out.println("Today's Date: " + today);
                System.out.println("Date " + myArrayOfAgeGenderSpecies[1] + " years ago: " + yearsAgo);







                System.out.println("\n species is " + myArrayOfAgeGenderSpecies[4]);
                System.out.println("\n Animal number " + myCounter + " ******");
                System.out.println("\n myArrayOfAnimalData[0] is.. " + myArrayOfAnimalData[0]);
                System.out.println("\n myArrayOfAnimalData[1] is.. " + myArrayOfAnimalData[1]);
                System.out.println("\n myArrayOfAnimalData[2] is.. " + myArrayOfAnimalData[2]);
                System.out.println("\n myArrayOfAnimalData[3] is.. " + myArrayOfAnimalData[3]);
                System.out.println("\n myArrayOfAnimalData[4] is.. " + myArrayOfAnimalData[4]);
                System.out.println("\n myArrayOfAnimalData[5] is.. " + myArrayOfAnimalData[5]);
                System.out.println("\n\n");

                //
                myCounter++;

                /*
                String myStr = myArray[0];
                System.out.println("\n myStr = " + myStr);
                myArray = myStr.split(" ");
                String mySpecies = myArray[4];
                System.out.println(" Species is: " + mySpecies);
                System.out.println("\n myStr = " + myStr);
                /*

               /*
                System.out.println(" First element: " + myArray[0]);
                System.out.println(" Second element: " + myArray[1]);
                System.out.println(" Third item: " + myArray[2]);
                System.out.println(" Fourth element: " + myArray[3]);
                System.out.println(" Fifth item: " + myArray[4]);
                System.out.println(" Sixth item: " + myArray[5]);

                */
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }




}

