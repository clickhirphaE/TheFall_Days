

import java.util.*;
public class Fall_Days {

    public static void main(String args[]) {

        Scanner inp = new Scanner(System.in);
        Random rr = new Random();
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("red", "brown", "yellow", "Orange"));
        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("pumpkin spiced latte", "chai tea", "hot cocoa"));
        //# Variable declaration
        String user_input,choice="";
        int color_random,drinks_random;
        while (!choice.equalsIgnoreCase("No")){

            System.out.println("What's the day of today?:");
            //#Takes input from the user
            user_input = inp.nextLine();
            //# Assign the random values index on color_random and drinks_random variable
            color_random = (int)rr.nextInt(colors.size());
            drinks_random = (int)rr.nextInt(drinks.size());
            //# Display
            System.out.println("Perfect fall for " + drinks.get(drinks_random));
            System.out.println("The color of the leaves are " + colors.get(color_random));
            //# Ask for user if they want to type more days
            System.out.println("Would you like to insert another day(yes/No)");
            choice = inp.nextLine();

        }
        System.out.println(" Thank you!");
    }}